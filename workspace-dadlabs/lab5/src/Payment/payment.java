package Payment;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import Staff.staff;

public class payment extends staff implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	private int paymentId;
	private Date transactionDate;
	private staff recordedBy;
	
	public payment() {
			
	}
	
	public int getPaymentId() {
		return paymentId;
	}
	
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
		
	}
	public void setTransactionDate (Date date)
	{
		this.transactionDate = date;
	}
	
	public Date getTransactionDate()
	{
		return transactionDate;
	}
	
	
	public String getRecordedBy() {
		return super.name;
	}
	
	public void setRecordedBy(String recordedBy) {
		
		super.name = name;
	}
	
}
