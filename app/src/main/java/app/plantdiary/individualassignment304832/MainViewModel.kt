package app.plantdiary.individualassignment304832

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.plantdiary.individualassignment304832.dto.Country
import app.plantdiary.individualassignment304832.service.CountryService


class MainViewModel : ViewModel() {
    var countries: MutableLiveData<ArrayList<Country>> = MutableLiveData<ArrayList<Country>>()
    var countryService: CountryService = CountryService()

    init {
        fetchCountries()
    }

    fun fetchCountries() {
        countries = countryService.fetchCountries("Zambia")
    }
}