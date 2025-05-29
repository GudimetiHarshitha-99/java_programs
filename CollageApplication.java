package module2_Strings;
import java.util.Scanner;
public class CollageApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the JNTUA Portal");
		while(true)
		{
			System.out.println("1.Are u 12th Passed\n2.UG Passed");
			int a=sc.nextInt();
			if(a==1)
			{
//				UG abc=new UG();
				System.out.println("Choose your UG Qualification");
				System.out.println("1.BTech");
				System.out.println("2.BSC");
				int c1=sc.nextInt();
				switch(c1)
				{
				case 1:
					System.out.println("You choose BTech Course");
					BTech b=new BTech();
					b.BTech1();
					break;
				case 2:
					System.out.println("You choose Degree Course");
					Bsc d=new Bsc();
					break;
				default:
					System.out.println("Choose your Other Course");
				}
				System.out.println();
			}
			else if(a==2)
			{
//				PG ab=new PG();
				System.out.println("Choose Your PG Qualification");
				System.out.println("1.MBA\n2.MTech");
				int p=sc.nextInt();
				switch(p)
				{
					case 1:
						System.out.println("You Choose MBA Course");
						MBA mb=new MBA();
						break;
					case 2:
						System.out.println("You Choose MTech Course");
						MTech mt=new MTech();
						break;
					default:
						System.out.println("Choose your other course");
				}
			}
		}
	}
}








class UG
{
	UG()
	{
//		System.out.println("Under Graduate Courses");
	}
}
class BTech extends UG
{
	Scanner sc=new Scanner(System.in);
	 void BTech1()
	{
//		super();
		System.out.println("1:ECE\n2:CSE\n3:EEE\n4:CIVIL\n5:MECH");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Your Branch is ECE");
			break;
		case 2:
			System.out.println("Your Branch is CSE");
			break;
		case 3:
			System.out.println("Your Branch is EEE");
			break;
		case 4:
			System.out.println("Your Branch is CIVIL");
			break;
		case 5:
			System.out.println("Your Branch is MECH");
			break;
		default:
			System.out.println("Choose other among those");
		}
	}
}
class Bsc extends UG
{
	Scanner sc=new Scanner(System.in);
	Bsc()
	{
//		System.out.println("Degree");
		System.out.println("1.MPC\n2.MSC\n3.MECs\n4.MCCs");
		int d2=sc.nextInt();
		switch(d2)
		{
		case 1:
			System.out.println("Your Branch is MPC");
			break;
		case 2:
			System.out.println("Your Branch is MSC");
			break;
		case 3:
			System.out.println("Your Branch is MECs");
			break;
		case 4:
			System.out.println("Your Branch is MCCs");
			break;
		default:
			System.out.println("Default");
		}
	}
}



class PG 
{
	PG()
	{
//		System.out.println("PG courses");
	}
}


class MBA extends PG
{
	Scanner sc=new Scanner(System.in);
	MBA()
	{
		System.out.println("MBA");
		System.out.println("Choose Your MBA Course");
		System.out.println("1.Marketing\n2.Finance\n3.Economics\n4.Data");
		int m=sc.nextInt();
		switch(m)
		{
			case 1:
			{
				System.out.println("You Choose Marketing");
				break;
			}
			case 2:
			{
				System.out.println("You Choose Finance");
				break;
			}
			case 3:
			{
				System.out.println("You Choose Economics");
				break;
			}
			case 4:
			{
				System.out.println("You Choose Data Analytics");
				break;
			}
		}
	}
}
class MTech extends PG
{
	Scanner sc=new Scanner(System.in);
	MTech()
	{
//		System.out.println("MCA");
		System.out.println("Choose Your MTech Course");
		System.out.println("1.VLSI\n2.EMBEDDED\n3.IOT\n4.SIGNAL PROCESSING");
		int mc=sc.nextInt();
		switch(mc)
		{
			case 1:
				System.out.println("You Choose VLSI Course");
				break;
			case 2:
				System.out.println("You Choose EMBEDDED SYSTEMS Course");
				break;
			case 3:
				System.out.println("You Choose IOT Course");
				break;
			case 4:
				System.out.println("You Choose SIGNAL PROCESSING Course");
				break;
			default:
				System.out.println("Default MTECH");
		}
	}
}