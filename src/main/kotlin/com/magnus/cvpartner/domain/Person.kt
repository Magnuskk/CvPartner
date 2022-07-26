package com.magnus.cvpartner.domain

data class Person(
        val id: Long,
        val firstName: String,
        val lastName: String,
        val email: String,
        val phoneNumber: String,
        val age: Int,
        val available: Boolean,
        val skills: List<Skill>
)