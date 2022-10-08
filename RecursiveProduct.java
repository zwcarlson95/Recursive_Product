package Module5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursiveProduct {
	
	public static int Product(Integer[] nums, int n) {
		
		if (n == 0) {
			return (nums[n]);
		}
		else {
			return (nums[n] * Product(nums, n - 1));
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> userNums = new ArrayList<Integer>();
		
		while (userNums.size() < 5) {
			System.out.print("Enter number to be multiplied: ");
			userNums.add(input.nextInt());
		}
		
		Integer nums[] = new Integer[userNums.size()];
		userNums.toArray(nums);
		
		System.out.print("The total product of the numbers ");
		for (int i = 0; i < nums.length; i++) {
			if (i == nums.length -1) {
				System.out.print("& " + nums[i]);
			}
			else {
				System.out.print(nums[i] + ", ");
			}
		}
		
		System.out.println(" is " + Product(nums, nums.length - 1));
	}

}
