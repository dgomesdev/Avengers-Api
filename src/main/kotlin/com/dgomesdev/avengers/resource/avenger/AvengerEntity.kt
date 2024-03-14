package com.dgomesdev.avengers.resource.avenger

import com.dgomesdev.avengers.domain.avenger.Avenger
import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "avenger")
data class AvengerEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID?,
    @Column(nullable = false)
    val nick: String,
    @Column(nullable = false)
    val person: String,
    val description: String?,
    val history: String?,
) {
    fun toAvenger() = Avenger(
        id,
        nick,
        person,
        description,
        history
    )

    companion object {
        fun from(avenger: Avenger) = AvengerEntity(
            avenger.id,
            avenger.nick,
            avenger.person,
            avenger.description,
            avenger.history
        )
    }
}
