package Problems;

public class PrimeNumber {

	public static void main(String[] args) {
		 int i,m=0,flag=0;      
		  int n=3;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
			  for(n=2; n<100; n++) {
				   for(i=2;i<=100;i++){      
				    if(n%i==0 && n!=i){      
				     System.out.println(n+" is not prime number");      
				     flag=1;      
				     break;      
				    } 
			   }
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
		}    
	}
}
