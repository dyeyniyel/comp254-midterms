package exercise1;

public class FindGCD {
    public static int gcd(int a, int b) {
        if (b == 0) //base case
        {
            return a; //as the GCD of any number and 0 is the number itself
        } else {
            return gcd(b, a % b); //recursive case
        }
    }
    
/* running time is Olog(n) because of the recursive call gcd(b, a % b) until b becomes 0, so it becomes smaller. 
   Since the value is lessen to almost half, the number of recursive calls grows in a logarithmic way.
   Also, if you double the size of the input, the number of recursive calls (and thus the running time) increases by a constant amount.
    */
    
    public static void main(String[] args) {  
        System.out.println("The GCD of the numbers 48 and 18 is: " + gcd(48, 18)); 
        System.out.println("The GCD of the numbers 60 and 30 is: " + gcd(60, 30));
        System.out.println("The GCD of the numbers 60 and 30 is: " + gcd(0, 1));
    }	
}
