package io;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest(classes = {CalculatorController.class, CalculatorService.class})
@WebAppConfiguration
@AutoConfigureMockMvc
@EnableWebMvc
@ExtendWith(SpringExtension.class)
public class CalculatorControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void performValidComputationReturnAnswer() throws Exception {

        mockMvc.perform(post("/calc")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content("{\"input\": \"10 + 10\"}"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"answer\": \"20\"}"));
    }

    @Test
    public void performInvalidComputationReturnError() throws Exception {

        CalculatorDTO calculatorDTO = CalculatorDTO
                .builder()
                .input("invalid")
                .build();

        mockMvc.perform(
                post("/calc")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .content("{\"input\":\"invalid\"}")
        )
                .andExpect(status().isBadRequest())
                .andExpect(content().json("{\"status\" : 400, \"message\" : \"An unexpected error has occurred.\\nPlease contact the maintainers of this application with the step to get this error.\"}"));
    }
}
