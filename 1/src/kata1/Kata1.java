package kata1;

import java.time.LocalDate;

/**
 * 
 * @author Adrián Lorenzo Melián
 *
 */
public class Kata1 {
	public static void main(String[] args) {
		
		LocalDate birthDate = LocalDate.of(1997, 11, 01);
		Person p1 = new Person("Citlalli", birthDate);
		
		System.out.println(p1.getName() + " tiene " + p1.getAge() + " años");
		
	}
}
