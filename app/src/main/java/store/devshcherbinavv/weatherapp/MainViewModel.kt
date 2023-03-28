package store.devshcherbinavv.weatherapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import store.devshcherbinavv.weatherapp.adapters.WeatherModel

class MainViewModel: ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}