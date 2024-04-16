package edu.quinnipiac.ser210.tasks

data class Task(
    var taskId: Long = 0L,
    var taskName: String = "",
    var taskDone: Boolean = false
)