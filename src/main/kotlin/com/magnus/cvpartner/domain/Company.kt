package com.magnus.cvpartner.domain

data class Company(
        val id: Long,
        val name: String,
        val requestedSkillsList: List<Skill>,
        val availableJobs: List<Job>
)
