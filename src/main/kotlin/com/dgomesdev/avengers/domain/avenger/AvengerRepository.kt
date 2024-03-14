package com.dgomesdev.avengers.domain.avenger

import java.util.UUID

interface AvengerRepository {
    fun getAvengers(): List<Avenger>
    fun getDetails(id: UUID): Avenger?
    fun create(avenger: Avenger): Avenger
    fun update(avenger: Avenger): Avenger
    fun delete(id: UUID)
}