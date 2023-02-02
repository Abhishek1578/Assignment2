package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> arr=new ArrayList<Integer>();
		while(sc.hasNextInt())
		{
			arr.add(sc.nextInt());
		}
		arr.forEach(s1->{if(s1%2!=0) System.out.println("this is all odd number  "+s1);});

	}

}
