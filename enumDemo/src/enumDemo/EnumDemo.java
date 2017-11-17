package enumDemo;

import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args) {
		for (sixPaper s: sixPaper.values()) {
			System.out.println(s + ", ordinal " + s.ordinal());
		}
		
		Scanner sc =new Scanner (System.in);
		System.out.println("insert value");
		String val=sc.nextLine();
		
		sixPaper value=sixPaper.valueOf(val);
		
		
		
		
		switch(value) {
			case UNITED_STATES_NOTES:{
				System.out.println("The value is UNITED_STATES_NOTES");
				break;
			}
			case GOLD_CERTIFICATES:{
				System.out.println("the value is GOLD_CERTIFICATES");
				break;
			}
			case NATIONAL_BANK_NOTES:{
				System.out.println("the value is NATIONAL_BANK_NOTES");
				 break;
			}
			case SILVER_CERTIFICATES:{
				System.out.println("the value is SILVER_CERTIFICATES");
				break;
			}
			case FEDERAL_RESERVE_BANK_NOTES:{
				System.out.println("the value is FEDERAL_RESERVE_BANK_NOTES");
				break;
			}
			case FEDERAL_BANK_NOTES:{
				System.out.println("the value is FEDERAL_BANK_NOTES");
				break;
			}
			default : {
				System.out.println("the value doesn't exist");
			}
		}

	}

	public enum sixPaper{
		UNITED_STATES_NOTES, GOLD_CERTIFICATES, NATIONAL_BANK_NOTES, SILVER_CERTIFICATES, FEDERAL_RESERVE_BANK_NOTES, FEDERAL_BANK_NOTES
	}
}
