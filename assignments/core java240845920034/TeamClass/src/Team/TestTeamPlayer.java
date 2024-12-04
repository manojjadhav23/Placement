package Team;
import java.util.Scanner;
public class TestTeamPlayer {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		
		int choice=0;
		do {
			System.out.println("1. Add new Team\n2. Delete the team\n3.Search  by Teamid\n Search by playerid");
			System.out.println("5. Delete player from the team\n6.Add player from the team\n7. display all\nchoice ");
			choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1:TeamService.AddNewTeam();
				break;

			case 2:
				break;

			case 3:
			    break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				System.out.println("sucessfully out");
			}
		}while(choice!=3);
	}

}
