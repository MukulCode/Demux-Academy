package com.mukulcode.demuxacademy

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.mukulcode.demuxacademy.databinding.FragmentHomeBinding
import org.eazegraph.lib.models.PieModel


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater, R.layout.fragment_home, container, false)

        binding.dynamicProgrammingCard.setOnClickListener { view: View ->
            Navigation.findNavController(view)
                .navigate(HomeFragmentDirections.actionHomeFragment2ToDpFragment2())
        }

        val bindingPieChart = binding.piechart
        bindingPieChart.addPieSlice(PieModel("Todo", 65F, Color.parseColor("#007afe")))
        bindingPieChart.addPieSlice(PieModel("Solved", 25F, Color.parseColor("#08a045")))
        bindingPieChart.addPieSlice(PieModel("Attempted", 15F, Color.parseColor("#FBC233")))

        bindingPieChart.startAnimation()
        return binding.root
    }
}