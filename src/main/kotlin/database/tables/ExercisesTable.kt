package database.tables

import database.DECIMAL
import database.TEXT
import org.jetbrains.exposed.dao.id.IntIdTable

object ExercisesTable : IntIdTable("exercises") {

    val name = varchar("name", TEXT.LIMIT.DEFAULT)

    val description = varchar("description", TEXT.LIMIT.DEFAULT).nullable()
    val recordLift = decimal("record_lift",  DECIMAL.PRECISION.DEFAULT, DECIMAL.SCALE.DEFAULT).nullable()

    val isFavorite = bool("is_favorite")
    val isCreatedByUser = bool("is_created_by_user")


    // val equipmentType --> another table
    // val exerciseType --> another table
}