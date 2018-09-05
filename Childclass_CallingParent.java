
public class Childclass_CallingParent {

	public static void main(String[] args)
	{
		
		//new is a memory allocation operator 
		ParentClass obj=new ParentClass();
		
		//Below are the syntax for calling the methods from Parent class
		
		//Calling the method 'validateHeaderMethod' from Parent
		obj.validateHeaderMethod();
		
		//Calling the method 'validateFooterMethod' from Parent		
		obj.validateFooterMethod();
		
		//Calling the method 'methodWithReturnTypeInt' from Parent and printing the value returned from the method
		System.out.println(obj.methodWithReturnTypeInt());

		//Calling the method 'methodWithReturnTypeString' from Parent and printing the value returned from the method
		System.out.println(obj.methodWithReturnTypeString());		
	}

}
