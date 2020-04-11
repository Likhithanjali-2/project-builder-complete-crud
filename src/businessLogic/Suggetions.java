package businessLogic;

import java.util.ArrayList;

import model.UserReplies;

public class Suggetions extends AnalysisResult{
	private ArrayList<String> suggestionsList = new ArrayList<String>();
	public Suggetions(UserReplies reply) {
		super(reply);
	}

	//method to give  suggestions
	public ArrayList<String> giveSuggestions() {
		System.out.println("________________________________________________________________________________________________");
		suggestionsList.add("\n\nSuggestions For Your Problems : \n");
		
		if(smoothness.equals(" 20% -  50%")) {
			suggestionsList.add("Smoothness : 1.Exfoliate 2.Moisturise 3.Look for nourishing products 4.Stick to warm water 5.Protect your skin from the weather.");
		}
		if(hydration.equals(" 20% -  50%")) {
			suggestionsList.add("Hydration : Coconut oil is as safe and effective as petroleum jelly for treating dry skin. It was found to significantly improve skin hydration and increase the number of lipids (fats) on the surface of the skin.");
		}
		if(dryPatches.equals(" Yes")) {
			suggestionsList.add("Dry Patches : Stay hydrated and Use natural moisturizers to help relieve dry skin on the face. These include: pure aloe vera gel ,coconut oil ,shea butter");
		}
		if(wrinkles.equals(" 60% - 100%") || wrinkles.equals(" 20% - 60%")) {
			suggestionsList.add("Wrinkles : Bananas contain natural oils and vitamins that can boost skin health. Experts recommend applying banana paste to the skin: Mash a quarter of a banana until it becomes a smooth paste. Put a thin layer of the banana paste on your skin and allow it to sit for 15 to 20 minutes before rinsing it off with warm water.");
		}
		if(sagging.equals(" 50% - 100%")) {
			suggestionsList.add("Sagging : Limit your sugar ,Apply cucumber juice on face or 'Mix egg white and honey' apply on face ,and  a combination of beta carotene, which is present in many foods, and vitamin A can prevent and repair the aging of the skin.");
		}
		if(tan.equals(" 40% - 50%") || tan.equals(" 60% - 100%")) {
			suggestionsList.add("Tan : Sandalwood or Chandan is an excellent ayurvedic ingredient to remove tan. Along with eliminating tan, sandal also acts as a cure for acne, dark spots and many other skin problems.Honey and papaya face pack");
		}
		if(spots.equals(" 80% - 100%") || spots.equals(" 20% - 50%")) {
			suggestionsList.add("Spots : Mix equal quantities of apple cider vinegar and water in a bowl. Stir well and apply on the dark spots. You can also trying mix a few drops of lemon juice with the vinegar.");
		}
		if(patches.equals(" 50% - 100%")) {
			suggestionsList.add("Red Patches : Try soothing skin with a honey mask. First rinse your skin with warm water, then apply honey liberally to red skin and leave it on for about 30 minutes before rinsing off. However, don't use honey if your red skin is due to a sunburn.");
		}
		if(openpores.equals(" 50% - 80%")) {
			suggestionsList.add("Open Pores : We have read enough about the antibacterial properties of turmeric, but little has been written about its pore shrinking properties. Since turmeric reduces skin inflammation (it kills the bacteria growing inside the pores), it in turn reduces swelling around the pores. Take one teaspoon of turmeric powder and mix it with a few drops of water to form a thin paste. Now, apply the paste to your skin and leave it for ten minutes. Wash with cold water thereafter.");
		}
		if(!acne.equals(" Severe acne") && !acne.equals(" No issues with acne")) {
			suggestionsList.add("Acne : Honey has been used to treat skin conditions, such as acne, for thousands of years. It contains many antioxidants that can help to clear waste and debris from clogged pores. Doctors use honey in wound dressings because of its antibacterial and wound-healing properties. Using a clean finger or cotton pad, rub a little honey into pimples. Otherwise, add honey to a face or body mask.");
		}
		suggestionsList.add("Habits to change :\n");
		if(this.water < 3) {
			suggestionsList.add("** Drink More Water : Drinking at least 3-4 litres a day will help rid the body and skin of toxins.Consuming an adequate amount of water everyday gives you fresh, soft and glowing skin. It helps maintain the optimal body temperature, keeping the skin moist. It hydrates and replenishes the skin tissues leading to an increase in the skin's elasticity.");
		}
		if(this.cigarette.equals(" Yes")) {
			suggestionsList.add("** Don't Smoke : Cigarette smoke contains carbon monoxide, which displaces the oxygen in your skin, and nicotine, which reduces blood flow, leaving skin dry and discolored. Cigarette smoking also depletes many nutrients, including vitamin C, which helps protect and repair skin damage.");
		}
		if(this.alcohol.equals(" Yes")) {
			suggestionsList.add("** Try To Avoid : Alcohol increases the inflammation and changes the hormonal milieu in the skin, which can worsen inflammatory skin conditions, like acne and rosacea, Alcohol alters the blood vessels in the skin, causing them to dilate and worsen the appearance of facial redness.");
		}
		
		return suggestionsList;
	}
	
}
