
 
package midterm;


public class Fibonacci {
    public static void main(String[] args) {
        int j = 10;
System.out.print("Fibonacci sequence of " + j + ": ");
    for (int i = 0; i < j; i++) {
        System.out.print(fibonacci(i) + ",");
    }
  }
    
  public static int fibonacci(int j) {
      if (j <= 1) {
          return j;
      } else {
          return fibonacci(j - 1) + fibonacci(j - 2);
      }
        
    
    }
    
}
public class Fibonacci {
    
}
