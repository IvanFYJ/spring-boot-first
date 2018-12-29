package top.fanyongjian.springdatajpa;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.fanyongjian.springdatajpa.repository.UserRepository;

import javax.validation.constraints.AssertTrue;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdatajpaApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public  void testUser(){
        //开始测试
        //assertEquals(true,userRepository.existsById("1"));
        //assertTrue(userRepository.findByUsername("fyj").size() > 0);
        assertThat(1,is(userRepository.findByUsername("fyj").size()));
    }

    @Test
    public void contextLoads() {


    }

}

