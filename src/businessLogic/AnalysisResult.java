package businessLogic;

import java.util.ArrayList;

import dao.*;
import model.UserReplies;

public class AnalysisResult {

	protected int age , water;
	protected String skinType ,smoothness ,hydration ,dryPatches ,wrinkles ,sagging , tan ,spots ,patches ,openpores ,acne,cigarette, alcohol;
	protected boolean severeAcne;
	private ArrayList<String> analysisResult = new ArrayList<String>();
	private ArrayList<String> store = new ArrayList<String>();
	
	public AnalysisResult(UserReplies reply) {
		
		// create object and intialize variables by calling methods from the classes
		SkinIssues si = new SkinIssues(reply.getSkinIssuesReply());
		this.severeAcne = si.havingSevereAcne(); 
		this.spots = si.getSpots();
		this.acne = si.getAcne();
		
		SkinType st = new SkinType(reply.getSkinTypeReply());
		this.skinType = st.getSkinType();
		this.smoothness = st.getSmoothness();
		this.hydration = st.getHydration();
		
		this.age = Integer.parseInt(reply.getPrimaryAnswers().get(1));
		SkinCare sc = new SkinCare(reply.getSkinCareReply());
		this.dryPatches = sc.getDryPatches();
		this.wrinkles = sc.getWrinkles(age);
		this.sagging = sc.getSagging();
		this.tan = sc.getTan();
		this.patches = sc.getPatche();
		this.openpores = sc.getOpenPores();
		
		//lifestyle habits
		LifeStyle ls = new LifeStyle(reply.getLifeStyleReply());
		this.cigarette = ls.getCigarette();
		this.alcohol = ls.getAlcohol();
		this.water = Integer.parseInt(ls.getWater());
		
	}	

	public ArrayList<String> getAnalysisResult(){
		analysisResult.add("Analysis result :");
		if(severeAcne) {
			analysisResult.add("*****Your skin exhibits severe acne, for which we recommend you see a dermatologist in person. In such an instance, we do not recommend a daily skincare routine until after you have addressed your acne. However, the following is your skin analysis.*****");
			//System.out.println("_____________________________________________________________________________");
		}
		
		//display skin type 
		analysisResult.add("Skin Type :"+skinType); 
		
		//display skin report
		analysisResult.add("1.epidermal health :\n"+
				"          Smoothness---" +smoothness+"\n"+
				"          Hydration-------" +hydration+"\n"+
				"          Dry Patches----" +dryPatches+"\n"+
				"2.Skin Support :\n"+
				"          Wrinkles---------" +wrinkles+"\n"+
				"          Sagging----------" +sagging+"\n"+
				"3.Pigmentation :\n"+
				"          Tan----------------" +tan+"\n"+
				"          Spots-------------" +spots+"\n"+
				"          Patches----------" +patches+"\n"+
				"4.Texture :\n"+
				"          Open Pores-----" +openpores+ "\n"+
				"          Acne--------------" +acne);
		
		return analysisResult;
	}
	
	public ArrayList<String> storeResult(){
		store.add(smoothness);
		store.add(hydration);
		store.add(dryPatches);
		store.add(wrinkles);
		store.add(sagging);
		store.add(tan);
		store.add(spots);
		store.add(patches);
		store.add(openpores);
		store.add(acne);
		return store;
	}
	
}



//public void displayResult() {
//	
//	//displaying result 
//	
//	System.out.println("\n\nAnalysis result :");
//	System.out.println("_____________________________________________________________________________");
//	
//	//check if User have severe acne ... if yes then suggests that consult a dermatologist
//	if(severeAcne) {
//		
//		System.out.println("| Your skin exhibits severe acne, for which we recommend you see a dermatologist in person.\n| In such an instance, we do not recommend a daily skincare routine until after you have addressed your acne.\n| However, the following is your skin analysis.");
//		System.out.println("_____________________________________________________________________________");
//	}
//	
//	//display skin type 
//	System.out.println("Skin Type :"+skinType); 
//	
//	//display skin report
//	System.out.println("\n1.epidermal health :\n" + 
//			"	smoothness -->" +smoothness+ "\n" + 
//			"	hydration  -->" +hydration+ "\n" + 
//			"	dry patches-->" +dryPatches+ "\n" + 
//			"2.skin support :\n" + 
//			"	wrinkles   -->" +wrinkles+ "\n" + 
//			"	sagging    -->" +sagging+  "\n" + 
//			"3.pigmentation :\n" + 
//			"	tan        -->" +tan+ "\n" + 
//			"	spots      -->" +spots+ "\n" + 
//			"	patches    -->" +patches+"\n" + 
//			"4.texture :\r\n" + 
//			"	openpores  -->" +openpores+ "\n" + 
//			"	acne       -->" +acne+ "\n" + 
//			"");
//	
//	
//}
