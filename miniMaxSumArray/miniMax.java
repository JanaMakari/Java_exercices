/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

import java.util.List;

public class miniMax {

    public static void miniMaxSum(List<Integer> arr) {
        
        long totalSum = 0;
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        
        for (int num : arr) {
            totalSum += num;
            if (num < minElement) {
                minElement = num;
            }
            if (num > maxElement) {
                maxElement = num;
            }
        }
        
        long sumMin = totalSum - maxElement;
        long sumMax = totalSum - minElement;
        
        System.out.println(sumMin + " " + sumMax);
    }
    //The Time Complexity for this function is : O(n)
}
