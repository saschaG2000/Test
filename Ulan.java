package SWED;

public class Ulan {

	public static void main(String[] args) {
        
        
        int n = 999999;

       while(n!=1) {
    	   System.out.println(n +" ");
    	   if(n%2==0) {
    		  n=n/2;
    	   }else {
    		   n=n*3;
    		   n++;
    	   }
       }
            
       System.out.println("Finished");

       
    }
}