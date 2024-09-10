package com.example.a4th_session

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.a4th_session.R
import com.example.a4th_session.databinding.FragmentCitiesBinding
import com.example.a4th_session.CitiesFragmentDirections
import com.example.navigationapp.City
import com.example.navigationapp.CityAdapter

class CitiesFragment : Fragment(),CityAdapter.CityClickListener {

    lateinit var binding: FragmentCitiesBinding
    var cities: MutableList<City> = mutableListOf()
    lateinit var cityAdapter: CityAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentCitiesBinding.inflate(inflater,container,false)

        cities= mutableListOf(City(resources.getString(R.string.newyork),R.drawable.city1),
            City(resources.getString(R.string.ontario),R.drawable.city2),
            City(resources.getString(R.string.cairo),R.drawable.city3),
            City(resources.getString(R.string.dubai),R.drawable.city4))


        cityAdapter=CityAdapter(cities,this)

        binding.rvCities.adapter=cityAdapter

        return binding.root
    }

    override fun onCityClicked(city: City) {
        val action = CitiesFragmentDirections.actionCitiesFragment2ToCityDetailsFragment(city)
        findNavController().navigate(action)

    }
}