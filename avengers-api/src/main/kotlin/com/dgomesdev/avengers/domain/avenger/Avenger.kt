package com.dgomesdev.avengers.domain.avenger

import java.util.UUID

data class Avenger(
    val id: UUID? = null,
    val nick: String,
    val person: String,
    val description: String?,
    val history: String?
)