package ua.lviv.trainapplogos;

public class Application {
	public static void main(String[] args) {
		Robot r = new Robot();
		CoffeRobot cr = new CoffeRobot();
		RobotDancer rd = new RobotDancer();
		RobotCoocker rc = new RobotCoocker();
		Robot [] arr = new Robot [4];
		
		
		r.Work(r.getModelType());
		cr.Work(r.getModelType());
		rd.Work(r.getModelType());
		rc.Work(r.getModelType());
		
		arr[0] = r;
		arr[1] = cr;
		arr[2] = rd;
		arr[3] = rc;
		
		System.out.println("\nLoop of array Example:\n");
		
		for (int i = 0; i < 4; i++) {
			arr[i].Work(r.getModelType());
		}
		
	}
}
