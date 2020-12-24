package ua.lviv.trainapplogos;

public class CoffeRobot extends Robot {
	private String modelName;
	private int modelYear;
	private String modelType;
	
	CoffeRobot(String modelName, int modelYear, String modelType) {
		super(modelName, modelYear, modelType);
	}
	
	CoffeRobot() {
		this.modelName = "Robot 02";
		this.modelYear = 2018;
		this.modelType = "я CoffeRobot Ц € варю каву";
	}
	
	
	public void Work(String modelType) {
		super.Work(this.modelType);
	}

}
