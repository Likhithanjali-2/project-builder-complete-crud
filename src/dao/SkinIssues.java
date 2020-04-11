package dao;

import java.util.ArrayList;

public class SkinIssues {
	
	private ArrayList<String> skinIssues;
	private int spots;
	
	public SkinIssues(ArrayList<String> skinIssues){
		this.skinIssues = skinIssues;
	}
	
	public boolean havingSevereAcne() {
		if(!skinIssues.isEmpty() && Integer.parseInt(skinIssues.get(0))>75) return true;
		return false;
	}
	
	public String getAcne() {
		if(Integer.parseInt(skinIssues.get(0))<=75 )
			return " "+skinIssues.get(0)+"%";
		else if(Integer.parseInt(skinIssues.get(0)) > 75 )
			return " Severe acne";
		else return " No issues with acne";
	}

	public String getSpots() {
		this.spots = Integer.parseInt(skinIssues.get(1));
		if( !skinIssues.isEmpty() && spots > 15) return " 80% - 100%";
		else if(!skinIssues.isEmpty() &&  spots > 5 && spots <10) return " 20% - 50%";
		else return " 0% - 10%";
	}

}