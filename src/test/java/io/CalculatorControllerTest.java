package io;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.web.CalculatorController;
import io.web.dto.CalculatorDTO;
import io.web.CalculatorService;
import io.web.dto.SettingDTO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = {CalculatorController.class, CalculatorService.class})
@WebAppConfiguration
@AutoConfigureMockMvc
@EnableWebMvc
@ExtendWith(SpringExtension.class)
public class CalculatorControllerTest {


    @Autowired
    private MockMvc mockMvc;

    private static ObjectMapper objectMapper;


    public static ObjectMapper newObjectMapper() {
        Jackson2ObjectMapperBuilder b = new Jackson2ObjectMapperBuilder();
        b.featuresToDisable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        b.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        b.findModulesViaServiceLoader(true);
        return b.build();
    }

    @BeforeAll
     static void setup() {
        objectMapper = newObjectMapper();
    }


    private ResultActions post(String endpoint, String json) throws Exception {
        return mockMvc.perform(MockMvcRequestBuilders.post(endpoint)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(json));
    }

    private ResultActions get(String endpoint) throws Exception {
        return mockMvc.perform(MockMvcRequestBuilders.get(endpoint)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON));
    }

    @Test
     void performValidComputationReturnAnswer() throws Exception {
        CalculatorDTO dto = CalculatorDTO.builder().input("10 + 10").isProgra(false).build();
        post("/calc", objectMapper.writeValueAsString(dto))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"answer\": \"20\"}"));
    }

    @Test
     void performInvalidComputationReturnError() throws Exception {
        CalculatorDTO dto = CalculatorDTO.builder().input("invalid input").isProgra(false).build();
        post("/calc", objectMapper.writeValueAsString(dto))
                .andExpect(status().isBadRequest());
    }

    @Test
     void performValidLogicReturnAnswer() throws Exception {
        CalculatorDTO dto = CalculatorDTO.builder().input("1234_16 and 1232_16").isProgra(true).build();
        post("/calc", objectMapper.writeValueAsString(dto))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"answer\": \"0x1230\"}"));
    }

    @Test
     void performInvalidLogicReturnError() throws Exception {
        CalculatorDTO dto = CalculatorDTO.builder().input("invalid input").isProgra(true).build();
        post("/calc", objectMapper.writeValueAsString(dto))
                .andExpect(status().isBadRequest());
    }

    @Test
     void fetchSettings() throws Exception {
        get("/settings")
                .andExpect(status().isOk());
    }

    @Test
     void modifySettings() throws Exception {
        SettingDTO settingDTO = SettingDTO.builder().useRealNotation(true).build();
        post("/settings", objectMapper.writeValueAsString(settingDTO))
                .andExpect(status().isOk());
    }

    @Test
     void modifyInvalidSettingsDoNothing() throws Exception {
        post("/settings", "{\"invalidSetting\":\"invalid input\"}")
                .andExpect(status().isOk());
    }

    @Test
     void modifyInvalidValueDoNothing() throws Exception {
        post("/settings", "{\"seed\":\"a string instead of an integer\"}")
                .andExpect(status().isBadRequest());
    }
}
