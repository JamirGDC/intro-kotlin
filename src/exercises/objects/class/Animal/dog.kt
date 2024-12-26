package exercises.objects.`class`.Animal

class Dog(
    override val name: String,
    override val species: String = "Canine",
    override val habitat: String = "Domestic",
    val breed: String
) : Animal(name, species, habitat){
    override fun toString(): String {
        return "Dog(name='$name', breed='$breed')"
    }
}