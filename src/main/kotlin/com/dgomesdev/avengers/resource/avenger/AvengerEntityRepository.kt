package com.dgomesdev.avengers.resource.avenger

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface AvengerEntityRepository: JpaRepository<AvengerEntity, UUID>