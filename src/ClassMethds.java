
public class ClassMethds {

	public static void main(String[] args) { 		//main has only executable code
		// TODO Auto-generated method stub
		ClassMethds a = new ClassMethds();
		a.methodInSameClass(); //prints Same class
		
		StaticClass(); //prints static class
		
		String r = a.returnSameClass(); // prints Same return class
		System.out.println(r); //prints I am from return
		
		Method2 b = new Method2();
		b.methodInDifferentClass(); //prints I am from outside class
		
		
	}
	//outside main is methods/non-executable code
	//void method	
	public void methodInSameClass(){
		System.out.println("Same class");
	}
	
	//static void method
	public static void StaticClass(){ //static keyword provide access to class without object
		System.out.println("static class");
	}
	
	//non-void method
	public String returnSameClass(){ //void cannot return anything it should have a datatype
		System.out.println("Same return class");
		return "I am from return";
	}
	

}
