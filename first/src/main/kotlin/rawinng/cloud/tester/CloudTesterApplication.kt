package rawinng.cloud.tester

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CloudTesterApplication

fun main(args: Array<String>) {
	runApplication<CloudTesterApplication>(*args)
}
