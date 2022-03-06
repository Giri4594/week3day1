package week3day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int in=13; 
		boolean flag= false; 
	  
		for (int i =2; i < in/2; i++) { 
		
			if(in%i==0){flag=true;	break; }
			}
	
		if(flag==false) { System.out.println("prime");}
		else {	System.out.println(" Not prime");	}

}
}