package com.example.demo.controller

import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.Producer
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.common.serialization.StringSerializer
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
@RequestMapping("/in")
class InController{

    @PostMapping("/publish")
    fun publish(@RequestBody event: Event):ResponseEntity<Event>{
        val producer = createProducer()
        producer.send(ProducerRecord("vaibhav",event.id,event.name))
        return ResponseEntity.ok(event)
    }

    private fun createProducer(): Producer<String, String> {
        val props = Properties()
        props["bootstrap.servers"] = "localhost:9092,localhost:9093,localhost:9094"
        props["key.serializer"] = StringSerializer::class.java
        props["value.serializer"] = StringSerializer::class.java
        return KafkaProducer(props)
    }
}

data class Event(
    val id : String,
    val name: String
)