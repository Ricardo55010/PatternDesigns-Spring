package com.example.designPatterns;

import com.example.designPatterns.Adapter.Apple;
import com.example.designPatterns.Adapter.AppleAdapter;
import com.example.designPatterns.Adapter.MoroOrange;
import com.example.designPatterns.Adapter.Orange;
import com.example.designPatterns.Decorator.Pepperoni;
import com.example.designPatterns.Decorator.Pizza;
import com.example.designPatterns.Decorator.ThickCrustPizza;
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


	@Test
	public void TestAdapter(){
		Orange orange = new MoroOrange();
		Apple apple = new AppleAdapter(orange);
		System.out.println(apple.getVariety());
		apple.eat();
	}

	@Test
	public void TestDecorator(){
		Pizza pizza = new ThickCrustPizza();
		System.out.println(pizza.getCost());
		System.out.println(pizza.getDescription());
		Pepperoni pepperonipizza = new Pepperoni(pizza);
		System.out.println(pepperonipizza.getCost());
		System.out.println(pepperonipizza.getDescription());
		Pepperoni doblepepperonipizza = new Pepperoni(pepperonipizza);
		System.out.println(doblepepperonipizza.getCost());
		System.out.println(doblepepperonipizza.getDescription());
	}
}
