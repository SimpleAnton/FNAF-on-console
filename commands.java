
public class commands {
	
//	public static void 
	
	public static void timeCheck() {
		
		long clock = Main.getElapsedTime()/60;
		if (clock == 0) {
			clock = 12;
		}
		System.out.println(clock +" AM");
	}
	
	
	
}
