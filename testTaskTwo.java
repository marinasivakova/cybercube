package testTask;

import java.util.Scanner;

public class testTaskTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int in = 100;
		int[] tree = new int[40000] ;
		int i = 0;
		while (in != 40001) {
			System.out.print("Next tree number (enter 40001 to end): ");
			in = scan.nextInt();
			System.out.println();
			i = i +1;
			tree[i] = in;
		}
		System.out.print("Choose first tree:");
		int firstTree = scan.nextInt();
		firstTree -= 1;
		int[] basketOne = new int[40000];
		int[] basketTwo = new int[40000];
		basketOne[0] = tree[firstTree];		
		int valOne = 0;
		while (tree[firstTree] == basketOne[0]) {
			valOne += 1;
			firstTree += 1;
		}
		basketTwo[0] = tree[firstTree];
		int valTwo = 1;
		while (tree[firstTree] == basketTwo[0] || tree[firstTree] == basketOne[0]) {
			valTwo += 1;
			firstTree += 1;
		}
		System.out.println(valOne+valTwo);
	}

}
