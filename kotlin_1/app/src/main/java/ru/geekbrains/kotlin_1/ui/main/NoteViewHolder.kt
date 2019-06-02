package ru.geekbrains.kotlin_1.ui.main

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import ru.geekbrains.kotlin_1.R
import ru.geekbrains.kotlin_1.data.model.Note

class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val title = itemView.findViewById<TextView>(R.id.title)
    private val body = itemView.findViewById<TextView>(R.id.body)

    fun bind(note: Note) {
       title.text = note.title
        body.text = note.note
        itemView.setBackgroundColor(note.color)
    }
}
