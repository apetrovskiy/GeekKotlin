package ru.geekbrains.lesson_02.ui.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.geekbrains.lesson_02.R
import ru.geekbrains.lesson_02.data.entity.Note

class NotesRVAdapter : RecyclerView.Adapter<NotesRVAdapter.ViewHolder>() {
    override fun getItemCount() = notes.size

    override fun onBindViewHolder(vh: NotesRVAdapter.ViewHolder, pos: Int) = vh.bind()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesRVAdapter.ViewHolder =
            RecyclerView.ViewHolder {
                LayoutInflater.from(parent.context).inflate(
                    R.layout.item_note,
                    parent,
                    false
                )
            }

    var note: List<Note> = listOf()
        set(value) {
            field = value
        }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(note: Note) = with(itemView){
            tv_title.text = note.title
            tv_text.text = note.text
        }
    }
}