package exercises.arrays_and_objects.objects

import exercises.arrays_and_objects.`class`.Classroom
import exercises.arrays_and_objects.`class`.Student

object ClassroomFactory {
    fun createClass(name: String, teacher: String, students: List<Student>): Classroom {
        return Classroom(name, teacher, students)
    }
    fun createCLassWhitStudents(): Array<Classroom> {
        return arrayOf(
            createClass("Math", "Teacher Gutierrez", StudentFactory.createStudents()),
            createClass("History", "Teacher Lopez", StudentFactory.createStudents())
        )
    }
}