package exercises.objects.`class`

import java.time.LocalDate

data class Car(
    val carModel: String,
    val yearOfManufacturer: LocalDate,
    var brandName: Brand?,
    val power: Double,
)