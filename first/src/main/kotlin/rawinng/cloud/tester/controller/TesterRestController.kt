package rawinng.cloud.tester.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import rawin.da.lib.CommonResponse
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/tester")
class TesterRestController {
    @GetMapping
    @ResponseBody
    fun someHello() = Mono.just(CommonResponse.success("Hello"))
}