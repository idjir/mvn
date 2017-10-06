package fr.uvsq21400502;
import static org.junit.Assert.*;

import org.junit.Test;

public class CompteBancaireTest {

	@Test
	public void test() {
		CompteBancaire c,d,cc,dd;
		
		c= new CompteBancaire(100.0);
		d= new CompteBancaire(2000.0);
		cc= new CompteBancaire(100.0);
		dd= new CompteBancaire(2000.0);
		
		
		c.Virement(d, 60.0);
		double x=40.0;
		assertTrue("vrai",x==c.getSolde());
		
		
	cc.Credit(100.0);
	assertTrue("vrai",200.0==cc.getSolde());
	dd.Debit(2100);
	assertTrue("vrai",-100.0==dd.getSolde());
		
		
	}

}
