package exercises.arrays_and_objects.`class`

data class Student
    (
    val name: String,
    val age: Int,
    val grade: Double,
    )
{
    val isApproved: Boolean
        get() = grade >= 5.0

    var isProgressing: Boolean = false
        set(value) {
            field = value
            updateNeedHelp()
        }

    var needHelp: Boolean = false
        private set

    private fun updateNeedHelp() {
        needHelp = !isApproved && !isProgressing
    }
}