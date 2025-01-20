package com.ciel.kafkaClient

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.kafka.test.utils.KafkaTestUtils
import org.springframework.kafka.test.rule.EmbeddedKafkaRule
import org.springframework.kafka.test.context.EmbeddedKafka
import org.springframework.kafka.test.EmbeddedKafkaBroker

@EmbeddedKafka
@SpringBootTest
class KafkaClientApplicationTests {
	@Test
	fun someTest(broker : EmbeddedKafkaBroker) {
		// val embeddedKafka = EmbeddedKafkaRule(3, true, "topic")
		// val consumerProps = KafkaTestUtils.consumerProps("ciel", "true", broker)
		// val producerProps = KafkaTestUtils.producerProps(broker)
	}
}
