package exercises.objects.`class`

open class Spaceship
    (
    open val name : String,
    open val health : Double,
    open val crew : String,

    ) {
    open fun status(): String {
        return "Nave '$name' tiene $health de Salud y pertenece a la Crew $crew."
    }
}