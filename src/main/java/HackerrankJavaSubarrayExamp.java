/*
We define the following:
. A subarray of an n-element array is an array composed from a contiguous block of the original array's
    elements. For example, if array = [1,2,3]. then the subarrays are [1]. [2]. [3]. [1, 2]. [2,3]. and [1,2,3].
    Something like [1,3] would not be a subarray as it's not a contiguous subsection of the original array.
. The sum of an array is the total sum of its elements.
   An array's sum is negative if the total sum of its elements is negative.
   An array's sum is positive if the total sum of its elements is positive.
Given an array of n integers, find and print its number of negative subarrays on a new line.

 `https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true`
 */

import java.io.*;
import java.util.*;

public class HackerrankJavaSubarrayExamp {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("pls entry a list's size number: ");

        int n = inp.nextInt();


        if (1 <= n && n <= 100) {
            System.out.println("Array olusturmaya uygundur");
            int[] arr = new int[n];


            System.out.println("Simdi olusturdugunuz " + n + " elemanli arrayin elamanlarini giriniz: ");

            for (int i = 0; i < n; i++) {
                System.out.println(i + " nci elemani giriniz: ");
                int k = inp.nextInt();
                arr[i] = k;
            }

            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                for (int j = i; j < i + 1; j++) {
                    sum += arr[j];
                    System.out.println("{" + arr[j] + "," + arr[j] + "}");
                    if (sum < 0) {
                        System.out.println("negatif toplamlar:" + sum);
                    }
                }
            }
            System.out.println(Arrays.toString(arr));


        } else {
            System.out.println("Array olusturmaya uygun aralikta degildir, 1 ile 100 arasinda bir input giriniz!");
        }

    }
}
