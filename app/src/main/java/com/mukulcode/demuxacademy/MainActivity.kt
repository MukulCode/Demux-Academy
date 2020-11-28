package com.mukulcode.demuxacademy

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.mukulcode.demuxacademy.databinding.ActivityMainBinding
import org.eazegraph.lib.charts.PieChart
import org.eazegraph.lib.models.PieModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


//        val mPieChart = findViewById<View>(R.id.piechart) as PieChart
//
//        mPieChart.addPieSlice(PieModel("Todo", 65F, Color.parseColor("#007afe")))
//        mPieChart.addPieSlice(PieModel("Solved", 25F, Color.parseColor("#08a045")))
//        mPieChart.addPieSlice(PieModel("Attempted", 15F, Color.parseColor("#FBC233")))
//
//        mPieChart.startAnimation()
    }
}