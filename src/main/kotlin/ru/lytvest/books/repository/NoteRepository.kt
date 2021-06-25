package ru.lytvest.books.repository

import org.springframework.data.repository.CrudRepository
import ru.lytvest.books.entity.Note

interface NoteRepository : CrudRepository<Note, Long> {

    fun findByAuthor_Name(name: String): Collection<Note>
}