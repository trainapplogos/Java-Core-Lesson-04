package ua.lviv.trainapplogos.task2;

public class Application {
	public static void main(String[] args) {
		
		Animal a = new Animal("�������", 20, 7);
		System.out.println("����� ������� = " + a.getName() + ",  �������� ������� = " + a.getSpeed() + " ��/���, ³� ������� = " + a.getAge() + " ����" + " -------------------------");
		
		a.setName("���");
		a.setSpeed(15);
		a.setAge(8);
		
		System.out.println(a);

		a.setName("�����");
		a.setSpeed(80);
		a.setAge(10);
		
		System.out.println(a);
	}
}
