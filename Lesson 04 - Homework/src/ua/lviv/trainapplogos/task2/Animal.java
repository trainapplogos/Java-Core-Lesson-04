package ua.lviv.trainapplogos.task2;

public class Animal {
	private String name;
	private int speed;
	private int age;
	
	Animal(String name, int speed, int age) {
		this.name = name;
		this.speed = speed;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSpeed () {
		return this.speed;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Назва тварини = " + this.name + ",  Швидкість тварини = " + this.speed + " км/год, Вік тварини = " + this.age + " років  -------------------------";
	}
	
}
