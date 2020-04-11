package dao;

import java.util.ArrayList;

public class LifeStyle{
	
	private ArrayList<String> lifeStyle;
	
	public LifeStyle(ArrayList<String> lifeStyle){
		this.lifeStyle = lifeStyle;
	}
	
	public String getWater() {
		return lifeStyle.get(0);
	}

	public String getCigarette() {
		if(lifeStyle.get(1).equals("yes")) {
			return " Yes";
		}
		else return " No";
	}
	
	public String getAlcohol() {
		if(lifeStyle.get(2).equals("yes")) {
			return " Yes";
		}
		else return " No";
	}
	
}
