package com.example.genaichatbot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
        "anthropic.api.key=test-key-not-used"
})
class GenaiChatbotApplicationTests {

    @Test
    void contextLoads() {
        // Verifies the Spring application context starts up correctly.
        // No real Anthropic API calls are made here.
    }

}
