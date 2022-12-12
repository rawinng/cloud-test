package rawinng.cloud.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GatewayApp

fun main(args: Array<String>) {
	runApplication<GatewayApp>(*args)
}
