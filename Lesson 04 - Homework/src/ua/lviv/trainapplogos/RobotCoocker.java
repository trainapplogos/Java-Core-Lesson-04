package ua.lviv.trainapplogos;

public class RobotCoocker extends Robot {
	private String modelName;
	private int modelYear;
	private String modelType;
	
	RobotCoocker(String modelName, int modelYear, String modelType) {
		super(modelName, modelYear, modelType);
	}
	
	RobotCoocker() {
		this.modelName = "Robot 034";
		this.modelYear = 2020;
		this.modelType = "я RobotCoocker Ц € просто готую";	
	}
	
	public void Work(String modelType) {
		super.Work(this.modelType);
	}


}
