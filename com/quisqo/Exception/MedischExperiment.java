package com.quisqo.Exception;

import java.lang.Object;
import java.util.ArrayList;

public class MedischExperiment {

	public static void main(String[] args) {
		GegevensDeelnemer deelnemer1 = new GegevensDeelnemer("Truus", 70);
		GegevensDeelnemer deelnemer2 = new GegevensDeelnemer("Jaap", 56);
		GegevensDeelnemer deelnemer3 = new GegevensDeelnemer("Tom", 61);
		GegevensDeelnemer deelnemer4 = new GegevensDeelnemer("Jannie", 43);
		GegevensDeelnemer deelnemer5 = new GegevensDeelnemer("Ria", 48);
		GegevensDeelnemer deelnemer6 = new GegevensDeelnemer("Kees", 70);
		GroepDeelnemers groep1 = new GroepDeelnemers();
	}

}

class GroepDeelnemers extends MedischExperiment{
	int aantalDeelnemers = 6;
	
}

class GegevensDeelnemer extends GroepDeelnemers{
			
			public GegevensDeelnemer(String naam, int leeftijd) {
        	 
         }
}