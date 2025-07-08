package com.pucetec.exam2.mappers

import com.pucetec.exam2.models.entities.Cars
import com.pucetec.exam2.models.responses.CarResponse
import org.springframework.stereotype.Component


@Component
class CarMapper : BaseMapper<Cars, CarResponse> {

    override fun toResponse(entity: Car): CarrResponse {
        return CarResponse(
            id = entity.id,
            ticket = entity.ticket,
            entry = entity.entry,
            exit = entity.exit
        )
    }
}