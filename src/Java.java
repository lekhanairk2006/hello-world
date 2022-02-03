import java.util.ArrayList;


public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//array
//for loops
		int[] arr = {1,2,3,4,5, 22, 221, 994};
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		String[] myarray = {"diya", "dhruv", "deepu"};
		for(int i=0; i<myarray.length; i++) {
			System.out.println(myarray[i]);
		}	
		//advanced for loop
		for(String y: myarray){
			System.out.println(y);
		}
//if else
		for(int y : arr){
			if(y%2==0){ //to check if is a multiple of 2
			System.out.println(y + "is a multiple of 2");
			break; //to stop after it finds first multiple
			}
		}
//arraylist
		ArrayList<String> myArray = new ArrayList<String>(); //create object of the class
//syntax- ClassName objectName = new ClassName
		myArray.add("you");
		myArray.add("2");
		myArray.add("you2");
		System.out.println(myArray.get(1));
	
	}

}
