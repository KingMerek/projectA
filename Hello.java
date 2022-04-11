package Java;
//this is a comment!//
public class Hello {
	public static void main(String[] args) {
		String[] attendent = {"John Snuff", "Cary Snuff", "John Arbuckle", "Kim Harvord", "Yaldock T. Fenor", "Err"};
		String Err = "A Robotic voice says";
 		int Rattendent = (int)(Math.random() * 5); 
		 
		System.out.println("Hello, Welcom to the the IGSC. Here we ship materials all across the known galaxy. If you would like more information, see our attendent, " + attendent[Rattendent] +".") ;
		System.out.println(" ");

		switch (Rattendent) {
			case 0:
				System.out.println(Err + " Says \"We are sorry sir but " + attendent[Rattendent] + " is not present currently. We here at the IGSC hope that there is no inconvinence, plese try later, perhaps after lunch break.\"");
				break;
			case 1:
				System.out.println(attendent[1] + "says \"Hello my friend, how may I help you today?\"");
				break;
			case 2:
				System.out.println(attendent[2] + "says \"Hello my friend, how may I help you today?\"");
				break;
			case 3:
				System.out.println(attendent[3] + "says \"Hello my friend, how may I help you today?\"");
				break;
			case 4:
				System.out.println(attendent[4] + "says \"Hello my friend, how may I help you today?\"");
				break;
			case 5:
				System.out.println(attendent[0] + "says \"Hello my friend, how may I help you today?\"");
		}

		if (Rattendent > 1) {
			System.out.println("R > 1");
			} else {
			System.out.println("R < 1");
			}
	}
}	

//i dont understand what ascii is//
