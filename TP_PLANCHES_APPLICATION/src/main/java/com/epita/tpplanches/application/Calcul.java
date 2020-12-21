package com.epita.tpplanches.application;

public class Calcul {
	
	public static double calculerNombrePlanche(double surface) {
		double surfacePlanche = 0.31;
		double nombrePlanche = surface/surfacePlanche;
		double marge = (nombrePlanche*10)/100;
		return nombrePlanche+marge;		
		
	}

}
