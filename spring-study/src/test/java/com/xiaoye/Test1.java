package com.xiaoye;

import com.xiaoye.entity.Person;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * <p></p>
 *
 * @Author : ChenYao(https://blog.csdn.net/chenyao1994)
 * @Create : 2020/12/17 19:02
 */
public class Test1 {


	@Test
	public void fun(){
		Class<Person> personClass = Person.class;
		Field[] declaredFields = personClass.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field.getName()+" : "+field.getType());
		}
	}
}
