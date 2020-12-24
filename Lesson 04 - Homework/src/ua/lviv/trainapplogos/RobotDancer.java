package ua.lviv.trainapplogos;

public class RobotDancer extends Robot {
	private String modelName;
	private int modelYear;
	private String modelType;
	
	RobotDancer (String modelName, int modelYear, String modelType) {
		super(modelName, modelYear, modelType);
	}
	
	RobotDancer() {
		this.modelName = "Robot 03";
		this.modelYear = 2019;
		this.modelType = "� RobotDancer � � ������ ������";
	}
	
	public void Work(String modelType) {
		super.Work(this.modelType);
	}

}
