package MainPack;

import java.util.Scanner;
import java.io.*;


public class Monster {
	enum Action{
		Play,
		Sing,
		Fight,
		Introduce
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Exception ex = new Exception("Something is really fucked up here!");
		Scanner s = new Scanner(System.in);
		System.out.println("Hello World!");
		System.out.println("Please enter your age: ");
		String age = s.next();
		System.out.println("The age you entered is: "+age);
//		int yourAge = Integer.parseInt(age);
		System.out.println("Plus my age: "+(Integer.parseInt(age)+23));
		try{
		Thread.sleep(10);
		}
		catch(Exception e)
		{}
		finally{
			
		}
		
	}

}
