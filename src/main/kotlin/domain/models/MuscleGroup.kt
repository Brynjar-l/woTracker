package domain.models

enum class MuscleGroup(val id: Int) {
    CHEST(1),
    BACK(2),
    LEGS(3),
    SHOULDERS(4),
    BICEPS(5),
    TRICEPS(6),
    CORE(7);

    companion object {
        fun fromId(id: Int): MuscleGroup = entries.first { it.id == id }
        fun toId(group: MuscleGroup): Int = group.id
    }
}