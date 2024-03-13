package com.dgomesdev.avengers.application.web.resource.response

import com.dgomesdev.avengers.domain.avenger.Avenger
import java.util.*

data class AvengerResponse(
    val id: UUID?,
    val nick: String,
    val person: String,
    val description: String? = "",
    val history: String? = ""
) {
    companion object {
        fun from(avenger: Avenger) = AvengerResponse(
            id = avenger.id,
            nick = avenger.nick,
            person = avenger.person,
            description = avenger.description,
            history = avenger.history
        )
    }
}