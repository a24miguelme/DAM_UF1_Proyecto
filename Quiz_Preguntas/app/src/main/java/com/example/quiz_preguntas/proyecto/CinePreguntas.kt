package com.example.quiz_preguntas.proyecto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz_preguntas.R
import com.google.gson.Gson


class CinePreguntas : Fragment(R.layout.fragment_cine_preguntas) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cine_preguntas, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view2)

        val preguntas = cargarPreguntasDesdeJson()

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = CineAdapter(preguntas)

        return view
    }

    private fun cargarPreguntasDesdeJson(): List<Pregunta> {
        val preguntas = mutableListOf<Pregunta>()

        try {
            val inputStream = requireContext().assets.open("preguntas.json")
            val json = inputStream.bufferedReader().use { it.readText() }

            val gson = Gson()
            val data = gson.fromJson(json, Preguntas::class.java)

            val cine = data.preguntas.find { it.tema == "Cine" }
            if (cine != null) {
                preguntas.addAll(cine.preguntas)
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }

        return preguntas
    }
}