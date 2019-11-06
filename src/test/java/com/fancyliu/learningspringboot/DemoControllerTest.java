package com.fancyliu.learningspringboot;

import com.fancyliu.learningspringboot.controller.DemoController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
public class DemoControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new DemoController()).build();
    }

    @Test
    public void getUser() throws Exception {
        String responseString = mockMvc.perform(MockMvcRequestBuilders.get("/getUser"))
                .andReturn().getResponse().getContentAsString();
        System.out.println("result : " + responseString);
    }

    @Test
    public void getUsers() throws Exception {
        String responseString = mockMvc.perform(MockMvcRequestBuilders.post("/getUsers"))
                .andReturn().getResponse().getContentAsString();
        System.out.println("result : " + responseString);
    }

    @Test
    public void saveUser() throws Exception {
        String responseString = mockMvc.perform(MockMvcRequestBuilders.post("/saveUser")
        .param("name", "")
        .param("age", "777")
        .param("password","123"))
                .andReturn().getResponse().getContentAsString();
        System.out.println("result : " + responseString);
    }

}
