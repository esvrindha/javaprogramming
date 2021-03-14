/**
*Name:Vrindha e.s.
description:for,while,do-while loop examples
date:14-03-2021
*/
import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter a number");
	    int num= sc.nextInt();
	    for(int i=1;i<=10;i++)
	    {
	    	System.out.println(num+"*"+i+"="+(num*i));
	    }
	    
	}

}
