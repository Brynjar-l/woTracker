package database.tables

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.Table

object RoutineExercisesTable : Table("routine_exercises") {

    val routineID = reference("routine_id", WorkoutRoutinesTable)
    val exerciseID = reference("exercise_id", ExercisesTable)

    val sets = integer("sets")
    val targetReps = integer("target_reps")

    val notes = varchar("notes", 512).nullable()
    val restBetweenSetsSeconds = integer("rest_seconds_between_sets").nullable()

    val orderIndex = integer("order_index")


    override val primaryKey = PrimaryKey(routineID, exerciseID, orderIndex)
}