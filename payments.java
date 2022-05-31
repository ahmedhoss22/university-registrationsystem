package project;

import java.util.InputMismatchException;

public class payments {

	private double amountPaid;    //13 D) 1
	private static int transactionNumber;
	private String bankOfTransaction; //13 D) 3
	private String dateOfTransaction;//13 D) 4
	
	public payments(double amountPaid, String bankOfTransaction, String dateOfTransaction) {  //13-d
		this.amountPaid = amountPaid;
		university.totalAmountPaid+=amountPaid;
		this.bankOfTransaction = bankOfTransaction;
		this.dateOfTransaction = dateOfTransaction;
		transactionNumber++;
	}

	//	///////////////////////////////////////////////////////////////////////////////////13 D) 1
	public double getAmountPaid() {
		return amountPaid;
		
	}
	public void setAmountPaid(double amountPaid) throws InputMismatchException{
		university.totalAmountPaid+=amountPaid;
		this.amountPaid = amountPaid;
	}	
	/////////////////////////////////////////////////////////////////////////13 D) 3
	public String getBankOfTransaction() {
		return bankOfTransaction;
	}
	public void setBankOfTransaction(String bankOfTransaction) throws InputMismatchException{
		this.bankOfTransaction = bankOfTransaction;
	}
//////////////////////////////////////////////////////////////////////////////13 D) 4
	public String getDateOfTransaction() {
		return dateOfTransaction;
	}
	public void setDateOfTransaction(String dateOfTransaction) throws InputMismatchException{
		this.dateOfTransaction = dateOfTransaction;
	}
//	////////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "\n"+"amountPaid=" + amountPaid +"\n"+ ", bankOfTransaction=" + bankOfTransaction
				+"\n"+ ", dateOfTransaction=" + dateOfTransaction;
	}	
}
