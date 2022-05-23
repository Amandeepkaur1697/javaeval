package evaluation;

public class StringClass {
	//Strings:-Strings are immutable,it means we can't add another value in between the code to the same variable of that particular string variable.
		//Example
		public static void main(String[] args) {
			//Example 1
			String message="Welcome";
			//here if we try to concatinate ,the message wont be added
			message.concat("to java");
			System.out.println(message);
			//here welcome is only printed as answer
			//Example 2
			String newString=message.concat("To java");
			System.out.println(newString);
			//here output is welcome to java because we have stored the concatinated string in another string so it's clear that we can't concat in same variable
			
			
			//String Builder:-
			//the only change in String Builder is that it is mutable,means we can add the values in the same variable
			//Example 1
			StringBuilder b= new StringBuilder("Welcome");
			b.append("To java");
			System.out.println("B is:" +b);
		}
			
			//String can be written in 2 ways
			//1. String Literal
			//2. String Using new Operator
			// examples are shown above
			
			public void StringPrint() {
				String n="Welcome;";
				System.out.println(n);
				
			}
			
			public void exampleTwo() {
				String n2= new String("Example2");
				System.out.println(n2);
			}
			}
	
