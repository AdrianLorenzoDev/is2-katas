package kata1;

import java.time.LocalDate;
import java.time.Period;

/**
 * 
 * @author Adrian Lorenzo Melián
 *
 */
public class Person {

	private String name;
	private LocalDate birthDate;
	
	public Person(String name, LocalDate birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public int getAge() {
		return (int) (Period.between(birthDate, LocalDate.now()).getYears());
	}
	
}
