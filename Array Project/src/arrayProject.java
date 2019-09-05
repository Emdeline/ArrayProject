
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
				
				System.out.println("Your choices for a polo color are: " );
				
				for (String s : poloRoster)
					{
						System.out.println(s);	
					}
				
				int randomNumber = (int) (Math.random() * poloRoster.length);
				System.out.println("You should wear " + poloRoster[randomNumber] + " today!");
			}

	}
