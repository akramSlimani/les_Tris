package TP1;
import java.util.*;

public class TableauEl {
 
	// N nombre d'éléments
	private int taille;
	//le tableau d'éléments
	private Element tab[];
	
	public TableauEl(int taille) {
		this.taille = taille;
		this.tab = new Element[taille];
	}
	
	public int getTaille() {
		  return taille;
	  }

	  public Element getElement(int position) {
		  return tab[position];
	  }
	  
	  public Element [] getTab() {
		  return tab;
	  }
	  
	  public void setTaille(int taille) {
		  this.taille = taille;
	  }

	  public void manuel(){
		    
			 Scanner sc = new Scanner(System.in); 

			 int i=0;
			    while(i<taille){
		              
		              tab[i] = new Element();

		              System.out.print("la cle " +": ");
		              tab[i].setCle(sc.nextInt());
			    
			          System.out.print("la valeur " +i +": ");
		              tab[i].setValeur(sc.next());
			    
			          i++;
			 
			    }

		    }
	  
	  public void aleatoire() {
	       Random rand = new Random();
	      String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz" ;
	     
	      int randomCle;

	      final int NB_CARACTERE=5; 
	      final int INTERVALLE_ALEA=4000;
	      

	     for(int i=0; i<tab.length; i++)
	      {

	          String randomVal = "";
	          int length = rand.nextInt(NB_CARACTERE);
	        char[] text = new char[length]; 

	          for(int j = 0; j<length; j++)
	          {
	              text[j] = characters.charAt(rand.nextInt(characters.length()-1) +1);
	          }
	          for(int k = 0; k<text.length; k++)
	          {
	              randomVal += text[k];
	          }

	           randomCle = rand.nextInt(INTERVALLE_ALEA);
	          tab[i] = new Element(randomCle, randomVal);  
	      }
	 }
	  
	  /* tri à bulle*/
	  public void triBulle() {

	        boolean estTrie = false;
	        int dernierIndice = tab.length-1;
	        int tmpIndice = 0;

	        while(!estTrie && (dernierIndice > 0)) {
	            estTrie = true ;
	            for (int i = 0; i < dernierIndice ; i++) {
	                if (tab[i].getCle() > tab[i+1].getCle()){
	                    Element tmp = tab[i+1];
	                    tab[i+1]= tab[i];
	                    tab[i] = tmp;
	                    estTrie = false;
	                    tmpIndice = i;
	                }
	            }
	            dernierIndice = tmpIndice ;
	        }
	    }

	  
	  
  
	  /* tri par dénombrement*/
	  public void triDenombrement() {
		 
			int max = tab[0].getCle();
			for(int i = 1; i<tab.length; i++)
			{
				if(max < tab[i].getCle())
				{
					max = tab[i].getCle();
				}
			}
			
			
			int [] den = new int[max +1];
			
			for(int i =0; i<den.length; i++)
			{
				den[i]=0;
			}
			for(int i =0; i<tab.length; i++)
			{
				den[tab[i].getCle()]++;
			}
			for (int i =1; i<den.length; i++)
			{
				den[i]+=den[i-1];
				
				
			}
			Element[] nv = new Element [tab.length];
			for(int i =tab.length-1; i>=0; i--)
			{
			nv[ den[tab[i].getCle()] -1] = tab[i]; 
			den[tab[i].getCle()]--;
			
			}
			 for (int i =0; i<tab.length; i++)
			 {
				 tab[i]= nv[i];
			 }
			
			
		}
	  
	/*tri rapide*/
	  public void triRapide(){
		  int longueur = tab.length;
		  triRapide(tab,0,longueur-1);
	  }
	  private int repartition(Element[] tab, int debut, int fin) {
	        int pivot = tab[debut].getCle();
	        int i = debut - 1;
	        int j = fin + 1;
	        while (true) {
	            do {
	                i++;
	            } while (tab[i].getCle() < pivot);
	            do {
	                j--;
	            } while (tab[j].getCle() > pivot);
	            if (i >= j) {
	                return j;
	            }
	            Element temp = tab[i];
	            tab[i]  = tab[j] ;
	            tab[j] = temp;
	        }
	    }
	  public void triRapide(Element tab[],int deb,int fin) {
	      if(deb<fin)
	          {
	          int positionPivot=repartition(tab,deb,fin);
	          triRapide(tab,deb,positionPivot-1);
	          triRapide(tab,positionPivot+1,fin);
	          }
	      }

	  
	  
	  public String toString(){

		     String str="";
		      for(int i=0;i<tab.length;i++){
		           str= str + tab[i] + "\n";
		      }
		     return  str;
		    }
}
