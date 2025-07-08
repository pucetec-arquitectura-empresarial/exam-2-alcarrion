package com.pucetec.exam2.controllers

import com.pucetec.exam2.models.requests.CarRequest
import com.pucetec.exam2.models.responses.CarResponse
import com.pucetec.exam2.services.CarServices
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
@ResquestMapping(Routes.BASE_URL + Routes.Cars)
class CarController(
    private val service: CarServices){

    @PostMapping
    fun create(@RequestBody request: CarRequest): ResponseEntity<CarResponse> =
        ResponseEntity.status(HttpStatus.CREATED).body(service.create(request))

    @GetMapping
    fun getAll(): List<CarResponse> = service.findAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<CarResponse> =
        ResponseEntity.ok(service.findById(id))

    @PutMapping
    fun update(@PathVariable id: Long, @RequestBody request: CarRequest): ResponseEntity<CarResponse> =
        ResponseEntity.ok(service.update(id, request))

    @DeleteMapping
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        service.delete(id)
        return ResponseEntity.noContent().build()
    }

}

