package database.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object ExercisesTable : IntIdTable("exercises") {

    val name = varchar("name", 255)

    val description = varchar("description", 255).nullable()
    val recordLift = decimal("record_lift",  10, 2).nullable()

    val isFavorite = bool("is_favorite")
    val isCreatedByUser = bool("is_created_by_user")


    // val equipmentType --> another table
    // val exerciseType --> another table
}