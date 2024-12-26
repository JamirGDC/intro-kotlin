package exercises.objects.`class`.Animal

class Bird(
    override val name: String,
    override val species: String = "Avian",
    override val habitat: String = "Air",
    val canFly: Boolean
): Animal(name, species, habitat){
    override fun toString(): String {
        return "Bird(name='$name', canFly=$canFly)"
    }
}