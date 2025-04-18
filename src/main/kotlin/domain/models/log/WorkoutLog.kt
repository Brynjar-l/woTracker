package domain.models.log

import kotlinx.datetime.LocalTime
import java.time.LocalDate

data class WorkoutLog(

    val date: LocalDate,
    val exercises: List<CompletedExercise>,

    val totalLifted: Double,
    val workoutDuration: LocalTime,

    val notes: String? = null,
)


// TODO: Add WorkoutLog Builder, also builds CompletedExercise