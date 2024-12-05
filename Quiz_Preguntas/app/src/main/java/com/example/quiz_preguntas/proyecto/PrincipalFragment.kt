package com.example.quiz_preguntas.proyecto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.quiz_preguntas.R

class PrincipalFragment:Fragment(R.layout.fragment_principal) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_principal, container, false)
        val btnTema = view.findViewById<Button>(R.id.botonComenzar)


        btnTema.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_principal_to_eleccionFragment)
        }
        return  view

    }
}