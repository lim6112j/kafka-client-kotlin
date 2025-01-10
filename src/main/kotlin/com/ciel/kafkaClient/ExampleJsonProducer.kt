package com.ciel.kafkaClient

import org.springframework.stereotype.Component
import org.springframework.kafka.core.KafkaTemplate
import com.ciel.kafkaClient.dto.*
@Component
class ExampleJsonProducer(
		private val exampleDtoKafkaTemplate: KafkaTemplate<String, ExampleDto>,
		private val userDtoKafkaTemplate: KafkaTemplate<String, UserDto>
) {
		fun sendExampleDtoMessage(dto: ExampleDto) {
				exampleDtoKafkaTemplate.send(EXAMPLE_TOPIC_NAME_TWO, dto)
		}
		fun sendUserDtoMessage(dto: UserDto){
				userDtoKafkaTemplate.send(EXAMPLE_TOPIC_NAME_THREE, dto)
		}
}
