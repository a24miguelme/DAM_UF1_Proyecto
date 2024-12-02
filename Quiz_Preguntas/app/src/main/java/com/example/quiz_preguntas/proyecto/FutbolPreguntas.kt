package com.example.quiz_preguntas.proyecto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz_preguntas.R
import com.google.gson.Gson
import java.io.InputStreamReader





class FutbolPreguntas : Fragment(R.layout.fragment_futbol_preguntas) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_futbol_preguntas, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view1)

        val preguntas = cargarPreguntasDesdeJson()

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = FutbolAdapter(preguntas)

        return view
    }

    private fun cargarPreguntasDesdeJson(): List<Pregunta> {
        val preguntas = mutableListOf<Pregunta>()

        try {
            val inputStream = requireContext().assets.open("preguntas.json")
            val json = inputStream.bufferedReader().use { it.readText() }

            val gson = Gson()
            val data = gson.fromJson(json, Preguntas::class.java)

            val futbol = data.preguntas.find { it.tema == "Futbol" }
            if (futbol != null) {
                preguntas.addAll(futbol.preguntas)
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }

        return preguntas
    }
}