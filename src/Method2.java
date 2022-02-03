
public class Method2 {
	
	public static void main(String[] args){
		Method2 a = new Method2();
		a.methodInDifferentClass();
		
		ClassMethds b = new ClassMethds();
		b.StaticClass();
	}
	
	public void methodInDifferentClass(){
		System.out.println("I am from outside class");
	}
}
