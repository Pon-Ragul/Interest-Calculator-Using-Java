package javaproject;
import java.util.*;
public class Javaproject 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter tenure : ");
	        int tenure = sc.nextInt();
	        System.out.print("Enter principal amount : ");
	        float principal = sc.nextFloat();
	        System.out.print("Enter age: ");
	        int age = sc.nextInt();
	        System.out.print("Enter gender : ");
	        String gender = sc.next();
	        BankService service = new BankService();
	        service.calculate(principal, tenure, age, gender);
	}
}
