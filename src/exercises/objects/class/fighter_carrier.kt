package exercises.objects.`class`

class FighterCarrier(
    override val name: String,
    override var health: Double,
    override var crew: String,
    var fighters: Int,
    var shots: Int
) : Spaceship(name, health, crew) {

    fun launchFighter(): Boolean {
        return if (fighters > 0) {
            fighters--
            println("$name Caza Lanzado! Cazas Disponibles: $fighters")
            true
        } else {
            println("$name no hay cazas que lanzar!")
            false
        }
    }

    fun shoot(): Boolean {
        return if (shots > 0) {
            shots--
            println("$name Dispara! Disparos disponibles: $shots")
            true
        } else {
            println("$name esta fuera!")
            false
        }
    }

    override fun status(): String {
        return super.status() + " Tiene $fighters Cazas y $shots disparos disponibles."
    }
}
