package com.example.quiz_preguntas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PreguntaAdapter(
    private val preguntas: List<String>,
    private val opcionesA: List<String>,
    private val opcionesB: List<String>,
    private val opcionesC: List<String>
) : RecyclerView.Adapter<PreguntaAdapter.PreguntaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreguntaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pregunta, parent, false)
        return PreguntaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PreguntaViewHolder, position: Int) {
        holder.preguntaTextView.text = preguntas[position]
        holder.opcionATextView.text = opcionesA[position]
        holder.opcionBTextView.text = opcionesB[position]
        holder.opcionCTextView.text = opcionesC[position]
    }

    override fun getItemCount(): Int {
        return preguntas.size
    }

    class PreguntaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val preguntaTextView: TextView = itemView.findViewById(R.id.preguntaTextView)
        val opcionATextView: TextView = itemView.findViewById(R.id.opcionATextView)
        val opcionBTextView: TextView = itemView.findViewById(R.id.opcionBTextView)
        val opcionCTextView: TextView = itemView.findViewById(R.id.opcionCTextView)
        val btnA: Button = itemView.findViewById(R.id.btnA)
        val btnB: Button = itemView.findViewById(R.id.btnB)
        val btnC: Button = itemView.findViewById(R.id.btnC)
    }
}