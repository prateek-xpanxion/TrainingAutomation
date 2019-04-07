package SampleMaven.SampleMaven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListExam {
	int empid;
	String empName, empSal;
	ArrayListExam(int empid, String empName,String empSal){
		this.empid=empid;
		this.empName=empName;
		this.empSal=empSal;
	}
	
	public static void main(String[] args) {
		Set <ArrayListExam>ll=new LinkedHashSet<ArrayListExam>();
		
		ll.add(new ArrayListExam(1, "jkfjd", "ddb"));
		ll.add(new ArrayListExam(2, "jkfjd", "ddb"));
		ll.add(new ArrayListExam(3, "jkfjd", "ddb"));
		ll.add(new ArrayListExam(4, "jkfjd", "ddb"));
		
		for(ArrayListExam array:ll) {
			System.out.print(array.empid+" ");
			System.out.print(array.empName+" ");
			System.out.print(array.empSal);
			System.out.println();
			//syso
		}
		
		List<String> temp=new ArrayList<String>();
		temp.add("dfd");
		temp.add("jfb");
		Iterator itr=temp.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		
	}
}
