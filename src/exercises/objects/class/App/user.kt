package exercises.objects.`class`.App

import exercises.objects.enums.raceEnum.Role

class User(
    override val name: String,
    override val email: String,
    override val lastName: String,
    var role: Role
) : BaseUser(name, lastName, email) {
    override fun toString(): String {
        return "User(username='$name', email='$email', lastName='$lastName', role=$role)"
    }
}
