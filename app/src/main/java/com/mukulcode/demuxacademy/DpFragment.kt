package com.mukulcode.demuxacademy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.mukulcode.demuxacademy.databinding.FragmentDpBinding
import com.mukulcode.demuxacademy.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 * Use the [DpFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DpFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentDpBinding>(inflater, R.layout.fragment_dp, container, false)
        return binding.root
    }
}