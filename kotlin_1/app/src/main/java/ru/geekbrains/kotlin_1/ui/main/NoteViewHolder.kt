package ru.geekbrains.kotlin_1.ui.main

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import ru.geekbrains.kotlin_1.R
import ru.geekbrains.kotlin_1.data.model.Note

class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val titleTextView = itemView.findViewById<TextView>(R.id.title)
    private val bodyTextView = itemView.findViewById<TextView>(R.id.body)

    fun bind(note: Note) {
        with (note) {
            titleTextView.text = this.title
            bodyTextView.text = this.note
            itemView.setBackgroundColor(color)
        }
    }
}
