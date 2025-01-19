import java.util.Scanner;

public class NightSelect {

	public static void shift(BootingTab an) {
		
		Scanner sc = new Scanner(System.in);
		boolean shift = true;
		
		Main.startTimer();
		commands.timeCheck();
		Image.office();
		int pow = 100;
		while (shift == true) {
			if (pow <= 0) {
				pow = 0;
				String off = sc.nextLine();
				Image.black();
				if (off.equalsIgnoreCase("check l")) {
					Image.black();
				} else if (off.equalsIgnoreCase("check r")) {
					Image.black();
				} else if (off.equalsIgnoreCase("power")) {
					System.out.println("Power seems off..");
					Image.black();
				} else {
	                System.out.println("Only the darkness is what's left.");
					Image.black(); 
	            	}

			} else {
			String com = sc.nextLine();
			if (com.equalsIgnoreCase("check l")) {
				if (an.bo.getPos()==5) {
					Image.leftBn();
				} else if (an.fo.getState()==5){
					Image.leftFo();
				} else {
					Image.left();
				}
				
            } else if (com.equalsIgnoreCase("check r")) {
            	if (an.fr.getPos()==5) {
					Image.rightFr();
				} else if (an.ch.getPos()==5){
					Image.rightCh();
				} else {
					Image.right();
				}
            	
                
            } else if (com.equalsIgnoreCase("shock l")) {
            	pow = pow - 5 ;
				Image.leftshock();
				try {
					Thread.sleep(450);
					Image.left();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (an.bo.getPos()==5) {
					an.bo.setPos(1);
				}
				if (an.fo.getState()==5){
					an.fo.setState(3);
				}
				
				
                
            } else if (com.equalsIgnoreCase("shock r")) {
            	pow = pow - 5 ;
				Image.rightshock();
				try {
					Thread.sleep(450);
					Image.right();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (an.fr.getPos()==5) {
					an.fr.setPos(2);
				}
				if (an.ch.getPos()==5){
					an.ch.setPos(1);
				}
                
            } else if (com.equalsIgnoreCase("time")) {
            	commands.timeCheck();
    			Image.office();
            
            } else if (com.equalsIgnoreCase("status freddy")) {
            	pow = pow - 1;
            	Image.office();
    			System.out.println("Status check...");
    			try {
					Thread.sleep(3000);
					System.out.println("Activity status: "+an.fr.getPos());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
            
            } else if (com.equalsIgnoreCase("status bonny")) {
            	pow = pow - 1;
    			Image.office();
    			System.out.println("Status check...");
    			try {
					Thread.sleep(3000);
					System.out.println("Activity status: "+an.bo.getPos());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
            
            } else if (com.equalsIgnoreCase("status chica")) {
            	pow = pow - 1;
            	Image.office();
    			System.out.println("Status check...");
    			try {
					Thread.sleep(3000);
					System.out.println("Activity status: "+an.ch.getPos());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
            
            } else if (com.equalsIgnoreCase("status foxy")) {
            	pow = pow - 1;
            	Image.office();
    			System.out.println("Status check...");
    			try {
					Thread.sleep(3000);
					System.out.println("Activity status: "+an.fo.getState());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
            
            } else if (com.equalsIgnoreCase("power")) {
				System.out.println("Power: "+pow+"%");
				Image.office();
			} else if (com.equalsIgnoreCase("help")) {
				System.out.println();
				System.out.println("--------------------------------------------------");
				System.out.println("|                    COMMANDS        | - |[ ]| X |");
				System.out.println("--------------------------------------------------");
				System.out.println("|                                                |");
				System.out.println("| - Time - check current time.                   |");
				System.out.println("| - Power - check power.                         |");
				System.out.println("|                                                |");
				System.out.println("| - Check l/r - shows left/right corridor.       |");
				System.out.println("| - Shock l/r - shocks left/right corridor,      |");
				System.out.println("| scarying off animatronics (spends 5% of power).|");
				System.out.println("|                                                |");
				System.out.println("| - Status Freddy/Bonny/Chica/Foxy - shows how   |");
				System.out.println("| active certain animatronic's sensors are.      |");
				System.out.println("| Status check needs a bit of time and little of |");
				System.out.println("| power (2%). Usually animatronics' sensors are  |");
				System.out.println("| at level '5' when human is in sight.           |");
				System.out.println("|                                                |");
				System.out.println("|                    | OKAY |                    |");
				System.out.println("|                                                |");
				System.out.println("--------------------------------------------------");
			} else{
                System.out.println("Invalid command. Type 'help' to get command list.");
    				Image.office();
            	}
			}
        }
		
	}
}
