package com.epam.PEPcollection;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	int f=0;
        Scanner sc=new Scanner(System.in);
    	List<String> list= new ArrayList<String>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Jodu");
        list.add("Modhu");
        list.add("Iyer");
        list.add("Majhi");
        list.add("Granthik");
        list.add("Arko");
        list.add("Swapnamoy");
        list.add("Soubhik");
        System.out.println("List Creation:");
        while(true)
        {
        	System.out.println("1. Adding names \n" +
        					   "2. Deleting a name\n" +
        					   "3. Printing contents of the list\n" +
        		           	   "4. Exit");
        	System.out.print("Enter your choice: ");
        	int ch= sc.nextInt();
        	switch(ch) {
        	case 1:
        		System.out.print("Enter the name to be added: ");
        		String garbage=sc.nextLine();
        		String s1=sc.nextLine();
        		list.add(s1);
        		System.out.println("New list after adding:");
        		for(String s2 : list) {
        			System.out.println(s2);
        		}
        		break;
        	case 2:
        		System.out.print("Enter the name to be deleted: ");
        		String name= sc.next();
        		for(int i=0; i<list.size(); i++)
        		{
        			if(list.get(i).contentEquals(name)) {
        				list.remove(i);
        				System.out.println("Name removed!");
        				System.out.println("New list after deleting:");
        				for(String s2 : list)
        					System.out.println(s2);
        			}
        		}
        		break;        	
        	case 3:
        		for(String s : list) {
        			System.out.println(s);
        		}
        		break;
        	case 4:
        		f=1;
        		sc.close();
        		break;
        	}
        	if(f!=1)
        	{
        		System.out.print("Do you want another operation?\n" +
        						 "[Any key for Yes/ N for NO]\n" +
        			         	 "Your Choice: ");
        		char choice = sc.next().charAt(0);
        		if(choice == 'N' || choice == 'n')
        		{
        			break;
        		}
        	}
        	else {
        		break;
        	}
        }
        System.out.println("Successfully Closed!");
        sc.close();
    }
}