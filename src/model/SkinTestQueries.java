package model;

public class SkinTestQueries {
	private String[] primaryQueries = {"What is your name","How old are you? "}; // primary questions
	private String[] skinIssuesQueries = {"How much percentage of your skin affected by acne? ","How many spots you have on your face ? (0,2,..)"}; // skin issues acne ,blemishes ,colorAndTone
	private String[] skinCareQueries = {"How Often Do You Apply Sunscreen? (rare/oftenly/never)","Are There Any Dry Areas Or Patches On Your Face?","Do You Have Enlarged Pores? ","Do You Have A Coin Sized (Or Bigger) Red Patch On Your Face? ","How much percentage of wrinkles you have? "};
	private String[] skinTypeQueries = {"What Does Your Skin Usually Feel Like At Midday? (smooth/rough/dull)","How The Skin On Your Face Feels (oily/dry/normal)","How Rough Does Your Skin Feel To Touch After Washing Your Face? (soft/rough)"}; // queries to know skin type
	private String[] lifeStyleQueries = {"How Much Water Do You Generally Drink Everyday? (in liters)","Do You Smoke Cigarettes? ","Do You Drink Alcohol? "};

	public String[] getPrimaryQueries() {
		return this.primaryQueries;
	}
	public String[] getSkinIssuesQueries() {
		return this.skinIssuesQueries;
	}
	public String[] getSkinCareQueries() {
		return this.skinCareQueries;
	}
	public String[] getSkinTypeQueries() {
		return this.skinTypeQueries;
	}
	public String[] getLifeStyleQueries() {
		return this.lifeStyleQueries;
	}
	
}
