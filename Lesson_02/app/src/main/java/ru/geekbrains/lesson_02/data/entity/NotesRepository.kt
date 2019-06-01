package ru.geekbrains.lesson_02.data.entity

class NotesRepository {

    private val notes: List<Note>

    init {
        notes = listOf(
            Note {
                "1st",
                "1st text",
                0xfdfdfdfd.toInt()
            }, Note {
                "1st",
                "1st text",
                0xfdfdfdfd.toInt()
            }, Note {
                "1st",
                "1st text",
                0xfdfdfdfd.toInt()
            }, Note {
                "1st",
                "1st text",
                0xfdfdfdfd.toInt()
            }, Note {
                "1st",
                "1st text",
                0xfdfdfdfd.toInt()
            }, Note {
                "1st",
                "1st text",
                0xfdfdfdfd.toInt()
            }, Note {
                "1st",
                "1st text",
                0xfdfdfdfd.toInt()
            }
        )
    }
}