package com.pucetec.exam2.models.entities

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "parking")
data class Parking(
    var number: Int,
    var level: String,

    ) : BaseEntity()