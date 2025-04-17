package database.tables


import org.jetbrains.exposed.sql.Table


object LogExercisesTable : Table("log_exercises") {

    val id = integer("id")  // .autoIncrement()

    val logID = reference("log_id", WorkoutLogsTable)
    val exerciseID = reference("exercise_id", ExercisesTable)

    val orderIndex = integer("order_index")

    val notes = varchar("notes", 512).nullable()

    override val primaryKey = PrimaryKey(logID, exerciseID, id)
}