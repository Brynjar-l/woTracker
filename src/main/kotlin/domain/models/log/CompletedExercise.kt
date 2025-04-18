package domain.models.log

import domain.models.Exercise


data class CompletedExercise(

    val exercise: Exercise,
    val sets: List<CompletedSet>,

    val notes: String? = null,
)

data class CompletedSet(
    val targetReps: Int,
    val targetWeight: Int,

    val actualReps: Int,
    val actualWeight: Int,
)
