package exercises.arrays_and_objects

import exercises.arrays_and_objects.objects.ClassroomFactory

class ArraysAndObjects {


    val classArrayAndObjects = ClassroomFactory.createCLassWhitStudents()
    init {
        printClassRoomDetails()
        printStudentsWithA()
        printFailedAndNotProgressingStudents()
        printStudentsNeedingHelp()
        printFailedStudents()
    }

    //region Exercise 1
    private fun printClassRoomDetails() {
        println("Exercise 1: Printing all students:")

        classArrayAndObjects.forEach { classroom ->
            println("Classroom: ${classroom.name}, Teacher: ${classroom.teacher}")
            println("Students:")
            classroom.students.forEach { student ->
                println(" - ${student.name}, Age: ${student.age}, Grade: ${student.grade}")
            }
            println()
        }
    }
    //endregion

    //region Exercise 2
    private fun printStudentsWithA() {
        println("Exercise 2: Printing students whose name contains 'a':")
        classArrayAndObjects.forEach { classroom ->
            println("Class: ${classroom.name}, Profesor: ${classroom.teacher}")
            println("Students whose name contains 'a':")
            val filteredStudents = classroom.students.filter { student ->
                "a" in student.name.lowercase()
            }
            if (filteredStudents.isEmpty()) {
                println(" - No students found.")
            } else {
                filteredStudents.forEach { student ->
                    println(" - ${student.name}, Age: ${student.age}, Grade: ${student.grade}")
                }
            }
            println()
        }
    }
    //endregion

    //region Exercise 3
    private fun printFailedAndNotProgressingStudents() {
        println("Exercise 3: Printing failed students from classes that are not in progress:")
        classArrayAndObjects
            .forEach { classroom ->
                println("Classroom: ${classroom.name}, Teacher: ${classroom.teacher}")
                val failedStudents = classroom.students.filter { student -> !student.isApproved && !student.isProgressing }
                if (failedStudents.isEmpty()) {
                    println(" - No failed students found.")
                } else {
                    failedStudents.forEach { student ->
                        println(" - ${student.name}, Age: ${student.age}, Grade: ${student.grade}")
                    }
                }
                println()
            }
    }
    //endregion

    //region Exercise 4
    private fun printStudentsNeedingHelp() {
        println("Exercise 4: Printing failed students who need help from each class:")
        classArrayAndObjects
            .forEach { classroom ->
                println("Classroom: ${classroom.name}, Teacher: ${classroom.teacher}")
                val studentsNeedingHelp  = classroom.students.filter { student -> student.needHelp }
                if (studentsNeedingHelp .isEmpty()) {
                    println(" - No students needing help found")
                } else {
                    studentsNeedingHelp .forEach { student ->
                        println(" - ${student.name}, Age: ${student.age}, Grade: ${student.grade}")
                    }
                }
                println()
            }
    }
    //endregion

    //region Exercise 5
    private fun printFailedStudents() {
        println("Exercise 5: Printing failed students from all classes:")
        classArrayAndObjects
            .forEach { classroom ->
                println("Classroom: ${classroom.name}, Teacher: ${classroom.teacher}")
                val studentsNeedingHelp  = classroom.students.filter { student -> !student.isApproved }
                if (studentsNeedingHelp .isEmpty()) {
                    println(" - No failed students found.")
                } else {
                    studentsNeedingHelp .forEach { student ->
                        println(" - ${student.name}, Age: ${student.age}, Grade: ${student.grade}")
                    }
                }
                println()
            }
    }
    //endregion

}
