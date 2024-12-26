package exercises.objects.objects

import exercises.objects.`class`.Brand
import java.time.LocalDate

object BrandFactory {

    fun createNewBrand(brandName : String, createdAt : LocalDate, countryName : String) : Brand {
        return Brand("BMW", createdAt, countryName)
    }

    fun createNewBrand() : Brand
    {
        return Brand("BMW", LocalDate.of(1987, 1, 1), "Germany")
    }


}