package com.example.SpringSimpleTest

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringSimpleTestApplicationTests(@Autowired val restTests: TestRestTemplate) {

	@Test
	fun `Czy endpoint zwraca poprawny status`() {
		val entity = restTests.getForEntity<String>("/")

		assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
	}

	@Test
	fun `Odpowiednia strona HTML`() {
		val entity = restTests.getForEntity<String>("/")

		assertThat(entity.body).contains("index")
	}

	companion object{
		val logger: Logger = LoggerFactory.getLogger("Proste testy")

		@BeforeAll
		@JvmStatic
		fun init(){
			logger.info("Tutaj zaczynają się testy, można wczytać jakieś dane itp.")
			//println("Tutaj zaczynają się testy, można wczytać jakieś dane itp.")
		}

		@AfterAll
		@JvmStatic
		fun lastFunction(){
			logger.info("Tutaj kończą się testy itp.")
		}
	}

}
