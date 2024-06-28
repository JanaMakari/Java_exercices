/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;


public class Problem {

    public static void evenToZero(int limit){
        if(limit == 0)
        {
            System.out.print(0);
            System.exit(0);
        }
        if(limit % 2 == 0)
            {
                System.out.print(limit + " ");
            }
        if(limit > 0)
        {
            if(limit % 2 == 0)
            {
                limit = limit - 2;
            }
            else
            {
                limit--;
            }
        }
        else if(limit < 0)
        {
            if(limit % 2 == 0)
            {
                limit = limit + 2;
            }
            else
            {
                limit++;
            }
        }
        evenToZero(limit);
    }
    //The Time Complexity is O(n)
}
