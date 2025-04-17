package database.tables


import org.jetbrains.exposed.sql.Table

object LogSetsTable : Table("log_sets") {

    val id = integer("id")  // .autoIncrement()

    val logExerciseID = reference("log_exercise_id", LogExercisesTable.id)

    val setNumber = integer("set_number")
    val repsCompleted = integer("reps_completed") // add original rep goal?
    val weightKg  = double("weight_kg")
    val isPersonalBest = bool("is_personal_best")

    override val primaryKey = PrimaryKey(id)
}