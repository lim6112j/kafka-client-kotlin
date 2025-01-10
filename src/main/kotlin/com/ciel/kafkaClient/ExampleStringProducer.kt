package com.ciel.kafkaClient

import org.springframework.stereotype.Component
import org.springframework.kafka.core.KafkaTemplate
@Component
class ExampleStringProducer(
		private val kafkaTemplate: KafkaTemplate<String, String>
) {
		fun sendStringMessage(message: String) {
				kafkaTemplate.send(EXAMPLE_TOPIC_NAME, message)
		}
}
