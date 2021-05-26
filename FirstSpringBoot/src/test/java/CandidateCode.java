import java.io.*;
import java.util.*;
public class CandidateCode {
     	
	public static boolean isPositive = false;
	public static void main(String args[]) throws Exception {

		/*
		 * coronavirus 3 abcde crnas onarous
		 * 1<= N <=10
			1<= |B|<= |V|<= 10^5
		 */

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter the virus composition::");
			String comV = scanner.nextLine();

			System.out.println("Please enter the number::");
			String numString = scanner.nextLine();
			boolean match = numString.matches("[0-9]+");
			Integer numbPeople = 0;
			if( match &&  (Integer.parseInt(numString) > 0 && Integer.parseInt(numString)  <= 10) ) {
				numbPeople = Integer.parseInt(numString);
			}

			System.out.println("Please enter the people::");
			String testPeople = "";
			for (int i = 0; i < numbPeople; i++) {
				if (testPeople.isEmpty()) {
					testPeople = scanner.nextLine();
				} else {
					testPeople += "," + scanner.nextLine();
				}
			}

			if ((numbPeople != null && numbPeople > 0) && (comV != null && !comV.isEmpty()) && (testPeople != null && testPeople.length() > 0)) {
				for (int i = 0; i < numbPeople; i++) {
					isPositive = true;
					String[] value = testPeople.split(",");
					isPositive = false;
					printSubSeq(comV,value[i]);	
					if (isPositive) {
						System.out.println("POSITIVE");
					} else {
						System.out.println("NEGATIVE");
					}

				}
			} else {
				System.out.println("No revords found!!");
			}

		} catch(Exception e) {
			System.out.println("inside error::: "+e.getMessage());
			e.printStackTrace();
		}

	}

	static void printSubSeqRec(String str, int n, int index, String curr,String subSeqStr) {	
		if (index == n) {
			isPositive = true;
		}
		if (curr != null && !curr.trim().isEmpty()) {
			if (curr.equals(subSeqStr)) {
				isPositive = true;
			}
		}
		for (int i = index + 1; i < n; i++) {
			curr += str.charAt(i);
			printSubSeqRec(str, n, i, curr,subSeqStr);
			curr = curr.substring(0, curr.length() - 1);
		}
	}

	static void printSubSeq(String str,String subSeqStr) {
		int index = -1;
		String curr = "";
		printSubSeqRec(str, str.length(), index, curr,subSeqStr);
	}

   }
