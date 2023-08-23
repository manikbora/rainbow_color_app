package com.manikbora.rainbowcolorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.manikbora.rainbowcolorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var selectedColor: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.colorSp.prompt = "Select Color"
        binding.showColorBtn.setOnClickListener {
            selectedColor = binding.colorSp.selectedItem.toString()
            binding.yourColorNameTv.text = getString(R.string.your_color_text, selectedColor)
            setColor(selectedColor)
        }

    }

    private fun setColor(selectedColor: String) {
        binding.apply {
            when(selectedColor) {
                "Violet" -> colorBoxTv.setBackgroundResource(R.color.Violet)
                "Indigo" -> colorBoxTv.setBackgroundResource(R.color.Indigo)
                "Blue" -> colorBoxTv.setBackgroundResource(R.color.Blue)
                "Green" -> colorBoxTv.setBackgroundResource(R.color.Green)
                "Yellow" -> colorBoxTv.setBackgroundResource(R.color.Yellow)
                "Orange" -> colorBoxTv.setBackgroundResource(R.color.Orange)
                "Red" -> colorBoxTv.setBackgroundResource(R.color.Red)
            }
        }
    }
}