package Comparator_Practise;
import java.util.*; 

public class Person_Class implements Comparable<Person_Class> {
	private int personId; 
	private String personName; 
	private String Locker; 
	private String PersonBelongings;
	
	public Person_Class(int personId, String personName) {
		this.personId = personId; 
		this.personName = personName;
	}
	public int getPersonId() {
		return personId;
	}
	public String getPersonName() {
		return personName;
	}
	public String getLocker() {
		return Locker;
	}
	public String getPersonBelongings() {
		return PersonBelongings;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public void setLocker(String locker) {
		Locker = locker;
	}
	public void setPersonBelongings(String personBelongings) {
		PersonBelongings = personBelongings;
	}
	
	@Override
	public int hashCode() {
		return personId;
		
	}
	
	public boolean equals(Person_Class o) {
		return this.personId ==o.personId;
	}
	
	@Override
	public int compareTo(Person_Class o) {
		
		return o.personId - this.personId;
	}
	
	
}
