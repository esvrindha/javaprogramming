/**
*Name:Vrindha e.s.
description:mybiochallenge2
date:12-03-2021
*/
class MyBioChallenge2{
	private static long personId;
	private static String personName;
	private static String location;
	private static String contactNumber;
	private static String emailId;
	
	public static void getInput(long id, String name,String loc,String con,String email){
		personId=id;
		personName=name;
		location=loc;
		emailId=email;	
		showOutput();
	}
	public static void showOutput()
	{

		System.out.println("id="+personId);
		System.out.println("Name:"+personName);
		System.out.println("Location:"+location);
		System.out.println("Contact:"+contactNumber);
		System.out.println("Email:"+emailId);
	}
	public static void main(String[] args){
		
		getInput(91245,"esvrindha","ongole","8555046417","vrindhaes@gmail.com");
	}
	
}
