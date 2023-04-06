import java.util.Scanner;
class PronicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int ip = sc.nextInt();

		if(checkPronicNo(ip))
		{
			System.out.println("It's is Pronic Number ");
		}
		else
		{
			System.out.println("It's is not a Pronic Number ");
		}
	}

	public static boolean checkPronicNo(int num)
	{
		for(int i=1; i<num; i++)
		{
			if(i*(i+1) == num)
			{
				return true;
			}
		}
		return false;
	}
}
