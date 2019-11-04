package com.fancyliu.learningspringboot;

import com.fancyliu.learningspringboot.config.CustomProperties;
import com.fancyliu.learningspringboot.config.OakProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {

    @Value("${oak.title}")
    private String title;

    @Resource
    private OakProperties properties;

    @Resource
    private CustomProperties customProperties;

    @Test
    public void single() {
        Assert.assertEquals(title, "经乱离后天恩流夜郎忆旧游书怀赠江夏韦太守良宰");
    }

    @Test
    public void multi() {
        System.out.println("author:" + properties.getAuthor());
        System.out.println("title:" + properties.getTitle());
        System.out.println("description:" + properties.getDescription());
    }

    @Test
    public void custom() {
        System.out.println("author:" + customProperties.getAuthor());
        System.out.println("blog:" + customProperties.getBlog());
        System.out.println("description:" + customProperties.getDescription());
    }

}
