package com.dgomesdev.avengers.resource.avenger

import com.dgomesdev.avengers.domain.avenger.Avenger
import com.dgomesdev.avengers.domain.avenger.AvengerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import java.util.*

@Component
class AvengerRepositoryImpl(
    @Autowired private val repository: AvengerEntityRepository
) : AvengerRepository {
    override fun getAvengers(): List<Avenger> = repository.findAll().map { it.toAvenger() }

    override fun getDetails(id: UUID): Avenger? = repository.findByIdOrNull(id)?.toAvenger()

    override fun create(avenger: Avenger): Avenger = repository.save(AvengerEntity.from(avenger)).toAvenger()

    override fun update(avenger: Avenger) = repository.save(AvengerEntity.from(avenger)).toAvenger()

    override fun delete(id: UUID) = repository.deleteById(id)

}