package com.xiaoye.entity;

/**
 * @Description :
 * @Author : ChenYao(https://blog.csdn.net/chenyao1994)
 * @Version : 1.0
 * @Create : 2020/11/27 16:40
 */

public class Person {
	private Integer id;
	private String name;
	private Integer age;

	/**
	 * @return the value of id
	 * @author : ChenYao
	 * Gets the value of id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id id
	 * @author : ChenYao
	 * Sets the id
	 * <p>You can use getId() to get the value of id</p>
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the value of name
	 * @author : ChenYao
	 * Gets the value of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name name
	 * @author : ChenYao
	 * Sets the name
	 * <p>You can use getName() to get the value of name</p>
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the value of age
	 * @author : ChenYao
	 * Gets the value of age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age age
	 * @author : ChenYao
	 * Sets the age
	 * <p>You can use getAge() to get the value of age</p>
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("{");
		sb.append("\"id\":")
				.append(id);
		sb.append(",\"name\":\"")
				.append(name).append('\"');
		sb.append(",\"age\":")
				.append(age);
		sb.append('}');
		return sb.toString();
	}

	public void show() {
		System.out.println("一个Person 类 show 方法");
	}

	private String hello(String name) {
		System.out.println("hello");
		return name;
	}
}

