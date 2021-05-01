package com.example.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_anasayfa.view.*
import kotlinx.android.synthetic.main.fragment_oyun_ekrani.view.*


class AnasayfaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim = inflater.inflate(R.layout.fragment_anasayfa, container, false)

        tasarim.buttonBasla.setOnClickListener {

            val kisi = Kisiler(kisi_no = 1, kisi_ad = "Mehmet")

            val gecis = AnasayfaFragmentDirections.oyunEkraniGecisi("Bakıtgül", kisi )

            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim

    }

}