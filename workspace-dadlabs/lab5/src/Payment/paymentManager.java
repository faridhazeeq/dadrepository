package Payment;

import java.security.Timestamp;
import java.util.Date;
import Parcel.parcel;
import Staff.staff;

public class paymentManager {
	staff staff= new staff();

	public payment managePayment (payment payment) {
		
		int paymentId = payment.getPaymentId();
		payment.setPaymentId(paymentId);
		
		Date date = payment.getTransactionDate();
		payment.setTransactionDate(date);
		
		String name = staff.getRecordedBy();
		payment.setRecordedBy(name);

		return payment;
	}
}
