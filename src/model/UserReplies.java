package model;

import java.util.ArrayList;

public class UserReplies {
	private ArrayList<String> primaryAnswers = new ArrayList<String>(); // to store answers given by the user
	private ArrayList<String> skinIssuesReply = new ArrayList<String>(); // to store skin issues given by the user
	private ArrayList<String> skinCareReply = new ArrayList<String>(); // to store skin care routines given by the user
	private ArrayList<String> skinTypeReply = new ArrayList<String>();
	private ArrayList<String> lifeStyleReply = new ArrayList<String>(); 
	
	public void setPrimaryAnswers(String answer) {
		this.primaryAnswers.add(answer);
	}
	public void setSkinIssuesReply(String answer) {
		this.skinIssuesReply.add(answer);
	}
	public void setSkinCareReply(String answer) {
		this.skinCareReply.add(answer);
	}
	public void setSkinTypeReply(String answer) {
		this.skinTypeReply.add(answer);
	}
	public void setLifeStyleReply(String answer) {
		this.lifeStyleReply.add(answer);
	}
	public ArrayList<String> getPrimaryAnswers() {
	    return primaryAnswers;
	}
	public ArrayList<String> getSkinIssuesReply() {
	    return skinIssuesReply;
	}
	public ArrayList<String> getSkinCareReply() {
	    return skinCareReply;
	}
	public ArrayList<String> getSkinTypeReply() {
	    return skinTypeReply;
	}
	public ArrayList<String> getLifeStyleReply() {
	    return lifeStyleReply;
	}

}
