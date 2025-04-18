package domain.models

data class Exercise(

    val name: String,
    val isCreatedByUser: Boolean,

    val description: String? = null,
    val recordLift: Double? = null,
    val isFavorite: Boolean = false,


    val muscleGroups: List<MuscleGroup>? = null,
)
