package ru.geekbrains.kotlin_1.data

import ru.geekbrains.kotlin_1.data.model.Note

object Repository {
    val notes: List<Note>  = listOf(
            Note("My first note",
                "Kotlin is short but concise language",
                0xfff06292.toInt()),
            Note("My first note",
                "Kotlin is short but concise language",
                0xff9575cd.toInt()),
            Note("My first note",
                "Kotlin is short but concise language",
                0xff64b5f6.toInt()),
            Note("My first note",
                "Kotlin is short but concise language",
                0xff4db6ac.toInt()),
            Note("My first note",
                "Kotlin is short but concise language",
                0xffb2ff59.toInt()),
            Note("My first note",
                "Kotlin is short but concise language",
                0xffffeb3b.toInt()),
            Note("My first note",
                "Kotlin is short but concise language",
                0xffff6e40.toInt()))
}