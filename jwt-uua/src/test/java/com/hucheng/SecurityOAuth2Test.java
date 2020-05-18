package com.hucheng;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author HuChan
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SecurityOAuth2Test {
    @Test
    public void testBcrypt() {
        //对密码进行加密
        String hashpw = BCrypt.hashpw("123", BCrypt.gensalt());
        System.out.println(hashpw);
//        System.out.println(hashpw);
//
//        boolean checkpw = BCrypt.checkpw("123", "$2a$10$ypjevvatJ/rYhUaRNvLn..UPlxWNUXv9./lk0t4who5vnMwyPAnVq");
//        boolean checkpw2 = BCrypt.checkpw("123", "$2a$10$HuClcUqr/FSLmzSsp9SHqe7D51Keu1sAL7tUAAcb..FyILiLdFKYy");
    }
}
