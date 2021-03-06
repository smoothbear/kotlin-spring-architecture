package com.smoothbear.kotlin.domain.user.controller

import com.smoothbear.kotlin.domain.user.controller.dto.RegisterReq
import com.smoothbear.kotlin.domain.user.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
    private val userService: UserService
) {
    @PostMapping
    fun register(@RequestBody req: RegisterReq) {
        userService.register(req)
    }
}