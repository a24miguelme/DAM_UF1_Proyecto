package com.example.quiz_preguntas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PreguntaActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var preguntaAdapter: PreguntaAdapter
    private val preguntas = listOf("Pregunta 1", "Pregunta 2", "Pregunta 3")
    private val opcionesA = listOf("Opción A", "Opción A", "Opción A")
    private val opcionesB = listOf("Opción B", "Opción B", "Opción B")
    private val opcionesC = listOf("Opción C", "Opción C", "Opción C")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Configurar el Adapter
        preguntaAdapter = PreguntaAdapter(preguntas, opcionesA, opcionesB, opcionesC)
        recyclerView.adapter = preguntaAdapter
    }
}