/* PROGRAM DESCRIPTION
* the program iterates in multiples of A until X, 
* then in multiples of A + 1 until 2X, 
* then multiples of A + 2 until 3X. 
*/
package multiplesofnumbers;

/**
 * @author Anna Pavlidou
 * date: 14/04/2022
 * location: home
 */
public class MultiplesOfNumbers {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Create an instance of the class Calculate
        Calculate calculate = new Calculate();
        calculate.calculateMultiples(2,10);
        system.out.println("this project is integrated with Jenkins");
    }

}

