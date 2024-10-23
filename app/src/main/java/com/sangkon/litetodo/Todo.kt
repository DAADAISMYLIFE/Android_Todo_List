package com.sangkon.litetodo

data class Todo(val id: Int = generatedId(), val date: String, val task: String) {
    companion object {
        var currentId = 0;
        fun generatedId(): Int {
            return ++currentId;
        }
    }
}