package rmi;

import java.rmi.Naming;

public class Client_ex2 {
	public static void main(String[] args) {
		try {
			RemoteHotelReservartion hr = (RemoteHotelReservartion) Naming.lookup("rmi://localhost:1099/HR");
//			HotelReservation a = new HotelReservation(1, "Dehbi kamal", "Assabah", "22-07-2023", 14);
//			HotelReservation b = new HotelReservation(2, "Elbachar walid", "Assabah", "26-12_2025", 12);
//			System.out.println(hr.reserver(a));
//			System.out.println(hr.reserver(b));
//			System.out.println(hr.lister(1));
//			System.out.println(hr.lister(2));
			hr.annuler(1);hr.annuler(2);
			System.out.println(hr.lister(1));
			System.out.println(hr.lister(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
