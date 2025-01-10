package com.ciel.kafkaClient

import org.springframework.stereotype.Component
import org.springframework.kafka.annotation.KafkaListener
import org.slf4j.LoggerFactory
import com.ciel.kafkaClient.dto.*

@Component
class ExampleConsumer {
		private val logger = LoggerFactory.getLogger(this.javaClass)
		@KafkaListener(topics = [EXAMPLE_TOPIC_NAME_TWO], groupId = GROUP_ID)
		fun secondListener(message: ExampleDto){
				logger.info("Message received: [$message]")
		}
		@KafkaListener(topics = [EXAMPLE_TOPIC_NAME_THREE], groupId = GROUP_ID)
		fun secondListener(message: UserDto){
				logger.info("Message received: [$message]")
		}
}
