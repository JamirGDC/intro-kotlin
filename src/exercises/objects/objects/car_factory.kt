package exercises.objects.objects
import exercises.objects.`class`.Brand
import exercises.objects.`class`.Car
import java.time.LocalDate

object CarFactory
{
    fun createCar(carModel : String, yearOfManufacturer : LocalDate , power : Double, brandName : Brand): Car {
        return Car(carModel, yearOfManufacturer, brandName, power )
    }
}


