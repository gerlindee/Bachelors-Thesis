package com.example.quizzicat.Model

import java.util.*

class MultiPlayerGame(
    val gid: String,
    val active: Boolean,
    val created_on: Date,
    val created_by: String,
    val game_pin: String
)