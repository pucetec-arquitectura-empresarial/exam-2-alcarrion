package com.pucetec.exam2.mappers

interface BaseMapper<E, R> {
    fun toResponse(entity: E): R
    fun toResponseList(entities: List<E>): List<R> =
        entities.map { toResponse(it) }
}
