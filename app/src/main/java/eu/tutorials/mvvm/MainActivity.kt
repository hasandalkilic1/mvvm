package eu.tutorials.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import eu.tutorials.mvvm.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel:MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.mainActivityClass=this



        viewModel.sum.observe(this,{
            binding.sumOfCalculation=it
        })

    }

    fun btnAddOnClick(etNum1:String,etNum2:String){
        viewModel.add(etNum1,etNum2)
    }
    fun btnMultiplyOnClick(etNum1:String,etNum2:String){
        viewModel.multiply(etNum1,etNum2)
    }
}