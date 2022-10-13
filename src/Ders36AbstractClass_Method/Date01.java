package Ders36AbstractClass_Method;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date01 {

	public static void main(String[] args) {
		
		LocalDate guncelTarih= LocalDate.now();
		
		System.out.println(guncelTarih);
		
		System.out.println(guncelTarih.plusDays(5));
		
		System.out.println(guncelTarih.minusDays(5));
		
		System.out.println(guncelTarih.plusMonths(5));
		
		System.out.println(guncelTarih.plusYears(7));
		
		System.out.println(guncelTarih.plusYears(3).plusMonths(5).plusDays(7));
		
		System.out.println(guncelTarih.getDayOfMonth());
		
		System.out.println(guncelTarih.getDayOfWeek());
		
		System.out.println(guncelTarih.getMonth());
		
		System.out.println(guncelTarih.getMonthValue());
		
		LocalDate yeniTarih= LocalDate.of(2016,04,17);
		System.out.println(yeniTarih);
		
		System.out.println(yeniTarih.isBefore(guncelTarih)); //İsAfter
		
		DateTimeFormatter tarihiFormatla= DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(tarihiFormatla.format(guncelTarih));
		
		//TİME
		LocalTime guncelSaat= LocalTime.now();
		System.out.println(guncelSaat);

		DateTimeFormatter saatiFormatla= DateTimeFormatter.ofPattern("hh:mm a");
		System.out.println(saatiFormatla.format(guncelSaat));
		
		DateTimeFormatter saatiFormatla2= DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(saatiFormatla2.format(guncelSaat));
		
		
		LocalDate t1= LocalDate.now();
		LocalDate t2= LocalDate.of(2016, 04, 17);
			Period fark= Period.between(t1, t2);
			System.out.println(fark);
}
}
