package com.example.designPatterns;

import com.example.designPatterns.Singleton.SingletonA;
import com.example.designPatterns.Singleton.SingletonB;
import com.example.designPatterns.prototype.NotPrototype;
import com.example.designPatterns.prototype.Prototype;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternsApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	SingletonB singletonb1;

	@Autowired
	SingletonB singletonb2;

	@Test
	public void TestSingleton() {

		SingletonA singletonA1 = SingletonA.getInstance();
		SingletonA singletonA2 = SingletonA.getInstance();

		Assertions.assertNotNull(singletonA1);
		Assertions.assertNotNull(singletonA2);

		Assertions.assertSame(singletonA1, singletonA2);
		Assertions.assertSame(singletonb1, singletonb2);
	}

	@Autowired
	Prototype prototypeA;
	@Autowired
	Prototype prototypeB;
	@Autowired
	NotPrototype notPrototypeA;
	@Autowired
	NotPrototype notPrototypeB;

	@Test
	public void TestPrototype(){
		Assertions.assertSame(notPrototypeA,notPrototypeB);
		Assertions.assertNotSame(prototypeA,prototypeB);
	}

}
