package com.example.quiz_preguntas.proyecto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz_preguntas.R

data class Tema(
    val tema: String,
    val preguntas: List<Pregunta>
)

data class Pregunta(
    val pregunta: String,
    val opciones: List<String>,
    val respuestaCorrecta: Int
)

data class Preguntas(val preguntas: List<Tema>)

class FutbolAdapter(private val listaPreguntas: List<Pregunta>) : RecyclerView.Adapter<FutbolAdapter.PreguntaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreguntaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pregunta_futbol, parent, false)
        return PreguntaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PreguntaViewHolder, position: Int) {
        val pregunta = listaPreguntas[position]

        holder.preguntaTextView.text = pregunta.pregunta

        holder.opcion1Button.text = pregunta.opciones[0]
        holder.opcion2Button.text = pregunta.opciones[1]
        holder.opcion3Button.text = pregunta.opciones[2]

        holder.opcion1Button.setOnClickListener {
            // Lógica para respuesta correcta
        }
        holder.opcion2Button.setOnClickListener {
            // Lógica para respuesta correcta
        }
        holder.opcion3Button.setOnClickListener {
            // Lógica para respuesta correcta
        }
    }

    override fun getItemCount(): Int {
        return listaPreguntas.size
    }

    class PreguntaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val preguntaTextView: TextView = itemView.findViewById(R.id.textPregunta)
        val opcion1Button: Button = itemView.findViewById(R.id.btnOpcion1)
        val opcion2Button: Button = itemView.findViewById(R.id.btnOpcion2)
        val opcion3Button: Button = itemView.findViewById(R.id.btnOpcion3)
    }
}