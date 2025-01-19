import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class BootingTab {
	
	Freddy fr;
	Bonny bo;
	Chica ch;
	Foxy fo;
	
	public BootingTab() {
		super();
	    this.fr = new Freddy(0, 2); 
	    this.bo = new Bonny(0, 1); 
	    this.ch = new Chica(0, 1); 
	    this.fo = new Foxy(0, 3);  
	}
	

	public static void main(String[] args) {
		BootingTab an = new BootingTab(); 
//    	Freddy fr = new Freddy(0,2);
//    	Bonny bo = new Bonny(0,1);
//    	Chica ch = new Chica(0,1);
//    	Foxy fo = new Foxy(0,3);
    	
		Boolean menu1=true, menu2 = false;
		Scanner sc = new Scanner(System.in);
		int day = 0;
		while (menu1==true) {
            String input = sc.nextLine().trim();  
            
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            } else if (input.equalsIgnoreCase("start")) {
            	menu1=false;
            	menu2=true;
        		System.out.println("Type the shift day from 1 to 6 to begin. Type 7 for custom night.");
            	while (menu2==true) {
            		try {
            			
            		int input2 = sc.nextInt();
            		
                	if (input2 > 7 || input2 < 0) {
                    	System.out.println("Invalid command. Type the shift day from 1 to 6 to begin. Type 7 for custom night.");
                	} else {
                		day = input2;
                		menu2=false;
                		break;
                	}
            		
            		} catch (InputMismatchException e) {
            	        System.out.println("Invalid command. Returning back to main menu...");
            	        break;
            	    }
            	}
            	if (menu2==false) {
        		switch (day) {
        		case 1:
        			an.fr.setAct(0);
        			an.bo.setAct(5);
        			an.ch.setAct(5);
        			an.fo.setAct(0);
        			break;
        		case 2:
        			an.fr.setAct(0);
        			an.bo.setAct(6);
        			an.ch.setAct(6);
        			an.fo.setAct(4);
        			break;
        		case 3:
        			an.fr.setAct(5);
        			an.bo.setAct(8);
        			an.ch.setAct(8);
        			an.fo.setAct(5);
        			break;
        		case 4:
        			an.fr.setAct(8);
        			an.bo.setAct(10);
        			an.ch.setAct(10);
        			an.fo.setAct(8);
        			break;
        		case 5:
        			an.fr.setAct(10);
        			an.bo.setAct(12);
        			an.ch.setAct(12);
        			an.fo.setAct(10);
        			break;
        		case 6:
        			an.fr.setAct(15);
        			an.bo.setAct(15);
        			an.ch.setAct(15);
        			an.fo.setAct(15);
        			break;
        		case 7:
        			Action.custom(an);
        			break;
        		}
        		Thread thread = new Thread(new Runnable() {
        			 @Override
        			 public void run() {
        				 NightSelect.shift(an);
        			 }
        		});
        		
        		thread.start();
        		for (int i=0;i<=72;i++) {
        			Action.cicle(an);
        		}
        		thread.interrupt();
        		for (int i = 0; i<40; i++) {
        			System.out.println();
        		}
        		System.out.println("5:57AM");
        		try {
        			Thread.sleep(1000);
        		} catch (InterruptedException e) {
        			e.printStackTrace();
        		}	
        		System.out.println("5:58AM");
        		try {
        			Thread.sleep(1000);
        		} catch (InterruptedException e) {
        			e.printStackTrace();
        		}	
        		System.out.println("5:59AM");
        		try {
        			Thread.sleep(1000);
        		} catch (InterruptedException e) {
        			e.printStackTrace();
        		}	

        		System.out.println("6:00AM");
//        		win
        		System.exit(0);
            	} else {
            		BootingTab.main(args);
            	}
            } else {
                System.out.println("Invalid command. Type 'start' to begin.");
            }
		}
		
	}
	
}

