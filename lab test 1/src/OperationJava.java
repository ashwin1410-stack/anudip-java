//WAP to perform operations (+,-,*,/,%)on two numbers using switch case./
public class OperationJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	      {
	        int n1=5;
	        int n2=66;
	        char Op='+';
	        switch(Op)
	         {
	          case '+': System.out.println("Add of two Number :"+(n1+n2));
	                              break;
	          case  '-': System.out.println("Sub of two Number :"+(n1-n2));
	                               break;
	          case '*': System.out.println("Mul of two Number :"+(n1*n2));
	                               break;
	           case '%': System.out.println("per of two Number :"+(n1%n2));
	                               break;
	           case '/': System.out.println("div of two Number :"+(n1/n2));
	                               break;
	             default:System.out.println("error");
	          }
	}

	}}
