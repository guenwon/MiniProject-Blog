package com.miniProject.blog.springboot;

import com.springboot.miniprojectblog.web.HelloController;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;


@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    }
