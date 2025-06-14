package com.example.recyclerviewwithstring

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recyclerviewwithstring.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var nameList= listOf<String>("Mehedi","Masum","Avijit","Mehedi","Masum","Avijit")
lateinit var nameAdapter: NameAdapter
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        nameAdapter= NameAdapter()
        nameAdapter.submitList(nameList)
        binding.nameRCV.adapter=nameAdapter


    }
}