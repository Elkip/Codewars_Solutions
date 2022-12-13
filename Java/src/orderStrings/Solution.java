package orderStrings;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	public static String order_og(String words) {
		if (words == " " || words == null) {
			return words;
		}
		String[] arr = words.split(" ");
		printArray(arr);
		int[] ord = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			ord[i] = Integer.parseInt(arr[i].replaceAll(".*(\\d).*", "$1"));
		}
		printArray(ord);
		String newSent = "";
		for (int i = 0; i < arr.length; i++) {
			System.out.println(find(ord, i + 1));
			newSent += arr[find(ord, i + 1)] + " ";
		}
		System.out.println(newSent);
		return newSent.trim();
	} 

	public static String order(String words) {
		return Arrays.stream(words.split(" "))
				.sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
				.reduce((a, b) -> a + " " + b).get();
	}

	public static void main(String[] args) {
		order_og("Thi1s is2 3a T4est");
	}

	private static int find(int[] arr, int query) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == query) {
				return i;
			}
		}
		return -1;
	}

	private static void printArray(String[] arr) {
		for (String s : arr) {
			System.out.println(s);
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
