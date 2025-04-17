package database.tables

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.kotlin.datetime.date

object WorkoutLogsTable : IntIdTable("workout_logs") {

    val date = date("date")
    val totalKgLifted = double("total_kg_lifted")
    val timeTakenMinutes = integer("time_taken_minutes")

    val notes = varchar("notes", 512).nullable()

    val routineID = reference("routine_id", WorkoutRoutinesTable).nullable()
}