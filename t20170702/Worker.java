package t20170702;

import java.util.ArrayList;
import java.util.List;

import t20170702.Worker.Address;

public class Worker {
	private String name;
	private int age;
	private double salary;
	private List<Address> address=new ArrayList<>(10);
	
	public Worker() {
		super();
	}
	public Worker(String name, int age, double salary, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address.add(address);
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Address> getAddress() {

		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Worker){
			Worker worker=(Worker)obj;
			if(this.name.equals(worker.name)&&this.age==worker.age){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		String s=name + age;
		return s.hashCode();
	}

	public class Address{
		private String addressName;
		private String zipCode;
		
		public Address(String addressName, String zipCode) {
			super();
			this.addressName = addressName;
			this.zipCode = zipCode;
		}
		public String getAddressName() {
			return addressName;
		}
		public void setAddressName(String addressName) {
			this.addressName = addressName;
		}
		public String getZipCode() {
			return zipCode;
		}
		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}
		
	}
	
}
