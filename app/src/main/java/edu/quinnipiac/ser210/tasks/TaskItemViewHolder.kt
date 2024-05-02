package edu.quinnipiac.ser210.tasks

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.quinnipiac.ser210.tasks.databinding.TaskItemBinding

class TaskItemViewHolder(val binding: TaskItemBinding)
    : RecyclerView.ViewHolder(binding.root) {
    fun inflateFrom(parent: ViewGroup): TaskItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = TaskItemBinding.inflate(layoutInflater, parent, false)
        return TaskItemViewHolder(binding)
    }

    fun bind(item: Task) {
        binding.task = item
    }
}