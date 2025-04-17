package database.tables

import org.jetbrains.exposed.sql.ReferenceOption
import org.jetbrains.exposed.sql.Table

object ExerciseMuscleGroupsTable : Table("exercise_muscle_groups") {

    val exerciseID = reference("exercise_id", ExercisesTable, onDelete = ReferenceOption.CASCADE)
    val muscleGroupID = reference("muscle_group_id", MuscleGroupsTable, onDelete = ReferenceOption.CASCADE)

    override val primaryKey = PrimaryKey(exerciseID, muscleGroupID)
}