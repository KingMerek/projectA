package Java;
//this is a comment!//
public class Hello {
	public static void main(String[] args) {
		String name = "John Snuff";
		String name2 = "Cary Snuff";
		String name3 = "John Arbuckle";
		String name4 = "Kim Harvord";
		String name5 = "Yaldock T. Fenor";
		String ErrRobot = "A Robotic voice says";
 		int Rattendent = (int)(Math.random() * 5);



		System.out.println("Hello, Welcom to the the IGSC. Here we ship materials all across the known galaxy. If you would like more information, see our attendent, " + name +".") ;
		System.out.println(" ");

		switch (Rattendent) {
			case 0:
				System.out.println(ErrRobot + " Says \"We are sorry sir but " + name + " is not present currently. We here at the IGSC hope that there is no inconvinence, plese try later, perhaps after lunch break.\"");
				break;
			case 1:
				System.out.println(name + " says \"Hello my friend, how may I help you today?\"");
				break;
			case 2:
				System.out.println(name2 + " says \"Hello my friend, how may I help you today?\"");
				break;
			case 3:
				System.out.println(name3 + " says \"Hello my friend, how may I help you today?\"");
				break;
			case 4:
				System.out.println(name4 + " says \"Hello my friend, how may I help you today?\"");
				break;
			case 5:
				System.out.println(name5 + " says \"Hello my friend, how may I help you today?\"");
		}

		if (Rattendent > 1) {
			System.out.println("R > 1");
			} else {
			System.out.println("R < 1");
			}

		System.out.println(Rattendent);
		
	}
}	

//i dont understand what ascii is//
