package database.tables

import database.TEXT
import org.jetbrains.exposed.dao.id.IntIdTable

object MuscleGroupsTable : IntIdTable("muscle_groups") {

    val name = varchar("name", TEXT.LIMIT.DEFAULT)
}