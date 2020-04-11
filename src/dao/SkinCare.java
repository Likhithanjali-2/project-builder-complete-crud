package dao;

import java.util.ArrayList;

public class SkinCare {
	
	private ArrayList<String> skinCare;
	private int percentage;
	public SkinCare(ArrayList<String> skinCare){
		this.skinCare = skinCare;
	}
	
	public String getDryPatches() {
		if(skinCare.get(1).equals("yes")) {
			return " Yes";
		}
		else return " No";
	}

	public String getWrinkles(int age) {
		this.percentage = Integer.parseInt(skinCare.get(4));
		if(percentage > 0 && age > 60) return " (Wrinkles are common in your age)";
		else if(percentage > 0 && age < 40) return " 20% - 60%";
		else return " 60% - 100%";
	}

	public String getSagging() {
		if(percentage > 20 && percentage <50) return " 20% - 50%";
		else if(percentage>50)return " 50% - 80%";
		else return " No";
	
	}
	
	public String getTan() {
		String tan = skinCare.get(0);
		if(tan.equals("rare")) return " 40% - 50%";
		if(tan.equals("oftenly")) return " 0% (not effected)";
		return " 60% - 100%";
	}
	
	public String getPatche() {
		String patches = skinCare.get(4);
		if(patches.equals("yes"))
			return " 50% - 100%";
		else return " 0%";
	}
	
	public String getOpenPores() {
		String openpores = skinCare.get(2);
		if(openpores.equals("yes"))
			return " 50% - 80%";
		else return " 0% - 20%";
	}
	
}
