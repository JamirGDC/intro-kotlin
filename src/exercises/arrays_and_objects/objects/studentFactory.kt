package exercises.arrays_and_objects.objects

import exercises.arrays_and_objects.`class`.Student

object studentFactory {

    fun createStudent(name: String, age: Int, gradle: Double): Student {
        return Student(name, age, gradle)
    }
    fun createStudents(): List<Student> {
        return listOf(
            Student("Juan", 15, 8.5),
            Student("Ana", 14, 9.0),
            Student("Luis", 15, 7.8),
            Student("Maria", 14, 3.2),
            Student("Carlos", 15, 6.9),
            Student("Lucia", 14, 9.5),
            Student("Jorge", 15, 4.4),
            Student("Sofia", 14, 8.8),
            Student("Miguel", 15, 7.6),
            Student("Elena", 14, 4.1)
        )
    }
}