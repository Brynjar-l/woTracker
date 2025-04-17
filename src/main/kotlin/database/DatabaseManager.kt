package database

import database.tables.*
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

object DatabaseManager {
    private var initialized = false
    private lateinit var db: Database

    fun db(): Database = db

    fun init(
        externalDatabase: Database? = null,
        jdbcURL: String = "jdbc:sqlite:data.db",
        driver: String = "org.sqlite.JDBC",
    ) {
        if (initialized) return

        db = externalDatabase ?: Database.connect(jdbcURL, driver)
        createTablesIfNotExists()

        initialized = true
    }


    private fun createTablesIfNotExists() = transaction {
        SchemaUtils.create(
            ExercisesTable,
            ExerciseMuscleGroupsTable,
            LogExercisesTable,
            LogSetsTable,
            MuscleGroupsTable,
            RoutineExercisesTable,
            WorkoutLogsTable,
            WorkoutRoutinesTable,
        )
    }
}
