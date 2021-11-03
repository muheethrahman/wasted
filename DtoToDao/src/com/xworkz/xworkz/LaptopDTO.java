package com.xworkz.xworkz;

public class LaptopDTO {
	private String modelName;
	private String brandName;
	private int Price;
	private String color;
	public void LaptopDTO() {
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "LaptopDTO [modelName=" + modelName + ", brandName=" + brandName + ", Price=" + Price + ", color="
				+ color + "]";
	}
	

}
