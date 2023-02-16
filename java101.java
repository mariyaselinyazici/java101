package patikaDev;

import java.util.Scanner;

public class java101 {

	public static void main(String[] args) {
		
	
		int mat, fızık, kımya, tarıh, muzık, turkce;
	
	 
		
		Scanner sc = new Scanner(System.in);
		
	  
	   System.out.print("matematik notunuz:");
	   mat = sc.nextInt();
	   
	   System.out.print("fizik notunuz:");
	   fızık = sc.nextInt();
	   
	   System.out.print("kimya notunuz:");
	   kımya = sc.nextInt();
	   
	   System.out.print("tarih notunuz:");
	   tarıh = sc.nextInt();
	   
	   System.out.print("müzik notunuz:");
       muzık = sc.nextInt();
       
       System.out.print("türkçe notunuz:");
       turkce = sc.nextInt();
       
       //ortalamayı hesaplayalım
       double average = (mat+fızık+kımya+tarıh+muzık+turkce)/6;
       System.out.println("Ortalamanız:" + average );
       
       // geçip geçmediğini kontrol edelim
       boolean kosul1 = average >= 60;
       
       String a = kosul1 ? "geçti" : "kaldı";
       System.out.print(a);
       
       
       
       
       
       
       
       
	
	


    
    
   

 

		
	}

}
