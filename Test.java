package TP1;

public class Test {

	public static void main(String[] args) {

		  int n = 5; 
		  TableauEl t1 = new TableauEl(n);

		  t1.aleatoire() ; 
		  //t1.manuel();

		   System.out.println("le tableau généré : \n" + t1);
		  
	

		       
		          long debut = System.currentTimeMillis();
		        // t1.triBulle();
		        t1.triDenombrement(); 	
		       //   t1.triRapide(); 
		         
		          long fin = System.currentTimeMillis();
		          
		         
		          System.out.println("le tableau trié :\n" + t1);
		          
		          System.out.println("le temps d'exécution est de : \n" + (fin - debut) + " ms");
	}


}
