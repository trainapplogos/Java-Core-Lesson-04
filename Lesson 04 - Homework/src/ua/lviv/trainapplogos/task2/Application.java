package ua.lviv.trainapplogos.task2;

public class Application {
	public static void main(String[] args) {
		
		Animal a = new Animal("Леопард", 20, 7);
		System.out.println("Назва тварини = " + a.getName() + ",  Швидкість тварини = " + a.getSpeed() + " км/год, Вік тварини = " + a.getAge() + " років" + " -------------------------");
		
		a.setName("Бик");
		a.setSpeed(15);
		a.setAge(8);
		
		System.out.println(a);

		a.setName("Ягуар");
		a.setSpeed(80);
		a.setAge(10);
		
		System.out.println(a);
	}
}
