package reverse;

import java.util.ArrayList;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		ArrayList<String> m = new ArrayList<>();
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the size of string array : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			m.add(sc.next());
		}
		System.out.println("Reversed Strings : ");
		for(int j=m.size()-1;j>=0;j--) {
			System.out.println(m.get(j));

	}

	}
}
