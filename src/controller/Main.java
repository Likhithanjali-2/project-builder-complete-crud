package controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import businessLogic.AnalysisResult;
import businessLogic.Suggetions;
import dao.*;
import model.SkinTestQueries;
import model.UserReplies;

public class Main {
	public static void pdfReport(AnalysisResult result,Suggetions suggestions,String name) {
		Document document = new Document();
	      try
	      {
	         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("SkinCareDiagnosisResult.pdf"));
	         document.open();
	         document.add(new Paragraph("SKIN CARE DIAGNOSIS REPORT : "+name));
	         for (String str : result.getAnalysisResult()) {
	        	 document.add(new Paragraph("\n"+str));
	         }
	         document.add(new Paragraph("__________________________________________________________________________\n"));
	   
	         for (String str : suggestions.giveSuggestions()) {
	        	 document.add(new Paragraph("\n"+str));
	         }
	         document.add(new Paragraph("\n\nThank you! Visit again!\n"));
	         document.close();
	         writer.close();
	      } catch (DocumentException e)
	      {
	         e.printStackTrace();
	      } catch (FileNotFoundException e)
	      {
	         e.printStackTrace();
	      }
	}
	
	public static void main(String[] args) throws SQLException, Exception {
		
		//getting queries from class SkinTestQueries
		SkinTestQueries queries = new SkinTestQueries();
		String[] primaryQueries = queries.getPrimaryQueries();
		String[] skinIssuesQueries = queries.getSkinIssuesQueries();
		String[] skinCareQueries = queries.getSkinCareQueries();
		String[] skinTypeQueries = queries.getSkinTypeQueries();
		String[] lifeStyleQueries = queries.getLifeStyleQueries();
		
		UserReplies reply = new UserReplies();
		Scanner sc = new Scanner(System.in); 
		String userReply = "";
		
		//process begins 
		System.out.println("Welcome to Skin Care Diagnosis");
		
		//--------------------------------------------
			System.out.println("\nDo you want to 'Test Your Skin' reply yes/no ");
			userReply = sc.next();sc.nextLine();
			if(userReply.equals("yes")) {
				Analysis analyse = new Analysis(primaryQueries);
				//asking the user to enter primary details
				System.out.println("Part-1 General queries");
				for(int i = 0 ;i < primaryQueries.length ; i++ ) {
					System.out.println("Query: "+analyse.getQuery(i));
					reply.setPrimaryAnswers(sc.nextLine());
				}
				String name = reply.getPrimaryAnswers().get(0);
				
				// asking for skin issues acne ,blemishes ,colorAndTone
				System.out.println("Part-2 Enter your issues with your skin  ");
				Analysis skinIssues = new Analysis(skinIssuesQueries);
				for(int i = 0 ;i < skinIssuesQueries.length ; i++ ) {
					System.out.println("Query: "+skinIssues.getQuery(i));
					reply.setSkinIssuesReply(sc.next());
				}
					
				//asking the user what are the skin care routines
				System.out.println("Part-3 Please enter your skin care routines...!");
				Analysis skinCare = new Analysis(skinCareQueries);
				for(int i = 0 ;i < skinCareQueries.length ; i++ ) {
					System.out.println("Query: "+skinCare.getQuery(i));
					reply.setSkinCareReply(sc.next());
				}
				
				//asking questions to user to know skin type
				System.out.println("Part-4 let us know about your skin type...!");
				Analysis skinType = new Analysis(skinTypeQueries);
				for(int i = 0 ;i < skinTypeQueries.length ; i++ ) {
					System.out.println("Query: "+skinType.getQuery(i));
					reply.setSkinTypeReply(sc.next());
				}
				
				//asking questions to user to know life style
				System.out.println("Part-5 Please enter your required details about your life style...!");
				Analysis lifeStyle = new Analysis(lifeStyleQueries);
				for(int i = 0 ;i < lifeStyleQueries.length ; i++ ) {
					System.out.println("Query: "+lifeStyle.getQuery(i));
					reply.setLifeStyleReply(sc.next());
				}
				
				//analyse result
				AnalysisResult result = new AnalysisResult(reply);
				//display result
				//System.out.println(result.getAnalysisResult());
				
				//Its time for suggestions
				Suggetions suggestions = new Suggetions(reply);
				
				//give pdf format to the user
				pdfReport(result,suggestions,name);
				
				//store data in database
				CrudDAO crudops = new CrudDAO(); 
				crudops.storeResult(result,name);
				
			}
			//analysis completed
			System.out.println("See the Result in PDF!....Thank you! Visit again!");
			
		//------------------------------------------------------
		sc.close();
	}
}
