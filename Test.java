public class Test {

	public static void main(String[] args) {

		  //donner une taille au tableau
		  int n = 5; 
		  TableauEl t1 = new TableauEl(n);

		  t1.aleatoire() ; 
		  //t1.manuel();

		   System.out.println("le tableau généré : \n" + t1);
		  
	
		       
		          long debut = System.currentTimeMillis();
		        //choisir une méthode de tris :
		        t1.triBulle();
		        //t1.triDenombrement(); 	
		        //t1.triRapide(); 
		         
		          long fin = System.currentTimeMillis();
		          
		         
		          System.out.println("le tableau trié :\n" + t1);
		          
		          System.out.println("le temps d'exécution est de : \n" + (fin - debut) + " ms");
	}


}
