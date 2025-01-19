import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Action {
	
	public static void custom(BootingTab an) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		try {
			
		System.out.println("Enter Freddy's activity:");
		a = sc.nextInt();
		if (a<0 || a>100) {
			System.out.println("Error, inappropriate value. ");	
			throw new InputMismatchException();
		} else {
			an.fr.setAct(a);
		}
		
		System.out.println("Enter Chica's activity:");
		a = sc.nextInt();
		if (a<0 || a>100) {
			System.out.println("Error, inappropriate value. ");	
			throw new InputMismatchException();
		} else {
			an.ch.setAct(a);
		}
		
		System.out.println("Enter Bonny's activity:");
		a = sc.nextInt();
		if (a<0 || a>100) {
			System.out.println("Error, inappropriate value. ");	
			throw new InputMismatchException();
		} else {
			an.bo.setAct(a);
		}
		
		System.out.println("Enter Foxy's activity:");
		a = sc.nextInt();
		if (a<0 || a>100) {
			System.out.println("Error, inappropriate value. ");	
			throw new InputMismatchException();
		} else {
			an.fo.setAct(a);
			System.out.println(a);
		}
		
		} catch (InputMismatchException e) {
			System.out.println("Invalid command. Returning back to main menu...");
			BootingTab.main(null);
		}
	}
	
	public static void cicle(BootingTab an) {
	
		Random rn = new Random();
	
		int a = rn.nextInt(1,100);
		if (a <= an.ch.getAct() && a!=0 && an.ch.getPos()!=5) {
			an.ch.setPos(an.ch.getPos()+1);
		} else if (an.ch.getPos()==5) {
			int b = rn.nextInt(0,100);
			if (b <=20) {
				Image.chica();
				for (int i = 0; i==10; i++) {
					Image.noise();
				}
				System.exit(0);
			}
		}
	
		a = rn.nextInt(1,100);
		if (a <= an.bo.getAct() && a!=0 && an.bo.getPos()!=5) {
			an.bo.setPos(an.bo.getPos()+1);
		} else if (an.bo.getPos()==5) {
			int b = rn.nextInt(0,100);
			if (b <=20) {
				Image.bonny();
				for (int i = 0; i==10; i++) {
					Image.noise();
				}
				System.exit(0);
			}
		}

		a = rn.nextInt(1,100);
		if (a <= an.fr.getAct() && a!=0 && an.fr.getPos()!=5) {
			an.fr.setPos(an.fr.getPos()+1);
		} else if (an.fr.getPos()==5) {
			int b = rn.nextInt(0,100);
			if (b <=20) {
				Image.freddy();
				for (int i = 0; i==10; i++) {
					Image.noise();
				}
				System.exit(0);
			}
		}
	
		a = rn.nextInt(1,100);
		if (a <= an.fo.getAct()/2 && a!=0 && an.fo.getState()!=5) {
			an.fo.setState(an.fo.getState()+1);
		} else if (an.fo.getState()==5) {
			int b = rn.nextInt(0,120);
			if (b <=20) {
				Image.foxy();
				for (int i = 0; i==10; i++) {
					Image.noise();
				}
				System.exit(0);
			}
		}	
	
//		System.out.println("//////////////");
//		System.out.println("Freddy: "+an.fr.getPos());
//		System.out.println("Chica: "+an.ch.getPos());
//		System.out.println("Bonny: "+an.bo.getPos());
//		System.out.println("Foxy: "+an.fo.getState());
//		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
}
