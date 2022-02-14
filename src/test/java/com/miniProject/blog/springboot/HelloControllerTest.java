package com.miniProject.blog.springboot;

import com.minProject.blog.springboot.web.HelloController;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    }
