package com.fancyliu.learningspringboot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
        batchSave();
    }

    @Test
    public void testSave() throws Exception {
        final MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("name", "Adam");
        params.add("password", "111111");
        params.add("age", "18");

        String content = mockMvc.perform(MockMvcRequestBuilders.post("/user/").params(params))
                .andReturn().getResponse().getContentAsString();
        System.out.println("test method testSave() result === " + content);
    }

    private void batchSave() {

        for (int i = 0; i < 10; i++) {
            final MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
            params.add("name", "Adam" + (i + 1));
            params.add("password", "111111");
            params.add("age", (18 + i) + "");

            try {
                String content = mockMvc.perform(MockMvcRequestBuilders.post("/user/").params(params))
                        .andReturn().getResponse().getContentAsString();
                System.out.println("result === " + content);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testGetAll() throws Exception {
        String content = mockMvc.perform(MockMvcRequestBuilders.get("/users"))
                .andReturn().getResponse().getContentAsString();
        System.out.println("test method testGetAll() result === " + content);
    }


    @Test
    public void testGet() throws Exception {
        String content = mockMvc.perform(MockMvcRequestBuilders.get("/user/1"))
                .andReturn().getResponse().getContentAsString();
        System.out.println("test method testGet() result === " + content);
    }


    @Test
    public void testUpdate() throws Exception {
        final MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("id", "aaa");
        params.add("name", "Bravo");
        params.add("password", "123456");
        params.add("age", "88");

        String content = mockMvc.perform(MockMvcRequestBuilders.put("/user").params(params))
                .andReturn().getResponse().getContentAsString();
        System.out.println("test method testUpdate() result === " + content);
    }

    @Test
    public void testUpdateName() throws Exception {
        final MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("id", "10");
        params.add("name", "Captain");

        String content = mockMvc.perform(MockMvcRequestBuilders.patch("/user/name").params(params))
                .andReturn().getResponse().getContentAsString();
        System.out.println("test method testUpdateName() result === " + content);
    }


    @Test
    public void testDelete() throws Exception {
        final MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("id", "10");

        mockMvc.perform(MockMvcRequestBuilders.delete("/user/10"))
                .andReturn();
        String content = mockMvc.perform(MockMvcRequestBuilders.get("/users"))
                .andReturn().getResponse().getContentAsString();
        System.out.println("test method testDelete() result === " + content);
    }

    @Test
    public void ex() throws Exception {
        final MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("id", "10");

        String content = mockMvc.perform(MockMvcRequestBuilders.post("/user/ex").params(params))
                .andReturn().getResponse().getContentAsString();
        System.out.println("test method testUpdate() result === " + content);
    }

}
