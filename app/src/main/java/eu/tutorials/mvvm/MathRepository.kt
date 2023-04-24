package eu.tutorials.mvvm

import androidx.lifecycle.MutableLiveData

class MathRepository {
    var mathSum = MutableLiveData<String>()

    init {
        mathSum= MutableLiveData<String>("0")
    }

    fun getMathematicalSum() : MutableLiveData<String>{
        return mathSum
    }

    fun add(etNum1:String,etNum2:String){
        mathSum.value=(etNum1.toInt()+etNum2.toInt()).toString()
    }

    fun multiply(etNum1:String,etNum2:String){
        mathSum.value=(etNum1.toInt()*etNum2.toInt()).toString()
    }
}