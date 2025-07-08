package com.pucetec.exam2.repositories


import com.pucetec.exam2.models.entities.Cars
import org.springframework.data.jpa.repository.JpaRepository

interface CarRepository : JpaRepository<Cars, Long>