package com.busrayalcin.pearlsofistanbulkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.busrayalcin.pearlsofistanbulkotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val selectedLandMarks = intent.getSerializableExtra("landmark") as LandMarks

        binding.nameText.text = selectedLandMarks.name
        binding.imageView.setImageResource(selectedLandMarks.image)

    }
}