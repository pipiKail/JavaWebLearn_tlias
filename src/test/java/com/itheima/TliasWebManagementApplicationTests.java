package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class TliasWebManagementApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testUUID(){
        for (int i = 0; i < 100; i++) {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
        }
    }
}
