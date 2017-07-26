package t20170702;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class HR {
	enum EMPLOYEE{
		CWN,
		WHD,
		WZY,
		SJH,
		ZYD,
		ZXT,
		TY,
		HF,
		ZYB,
		XJB,
		FJ,
		WZL,
		WM,
		LXF,
		YF,
		YZB,
		CL,
		WC,
		YY
		
	}
	public static void main(String[] args){
		HR hr=new HR();
		System.out.println(hr.getTopSalaryEmployee().getName());
		Employee e=new Employee("WM",12,new Random().nextInt(4000)+3000);
		System.out.println(	hr.isOurEmployee(e));
		
	}
	private List<Employee> lists;
	public HR(){
		lists=new LinkedList<>();
		int count=0;
		for(EMPLOYEE employee:EMPLOYEE.values()){
			lists.add(new Employee(employee.name(),count++,new Random().nextInt(4000)+3000));		
		}
		for(Employee i:lists){
			System.out.println(i.getSalary()+i.getName()+i.getId());
		}
	}
	public  List<Employee> getEmployees(){
		return lists;	
	}
	public Employee getTopSalaryEmployee(){
		double max=0;
		int index=0;
		ListIterator<Employee> i=lists.listIterator();
		while(i.hasNext()){
			Employee e=i.next();
			if(e.getSalary()>max){
				max=e.getSalary();
				index=i.nextIndex()-1;
			}
		}		
		return lists.get(index);
	}
	public void enrollEmployee(Employee employee){
		lists.add(employee);
	}
	public void resignEmployee(int id){
		for(Employee employee:lists){
			if(employee.getId()==id){
				System.out.println(employee.getName());
				lists.remove(employee);
				break;
			}
		}
	}
	public boolean isOurEmployee(Employee e){
		for(Employee employee:lists){
			if(employee.equals(e)){
				return true;
			}
		}
		return false;
	}
}
