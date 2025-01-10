package com.ciel.kafkaClient

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.http.HttpStatus
import kotlin.random.Random
import com.ciel.kafkaClient.dto.*

@RestController
class ExampleController(
		private val exampleStringProducer: ExampleStringProducer,
		private val exampleJsonProducer: ExampleJsonProducer
) {
		@PostMapping("/test")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		fun sendTestMessage(
				@RequestBody requestBody: RequestBodyDto
		) {
				exampleStringProducer.sendStringMessage(
						message = requestBody.message
				)
				exampleJsonProducer.sendExampleDtoMessage(
						dto = ExampleDto(requestBody.message)
				)
				exampleJsonProducer.sendUserDtoMessage(
						dto = UserDto(id = Random.nextLong(0, 100), name = requestBody.message)
				)
		}
}
