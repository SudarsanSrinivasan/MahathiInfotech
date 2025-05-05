package Lift;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		LiftServiceImpl liftServiceImpl = new LiftServiceImpl();
		int con;
		
		Map<Integer,Lift>lifts=new HashMap<>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the no of Lifts:");
		int Lifts = scanner.nextInt();
		System.out.println("Enter Lift ID's...");
		for(int i=1;i<=Lifts;i++) {
			lifts.put(i,new Lift());
		}
		System.out.println("Lifts created....");
	
		do {
			System.out.println("Choose the Lift :");
			for(int i=1;i<=Lifts;i++) {
				System.out.println(i);
			}
			System.out.println("Enter here:");
			int liftNo = scanner.nextInt();
			if(liftNo<=Lifts) {
				System.out.println("Enter the Floor:");
				int pos = scanner.nextInt();
				liftServiceImpl.move(lifts.get(liftNo), pos);
				System.out.println("\nThe Current position of the lift is "+lifts.get(liftNo).getPosition());
			}
			else {
				System.out.println("You Have Exceeded the Maximun Limit...");
			}
			System.out.println("Do you wish to Continue...? (Press 0 to Exit) (Press 1 to Lifts Statuses)");
			con=scanner.nextInt();
			if(con==0) {
				System.out.println("Exitedddd👋👋👋👋👋");
			}
			else if(con==1) {
				for(int i=1;i<=Lifts;i++) {
					System.out.println("The Current Position of the lift"+i+ " is "+lifts.get(i).getPosition());
				}
			}
		}while(con!=0);		
		scanner.close();
	}
}
