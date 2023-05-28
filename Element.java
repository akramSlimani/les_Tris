package TP1;

public class Element {

	private int cle;
	private String valeur;
	
	public Element() {
		cle = 0; 
		valeur = null;
	}
	
	public Element(int c , String v) {
		this.cle = c;
		this.valeur = v;
	}
	
	public Element(Element e) {
		e.cle = cle;
		e.valeur = valeur;
	}
	
	public int getCle() {
		return cle;
	}
	
	public String getValeur() {
		return valeur;
	}
	
	public void setCle(int c) {
		cle = c;
	}
	
	public void setValeur(String v) {
		valeur = v;
	}
	
	public String toString() {
		return "Element [cle=" + cle + " val="+valeur+"]";
	}
	
	/*
	public static void main(String [] args){
	  Element e= new Element(1,"akram");
	  System.out.println(e);
	}
	*/
}
