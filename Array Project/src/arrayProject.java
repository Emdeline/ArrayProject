
public class arrayProject
	{

		public static void main(String[] args)
			{
				String [] poloRoster = new String [5];
					
				poloRoster[0] = "Navy Blue";
				poloRoster[1] = "Light Blue";
				poloRoster[2] = "Yellow";
				poloRoster[3] = "Gray";
				poloRoster[4] = "White";
				
				for (String s : poloRoster)
					{
						System.out.println("Your choices for a polo color are..." + s);
						System.out.println("You should wear the color " + s + " today!");

					}
			}

	}
