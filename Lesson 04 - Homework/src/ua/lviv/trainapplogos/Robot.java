package ua.lviv.trainapplogos;

public class Robot {
	private String modelName;
	private int modelYear;
	private String modelType;
	
	public Robot(String modelName, int modelYear, String modelType) {
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.modelType = modelType;
	}
	
	public Robot() {
		this.modelName = "Robot 01";
		this.modelYear = 2017;
		this.modelType = "я Robot Ц € просто працюю";
	}
	
	public void Work (String modelType) {
		System.out.println(modelType);	
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public int getModelYear() {
		return modelYear;
	}
	
	public String getModelType() {
		return modelType;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public void setModelYear(int modelYear) {
		this.modelYear  = modelYear;
	}
	
	public void setModelType (String modelType) {
		this.modelType = modelType;
	}
	
	
	@Override
	public String toString() {
		return "modelName= " + this.modelName + ", modelYear= " + this.modelYear + ", robotType= " + this.modelType;
	}
}
