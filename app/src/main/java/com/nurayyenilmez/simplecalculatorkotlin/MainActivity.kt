package com.nurayyenilmez.simplecalculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.nurayyenilmez.simplecalculatorkotlin.databinding.ActivityMainBinding
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    var number1 :Int? =null
    var number2:Int?=null
    var result :Int?=null



    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)




    }

    fun sum(view: View) {
        number1= binding.number1.text.toString().toIntOrNull()
        number2=binding.number2.text.toString().toIntOrNull()


        if (number1 == null || number2 == null) {
            binding.result.text = "Error!"

        } else{
            result = number1!!+number2!!
            binding.result.text="Result:$result"
        }
    }

    fun deduct(view:View){
        number1= binding.number1.text.toString().toIntOrNull()
        number2=binding.number2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            binding.result.text = "Error!"

        } else{
            result = number1!!-number2!!
            binding.result.text="Result:$result"
        }


    }

    fun multiply(view: View){
        number1= binding.number1.text.toString().toIntOrNull()
        number2=binding.number2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            binding.result.text = "Error!"

        } else{
            result = number1!!*number2!!
            binding.result.text="Result:$result"
        }

    }

    fun divide(view: View){
        number1= binding.number1.text.toString().toIntOrNull()
        number2=binding.number2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            binding.result.text = "Error!"

        } else{
            result =number1!!/number2!!
            binding.result.text="Result:$result"
        }

    }

}