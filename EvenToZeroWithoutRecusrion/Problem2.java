/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

public class Problem2 {
    public static void evenToZero(int limit) {
    if (limit % 2 != 0) 
    {
        limit--;
    }
    
    if (limit < 0) 
    {
        limit = (limit % 2 == 0) ? limit : limit - 2;
        
        while (limit <= 0) 
        {
            System.out.print(limit + " ");
            limit += 2;
        }
    }
    else 
    {
        while (limit >= 0) 
        {
            System.out.print(limit + " ");
            limit -= 2;
        }
    }
  }
    //Time Complexity is O(n)
}
