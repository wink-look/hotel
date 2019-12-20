package com.cy.pj.test;

import java.util.UUID;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimpleHashTest {
	
	@Test
	public void testSimpleHash() {
		//設置需要加密的字符串
		String password = "abcd123465";
		//2.設置盐
		String salt=UUID.randomUUID().toString();
		SimpleHash sh = new SimpleHash("MD5", password, salt, 1);
		
		String newpassword = sh.toHex();
		System.out.println(newpassword);
		//3.使用shimplehash进行加密
		
	}
}
