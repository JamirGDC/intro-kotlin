package exercises.objects.`class`.Animal

class Whale(
    override val name: String,
    override val species: String = "Cetacean",
    override val habitat: String = "Ocean",
    val size: String
) : Animal(name, species, habitat){
    override fun toString(): String {
        return "Whale(name='$name', size='$size')"
    }
}