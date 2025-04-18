package domain.models.routine

import domain.models.Exercise


data class RoutineExercise(

    val exercise: Exercise,
    val sets: List<RoutineSet>,

    val notes: String? = null,
)

data class RoutineSet(
    val targetReps: Int,
    val targetWeight: Int,
)