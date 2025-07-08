package com.pucetec.exam2.models.entities

import jakarta.persistence.Entity
import jakarta.persistence.Table
@Entity
@Table(name = "floors")
data class Floors(
    var spot: String,
    var level: String,
    var capacity: String,

    ) : BaseEntity()