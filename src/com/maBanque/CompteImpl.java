package com.maBanque;

public class CompteImpl implements Compte{ 
 
 	float solde; 
 	
 	public CompteImpl() {
 		this.solde = 0;
 	}
 	 
 	@Override 
 	public void crediter(float credit) throws Exception{ 
 			if (credit <= 0) throw new Exception("credit ne peut etre <= 0");
 	 		this.solde+=credit;
 	}

	@Override
	public float getSolde() {
		return this.solde;
	}

	@Override
	public float debiter(float debit) throws Exception {
			if (debit < 20 || debit >1000) throw new Exception("debit ne peut être inférieur à 20 ou supérieur à 1000");
			if (debit > this.solde) return debit;
			this.solde-=debit;
			return this.solde-debit;

	}

	@Override
	public void setSolde(float solde) throws Exception {
			if (solde<=0) throw new Exception("solde ne peut être <= 0");
			this.solde = solde;
	}
  
} 
