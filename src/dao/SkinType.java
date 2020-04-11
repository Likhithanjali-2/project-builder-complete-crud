package dao;

import java.util.ArrayList;

public class SkinType{
	private ArrayList<String> skinType;
	
	public SkinType(ArrayList<String> skinType){
		this.skinType = skinType;
	}
	
	public String getSkinType() {
		if(skinType.get(1).equals("oily"))
			return "You Have Oily Skin";
		else if(skinType.get(1).equals("dry"))
			return "You Have Dry Skin";
		else return "You Have Normal Skin";
	}
	
	public String getSmoothness() {
		boolean reply_1 = skinType.get(0).equals("smooth");
		boolean reply_3 = skinType.get(2).equals("soft");
		
		if(reply_1 && reply_3) {
			return " 80% - 100%";		
		}else if(reply_1 == true || reply_3 == true) {
			return " 50% - 80%";
		}else { 
			return " 20% -  50%";
		}
	}
	
	public String getHydration() {
		return this.getSmoothness();
	}
}
