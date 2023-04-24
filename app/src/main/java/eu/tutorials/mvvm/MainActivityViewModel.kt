package eu.tutorials.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var sum = MutableLiveData<String>()
    var mathRepo=MathRepository()

    init {
        sum=mathRepo.getMathematicalSum()
    }

    fun add(etNum1:String,etNum2:String){
        mathRepo.add(etNum1,etNum2)
    }

    fun multiply(etNum1:String,etNum2:String){
        mathRepo.multiply(etNum1,etNum2)
    }
}