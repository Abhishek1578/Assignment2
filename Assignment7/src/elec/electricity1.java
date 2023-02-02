package elec;
import java.util.Scanner;

public class electricity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		if(i<=100)
		{
			System.out.println(i*10);
		}
		else if(i<=200)
		{
			int a=100*10;
			int b=(i-100)*15;
			System.out.println(a+b);
		}
		else if(i<=300)
		{
			System.out.println((100*10)+(100*15)+(i-200)*20);
		}
		else if(i>300)
		{
			System.out.println((100*10)+(100*15)+(100*20)+(i-300)*25);
		}

	}

}
