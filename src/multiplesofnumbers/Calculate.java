/* PROGRAM DESCRIPTION
* The program iterates in multiples of A until X, 
* then in multiples of A + 1 until 2X, 
* then multiples of A + 2 until 3X. 
*/
package multiplesofnumbers;

/**
 * @author Anna Pavlidou
 * date: 14/04/2022
 * location: home
 */
public class Calculate {
    
    //integer n is used to store the multiples
    private int n;
    
    //This method assigns the new values for each run, calls the formula method to run calculations and displays the results.
      void calculateMultiples(int A, int X){
            
        //FIRST RUN - multiples of A until X
   
        //Assigning the starting value to integer n
        n=A; 
         
        System.out.println("Multiples of " + A +" until "+ X);
         
        //calling the formula method to perform the calculation   
        formula(A,X);
        System.out.println("\n");
          
        //SECOND RUN - multiples of A + 1 until 2X
         
        //Assigning the new value A
        A = A+1;
         
        //Assigning the starting value to integer n
        n=A;
        
        //Assigning the new value of X as X1
        int X1= X*2;
        System.out.println("Multiples of " + A +" until "+ X1);

        //reusing the formula method with the updated values
        formula(A,X1);

        //THIRD RUN - multiples of A + 2 until 3X
        System.out.println("\n");
         
        //Assigning the new value A
        A = A+1;
         
        //Assigning the starting value to integer n
        n=A;
        
        //Assigning the new value of X as X2
        int X2= 3*X;
        
        System.out.println("Multiples of " + A +" until "+ X2);

        //reusing the formula method with the updated values
        formula(A,X2);
    }  
     
    //The method "formula" accepts two integers (A1,X1) to calculate multiples of A1 until X1
     void formula(int A1, int X1){
         
        //the method iterates until it reaches X1
        for (int i=1; i<=X1; i++){  
            //if the current multiple is less than X1, calculate the next multiple value
          if(n<=X1){
              //Recurrence relation that finds the values of multiples 
               n = A1 + (n-A1); 
               System.out.print(n + " ");
            }  
          //assign the new multiple as the current one and repeat the process.
          n = n+A1;
        }
    }
}
