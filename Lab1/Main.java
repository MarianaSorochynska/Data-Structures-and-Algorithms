//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: 
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("hello, world!");

        int[] nums = { 5, 9, 3, 12, 7, 3, 11, 5 };

        int i = 0;
        while (i < nums.length) {
            System.out.print(nums[i] + " ");
            i++;
        }
        System.out.println();

        for (int j = nums.length - 1; j >= 0; j--) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();

        System.out.println("The first value is " + nums[0]);
        System.out.println("The last value is " + nums[nums.length - 1]);

        Lab1 lab = new Lab1();
        System.out.println(lab.increment(1));

        System.out.println("Max of 5 and 9: " + lab.max(5, 9));
        System.out.println("Min of 5 and 9: " + lab.min(5, 9));

        System.out.println("Sum of array: " + lab.sum(nums));
        System.out.println("Average of array: " + lab.average(nums));

        System.out.println("Max in array: " + lab.max(nums));
        System.out.println("Min in array: " + lab.min(nums));
    }
}

// Add all of the methods here
class Lab1 {
    public int increment(int num) {
        return ++num;
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public int sum(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }

    public double average(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return (double) total / nums.length;
    }

    public int max(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public int min(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}
