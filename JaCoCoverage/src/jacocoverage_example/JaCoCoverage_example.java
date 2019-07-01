package jacocoverage_example;

public class JaCoCoverage_example {

    public static void main(String[] args) {
        
    }
    
    public double divide(int a, int b) {
        if(a == 0) {
            System.out.println("Dividendo não pode ser zero");
            return 0.0;
            
        } else if (b == 0) {
            System.out.println("Divisor não pode ser zero");
            return 0.0;
            
        } else
            return a / b;
        
    } 
    
}
