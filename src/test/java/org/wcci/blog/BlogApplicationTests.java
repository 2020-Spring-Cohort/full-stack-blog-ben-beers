package org.wcci.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootTest
@EnableJpaRepositories(basePackages = {"org.wcci.blog"})
public class BlogApplicationTests {

    @Test
    public void contextLoads() {
    }

}
