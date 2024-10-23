package com.sangkon.litetodo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sangkon.litetodo.databinding.TodoCardViewBinding


// 어댑터
class TodoAdapter : RecyclerView.Adapter<TodoAdapter.TodoHolder>() {

    val todoList: MutableList<Todo> = mutableListOf()

    // 뷰홀더
    class TodoHolder(val binding: TodoCardViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindData(todo: Todo) {
            binding.todo = todo
        }
    }

    override fun getItemCount(): Int = todoList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoHolder {

        val binding: TodoCardViewBinding =
            TodoCardViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return TodoHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoHolder, position: Int) {
        holder.bindData(todoList[position])
    }

    fun setList(list: MutableList<Todo>) {
        todoList.addAll(list)
    }
}