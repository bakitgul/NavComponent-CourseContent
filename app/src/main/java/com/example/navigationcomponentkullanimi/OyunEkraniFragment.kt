package com.example.navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_oyun_ekrani.view.*


class OyunEkraniFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim = inflater.inflate(R.layout.fragment_oyun_ekrani, container, false)

        val bundle: OyunEkraniFragmentArgs by navArgs()

        val gelenAd = bundle.ad

        Log.e(" Gelen Ad :", gelenAd)

        val gelenNesne = bundle.nesne

        Log.e("Kişi No :", gelenNesne.kisi_no.toString())
        Log.e("Kişi Ad :", gelenNesne.kisi_ad)

        tasarim.buttonBitir.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sonucEkraniGecis)
        }

        return tasarim
    }

}