package lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;

public class CarRental {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2022-03-26");
		Scanner sc = new Scanner(System.in);
		Random generator = new Random();
		Car[] carArray = new Car[3];
		for(int i=0;i<3;i++) {
			int m;
			System.out.print(i+1 + "번째 차량의 mileage를 입력해주세요: ");
			while(true) {
				m = sc.nextInt();
				if(m<0) {
					System.out.print("mileage는 음수 일 수 없습니다. 다시 입력해주세요: ");
				}
				else {
					break;
				}
			}
			carArray[i] = new Car(date, m);
			carArray[i].carID = (generator.nextInt(99999-10000)+10000);
			carArray[i].status = Car.StatusType.available;
		}
		for(int i=0;i<3;i++) {
			System.out.println("=====Car Info=====");
			carArray[i].printinfo();
		}
		carArray[0].setStatus(Car.StatusType.checkedOut);
		System.out.print("\n=====Changed Info===\n");
		for(int i=0;i<3;i++) {
			System.out.println("=====Car Info=====");
			carArray[i].printinfo();
		}
	}
}
