package javaproject;
public abstract class Account 
{
	protected int tenure;
    protected float principal;
    protected float rateOfInterest;
    public void setInterest(int age, String gender) 
    {
        if (gender.equalsIgnoreCase("male")) 
        {
            if (age < 60) 
            {
                rateOfInterest = 9.8f;
            } 
            else 
            {
                rateOfInterest = 10.5f;
            }
        } 
        else if (gender.equalsIgnoreCase("female")) 
        {
            if (age < 58) 
            {
                rateOfInterest = 10.2f;
            } 
            else 
            {
                rateOfInterest = 10.8f;
            }
        }
    }
    public float calculateMaturityAmount(float totalPrincipalDeposited, float maturityInterest) 
    {
        return totalPrincipalDeposited + maturityInterest;
    }
    public abstract float calculateInterest();
    public abstract float calculateAmountDeposited();
}

