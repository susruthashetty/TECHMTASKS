package day5_tasks.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Task3 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Names");
			
		while(true) {
			String name = scan.next();
			if(name.equals("stop")) break;
			else names.add(name);
		}
		
		System.out.println("Enter the name to be entered at beginning of array list");
		names.add(0,scan.next());
		
		System.out.println("Names now");
		Iterator<String> it = names.iterator();		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}		
		
		scan.close();
	}

}
