package rawinng.cloudconfigdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class CloudConfigDemoApplication

fun main(args: Array<String>) {
	runApplication<CloudConfigDemoApplication>(*args)
}
