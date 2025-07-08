package com.pucetec.exam2.services

import com.pucetec.exam2.models.requests.CarRequest
import com.pucetec.exam2.models.responses.CarResponse
import com.pucetec.exam2.repositories.CarRepository
import com.pucetec.exam2.repositories.FloorRepository
import org.springframework.stereotype.Service

@Service

class CarServices(
    private val carRepository: CarRepository,
    private val floorRepository: FloorRepository
){
    fun create(request: CarRequest): CarResponse {
        val med = CarMapper.toEntity(request)
        return CarMapper.toResponse(CarRepository.save(med))
    }

    fun findAll(): List<CarResponse> =
        carMapper.toResponseList(carRepository.findAll())

    fun findById(id: Long): carResponse =
        carMapper.toResponse(
            carRepository.findById(id).orElseThrow {
                ResourceNotFoundException("Carro con ticker $id no encontrado")
            }
        )
}

