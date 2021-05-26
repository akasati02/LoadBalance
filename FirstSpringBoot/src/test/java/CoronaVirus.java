import java.util.Scanner;

public class CoronaVirus {
	public static boolean isPositive = false;
	public static void main(String args[]) throws Exception {

		/*
		 * coronavirus 3 abcde crnas onarous
		 */

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter the virus composition::");
			String comV = scanner.nextLine();

			System.out.println("Please enter the number::");
			Integer numbPeople = Integer.parseInt(scanner.nextLine());

			System.out.println("Please enter the people::");
			String testPeople = "";
			for (int i = 0; i < numbPeople; i++) {
				if (testPeople.isEmpty()) {
					testPeople = scanner.nextLine();
				} else {
					testPeople += "," + scanner.nextLine();
				}
			}

			

			if (numbPeople != null && numbPeople > 0) {
				for (int i = 0; i < numbPeople; i++) {
					isPositive = true;
					if (testPeople != null && testPeople.length() > 0) {
						String[] value = testPeople.split(",");
						if (value != null && value.length > 0) {
							System.out.println("vlaue ::: " + value[i]);
							isPositive = false;
							printSubSeq(comV,value[i]);
							/*
							 * for (int k = 0; k < comV.length(); k++) { for (int j = 0; j <
							 * value[i].length(); j++) { // if(comV != null && comV.length() > 0 ) { //
							 * System.out.println("char value::: "+String.valueOf(charAt(j))); if
							 * (!(String.valueOf(comV.charAt(k)) == (String.valueOf(value[i].charAt(j))))) {
							 * isPositive = false; break; } // } } }
							 */
						}
						if (isPositive) {
							System.out.println("POSITIVE");
						} else {
							System.out.println("NEGATIVE");
						}
					}

				}
			}

		}

	}

	static void printSubSeqRec(String str, int n, int index, String curr,String subSeqStr) {
		// base case
		if (index == n) {
			isPositive = true;
		}
		if (curr != null && !curr.trim().isEmpty()) {
			if (curr.equals(subSeqStr)) {
				//System.out.println("matched ::: "+curr);
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
