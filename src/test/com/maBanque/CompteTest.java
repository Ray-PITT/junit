package test.com.maBanque;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;  
import com.maBanque.CompteImpl; 
 
public class CompteTest { 
 	 
	CompteImpl compte;
	
	
	@Before
	public void init() {
		compte = new CompteImpl();
	}
	
	@Test 
 	public void setSolde(){ 
 	 	try{  
 	 	 	compte.setSolde(100);  	 	 	
 	 	 	float solde = compte.getSolde();  	 	
 	 	 	assertTrue(solde == 100);
 	 	 } catch(Exception e){ 
 	 	 	fail(e.getMessage()); 
 	 	} 
 	} 
	
	@Test(expected = Exception.class) 
	public void erreurSetSolde() throws Exception {
		compte.setSolde(-1);
	}
	
	@Test 
 	public void crediter(){ 
 	 	try{ 
 	 		compte.setSolde(100);  
 	 	 	compte.crediter(1);
 	 	 	float solde = compte.getSolde();
 	 	 	System.out.println(solde);
 	 	 	assertTrue(solde == 101);
 	 	 } catch(Exception e){ 
 	 	 	fail(e.getMessage()); 
 	 	} 
 	} 
	
	@Test(expected = Exception.class) 
	public void erreurCrediter() throws Exception {
		compte.crediter(0);
	}
	
	@Test 
 	public void debiter(){ 
 	 	try{ 
 	 		compte.setSolde(100);
 	 		compte.crediter(1);
 	 	 	compte.debiter(21);
 	 	 	float solde = compte.getSolde();  	 	
 	 	 	assertTrue(solde == 80);
 	 	 } catch(Exception e){ 
 	 	 	fail(e.getMessage()); 
 	 	} 
 	} 
	
	@Test(expected = Exception.class) 
	public void erreurDebiterInf() throws Exception {
		compte.debiter(10);
	}
	
	@Test(expected = Exception.class) 
	public void erreurDebiterSup() throws Exception {
		compte.debiter(1001);
	}



} 
