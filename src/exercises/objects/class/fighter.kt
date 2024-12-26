package exercises.objects.`class`

class Fighter(
    override val name: String,
    override var health: Double,
    override var crew: String,
    var shots: Int
) : Spaceship(name, health, crew) {

    fun shoot(): Boolean {
        return if (shots > 0) {
            shots--
            println("$name Dispara! Disparos Disponibles: $shots")
            true
        } else {
            println("$name esta fuera :(!")
            false
        }
    }
    override fun status(): String {
        return super.status() + " Tiene $shots Disparos Disponibles."
    }

}