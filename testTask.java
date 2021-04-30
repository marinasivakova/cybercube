package testTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class testTask {

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(1001);
		StringBuilder sBuild = buildString(n);
		String s = sBuild.toString();
// Alternatively, method askForString()
//		String s = askForString();
		String t = shuffleString(s);
		StringBuilder [] tApp = addRandomLetter(t);
		System.out.println("S string: " + s);
		System.out.println("T string: "+ tApp[0]);
		System.out.println("New letter: "+ tApp[1]);
		}
	public static StringBuilder buildString(int n) {
		String limit = "abcdefghijklmnopqrstuvxyz";
		StringBuilder s = new StringBuilder(n);
		for (int i = 0; i < n; i++) {
			int ind = (int) (limit.length() * Math.random());
			s.append(limit.charAt(ind));
		}
	return s ;
	}
	public static String shuffleString (String s) {
		List<String> letters = Arrays.asList(s.split(""));
		String t = "";
		Collections.shuffle(letters);
		for (String letter : letters) {
			t += letter;
		}
		return t;
	}
	public static StringBuilder [] addRandomLetter (String t) {
		Random r = new Random();
		int ind = r.nextInt(t.length());
		String limit = "abcdefghijklmnopqrstuvxyz";
		int index = (int) (limit.length() * Math.random());
		StringBuilder tAppend = new StringBuilder(t.length());
		for (int i = 0; i < t.length(); i++) {
			tAppend.append(t.charAt(i));
			if (i == ind) {
				tAppend.append(limit.charAt(index));
			}
		}
		char letter = limit.charAt(index);
		String let = String.valueOf(letter);
		StringBuilder letTwo = new StringBuilder(let.length());
		letTwo.append(let);
		StringBuilder [] fin = {tAppend, letTwo};
		return fin;
	}
	public static String askForString() {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		while (s.length() > 1000) {
			System.out.println("String too long, try again");
			 s = scan.nextLine();
		}
		return s.toLowerCase();
	}
}