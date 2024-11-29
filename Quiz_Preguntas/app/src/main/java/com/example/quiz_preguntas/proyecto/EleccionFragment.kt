package com.example.quiz_preguntas.proyecto


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.quiz_preguntas.R


class EleccionFragment : Fragment(R.layout.fragment_eleccion) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_eleccion, container, false)
    }
}
