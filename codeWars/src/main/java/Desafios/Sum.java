/**
    * Given two integers A and B, 
   which can be positive or negative, 
   find the sum of all the integers between 
   and including them and return it. 
   If the two numbers are equal return A or B.

   Note: A and B are not ordered!
*/
package Desafios;

/**
 * @author jony_
 */
public class Sum {
    
    public int GetSum(int a, int b){
        return (a + b) * (Math.abs(a - b) + 1) / 2;
  }
    
}
