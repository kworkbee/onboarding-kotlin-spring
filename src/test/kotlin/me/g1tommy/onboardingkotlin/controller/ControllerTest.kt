package me.g1tommy.onboardingkotlin.controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest
@AutoConfigureMockMvc
internal class ControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `root에 접속하면 ok를 반환합니다`() {
        mockMvc.perform(get("/"))
            .andExpect(status().isOk)
            .andExpect(content().string("ok"))
    }
}