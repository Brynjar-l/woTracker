package database.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object WorkoutRoutinesTable : IntIdTable("workout_routines") {

    val name = varchar("name", 255)
    val description = varchar("description", 512).nullable()
    val isFavorite = bool("is_favorite")
}