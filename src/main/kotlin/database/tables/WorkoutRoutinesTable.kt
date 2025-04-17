package database.tables

import database.TEXT
import org.jetbrains.exposed.dao.id.IntIdTable

object WorkoutRoutinesTable : IntIdTable("workout_routines") {

    val name = varchar("name", TEXT.LIMIT.DEFAULT)
    val description = varchar("description", TEXT.LIMIT.DOUBLE).nullable()
    val isFavorite = bool("is_favorite")
}