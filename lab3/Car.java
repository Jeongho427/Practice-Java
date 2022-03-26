package lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
	int carID;
	StatusType status;
	Date datePurchased;
	int mileage;
	enum StatusType{
		available, checkedOut, inService, discarded, sold
	}
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Car(Date d, int m){
		datePurchased=d;
		mileage=m;
	}
	void setMileage(int x) {
		mileage+=x;
	}
	void setStatus(StatusType s) {
		status = s;
	}
	public void printinfo() {
		System.out.println("Car Id: " + carID);
		System.out.println("Car Status: " + status);
		System.out.println("Date : " + dateFormat.format(datePurchased));
		System.out.println("mileage: " + mileage);
	}
}
