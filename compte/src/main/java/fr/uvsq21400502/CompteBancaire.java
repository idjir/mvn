package fr.uvsq21400502;
public class CompteBancaire  {
	
	private double solde;
	

	
	public CompteBancaire(double solde)
	{
		if(solde<0)throw new IllegalArgumentException(); 
		this.solde=solde;
		
	}
	
	public double getSolde()
	{
		return this.solde;
	}
	
	public void Credit(double x)
	{
		 solde+=x;
		
	}
	public void Debit(double x)
	{
		
		solde-=x;
	}	
	
	public void Virement(CompteBancaire c,double v)
	{
		if(v>getSolde()) throw new IllegalArgumentException(); 
		
		this.Debit(v);
		c.Credit(v);
		
	}
	
	public void Consulter()
	{
		System.out.println("votre solde est de:"+getSolde());
		
	}
}
