
public class AddMultiply {
	 
    public static void main(String[] args) {
         
        int a = 10, b = 20;
         
        AddMultiply obj = new AddMultiply();
         
        System.out.println("Addition of two numbers: "+obj.addition(a, b));
         
        System.out.println("Multiplication of two numbers: "+obj.multiplication(a, b));
    }
 
    int addition(int a, int b) {
        return a + b;
    }
     
    int multiplication(int a, int b) {
        return a * b;
    }
}