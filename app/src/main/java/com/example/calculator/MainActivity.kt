package com.example.calculator

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private val myTag = "myTag"

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heighScreen = resources.displayMetrics.heightPixels
        val widthScreen = resources.displayMetrics.widthPixels

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        getDisplayMetrics(heighScreen, widthScreen)

        setImageSize(heighScreen, widthScreen)
    }

    private fun setImageSize(heighScreen: Int, widthScreen: Int)
    {
    }

    private fun getDisplayMetrics(_heighScreen: Int, _widthScreen: Int)
    {
        Log.d(myTag, "heighScreen = $_heighScreen")
        Log.d(myTag, "widthScreen = $_widthScreen")
    }
}