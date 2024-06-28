/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

import java.util.List;


public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumleft = 0, sumright = 0;
        for(int i = 0; i < arr.size(); i++)
        {
            int j = arr.size()-1-i;
            sumleft += arr.get(i).get(i);
            sumright += arr.get(i).get(j);
        }
        return Math.abs(sumleft - sumright);
    }
    //The Time Complexity for this function is : O(n)
}
