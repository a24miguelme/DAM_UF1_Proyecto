package com.example.quiz_preguntas.proyecto


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.quiz_preguntas.R


class EleccionFragment : Fragment(R.layout.fragment_eleccion) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_eleccion, container, false)

        val botonFutbol = view.findViewById<Button>(R.id.botonEleccion1)

        botonFutbol.setOnClickListener {

            findNavController().navigate(R.id.action_eleccionFragment_to_preguntasFragment)
        }

        val botonCine = view.findViewById<Button>(R.id.botonEleccion2)

        botonCine.setOnClickListener {

            findNavController().navigate(R.id.action_eleccionFragment_to_cinePreguntas)
        }
        val botonArte = view.findViewById<Button>(R.id.botonEleccion3)

        botonArte.setOnClickListener {

            findNavController().navigate(R.id.action_eleccionFragment_to_artePreguntas)
        }
        val botonGeografia = view.findViewById<Button>(R.id.botonEleccion4)

        botonGeografia.setOnClickListener {

            findNavController().navigate(R.id.action_eleccionFragment_to_geografiaPreguntasPreguntas2)
        }

        return view
    }
}
