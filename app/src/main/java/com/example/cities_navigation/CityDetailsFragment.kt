package com.example.a4th_session

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.a4th_session.databinding.FragmentCityDetailsBinding
import com.example.a4th_session.CityDetailsFragmentArgs
import com.example.navigationapp.City


class CityDetailsFragment : Fragment() {


    lateinit var binding: FragmentCityDetailsBinding
    private val args: CityDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentCityDetailsBinding.inflate(inflater,container,false)

        val city = args.City

        binding.ivCity.setImageResource(city.imageId)
        binding.tvName.text=city.title

        return binding.root
    }
}