package top.fanyongjian.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import top.fanyongjian.springdatajpa.tools.SimpleJpaRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(value = "top.fanyongjian.springdatajpa.repository",repositoryBaseClass = SimpleJpaRepositoryImpl.class)//指定仓库的扫描路径
public class SpringdatajpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdatajpaApplication.class, args);
    }

}

