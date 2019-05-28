package ru.geekbrains.lesson_03.data.provider

class FireStoreProvider : RemoteDataProvider {
    companion object {
        private const val NOTES_COLLECTION = "notes"
    }

    private val store = FirebaseFirestore.getInstance()
    private val notesReference = store.collection(NOTES_COLLECTION)

    override fun subscribeToAllNotes(): LiveData<NoteResult> {
        val result = NutableLiveData<NoteResult>()
        notesReference.addSnapshotListener { snapshot, e ->
            if (e != null){
                result.value = NoreTesult.Error(e)
            } else i (snapshot != null) {
                val notes = mutableListOf<Note>()

                for (doc: QueryDocumentSnapshot in snapshot) {
                    notes.add(doc.toObject(Note::class.java))
                }
                result.value = NoteResult.Success(notes)
            }
        }
        return result
    }

    override fun getNoteById(id: String): LiveData<NoteResult> {
        val result =
    }
}