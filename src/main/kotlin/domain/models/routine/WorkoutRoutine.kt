package domain.models.routine


data class WorkoutRoutine(

    val name: String,
    val exercises: MutableList<RoutineExercise>,

    val isFavorite: Boolean = false,
    val description: String? = null,
)

