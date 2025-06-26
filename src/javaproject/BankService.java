package javaproject;
public class BankService 
{
	 public boolean validateData(float principal, int tenure, int age, String gender) 
	 {
	        try 
	        {
	            if (principal < 500 || (tenure != 5 && tenure != 10) || age < 1 || age > 100 || (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female"))) 
	            {
	                throw new BankValidationException();
	            }
	            return true;
	        } 
	        catch (BankValidationException e) 
	        {
	            System.out.println(e);
	            return false;
	        }
	 }
	 public void calculate(float principal, int tenure, int age, String gender) 
	 {
	        if (validateData(principal, tenure, age, gender)) 
	        {
	            RDAccount rdAccount = new RDAccount(tenure, principal);
	            rdAccount.setInterest(age, gender);
	            float totalInterest = rdAccount.calculateInterest();
	            float totalAmountDeposited = rdAccount.calculateAmountDeposited();
	            float maturityAmount = rdAccount.calculateMaturityAmount(totalAmountDeposited, totalInterest);
	            System.out.println("Total Interest Earned: " + totalInterest);
	            System.out.println("Total Amount Deposited: " + totalAmountDeposited);
	            System.out.println("Maturity Amount: " + maturityAmount);
	        }
	 }
}
