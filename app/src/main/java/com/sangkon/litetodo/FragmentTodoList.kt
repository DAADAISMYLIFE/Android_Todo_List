package com.sangkon.litetodo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.sangkon.litetodo.databinding.FragmentTodoListBinding

class FragmentTodoList : Fragment() {

    private lateinit var binding: FragmentTodoListBinding;
    private val list: MutableList<Todo> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // 임시 데이터
        list.add(Todo(date = "2024/10/23", task = "task1"))
        list.add(Todo(date = "2024/10/23", task = "task2"))
        list.add(Todo(date = "2024/10/23", task = "task3"))

        binding = FragmentTodoListBinding.inflate(inflater, container, false);
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.todoList.layoutManager = LinearLayoutManager(requireContext())
        // 어댑터
        val todoAdapter = TodoAdapter()
        todoAdapter.setList(list)
        binding.todoList.adapter = todoAdapter
    }

}