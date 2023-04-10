import java.util.Scanner;
import java.io.*;
public class Account extends Report {
/** This class is used to maintain the account.
*@author Team 2
*@since 5-11-21
*@version 1.0
*/   public static final String filei="IssueReport.txt";
    public static final String filer="ReturnReport.txt";
	 public static void display(String email,String filepath)throws Exception {
		 Scanner scan = new Scanner( new File(filepath));
	     String emp="";
	     while(scan.hasNextLine()){
	    	 emp=scan.nextLine();
			 String[] s = emp.split(",");
	         if(s[0].equals(email)){
				for(int i=1;i<s.length;i++)
	                System.out.println(s[i]);
	          }
	      }
	      scan.close();
	}
	         
	     
	public static void run(String email)throws Exception {
		System.out.println(email+"\n\n"+"issued books");
		display(email,filei);
		System.out.println("\n\nreturned books");
		display(email,filer);
	}
}
