package me.g1tommy.onboardingkotlin.controller;

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class Controller {

    @GetMapping
    fun main(): ResponseEntity<String> {
        return ResponseEntity.ok("ok")
    }
}
