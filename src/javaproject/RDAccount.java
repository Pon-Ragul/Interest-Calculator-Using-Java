package javaproject;
public class RDAccount extends Account
{
	public RDAccount(int tenure, float principal) 
	{
        this.tenure = tenure;
        this.principal = principal;
    }
    @Override
    public float calculateAmountDeposited() 
    {
        return principal * tenure * 12;
    }
    @Override
    public float calculateInterest() 
    {
        float totalInterest = 0;
        float monthlyPrincipal = principal;
        for (int month = 0; month < tenure * 12; month++) 
        {
            float remainingMonths = tenure * 12 - month;
            float t = remainingMonths / 12;
            float nt = 4 * t;
            float compoundFactor = (float) Math.pow((1 + (rateOfInterest / 100) / 4), nt);
            float interest = monthlyPrincipal * (compoundFactor - 1);
            totalInterest += interest;
        }
        return totalInterest;
    }
}
