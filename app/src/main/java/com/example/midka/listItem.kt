package com.example.midka

import java.time.Duration

class listItem {
    private val id: Int
    private val title: String
    private val description: String
    private val status: String
    private val category: String
    private val duration: String
    constructor(
        id: Int,
        title: String,
        description: String,
        status: String,
        category: String,
        duration: String

    ) {
        this.id=id
        this.title= title
        this.description= description
        this.status= status
        this.category = category
        this.duration=duration
    }
    fun getId(): Int= id
    fun getTitle(): String= title
    fun getDescription(): String = description
    fun getStatus(): String = status
    fun getCategory(): String= category
    fun getDuration(): String= duration
}
