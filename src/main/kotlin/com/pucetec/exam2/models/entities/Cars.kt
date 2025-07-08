package com.pucetec.exam2.models.entities

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "cars")
data class Cars(
    var ticket: String,
    var entry: String,
    var exit: String,

) : BaseEntity()
