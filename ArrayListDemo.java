package CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		Student st1= new Student(1, "Amol Jagdale");
		Student st2= new Student(2, "Suraj Jagdale");
		XStudent x1= new XStudent(101, "Vikram Rathod");
		XStudent x2= new XStudent(102, "Arjun Pandit");
		
		int[] arr= {1, 4, 5, 7, 8, 4, 7, 2, 1};

		List<Object> l= new ArrayList<>();
		l.add(141255);
		l.add(st1);
		l.add(x1);	
		l.add(st2);
		l.add(Arrays.toString(arr));
		l.add(x2);
		l.add(4, "Amruta");
		List<String> l2= new LinkedList();
		l2.add("Amol");
		l2.add("Sagar");
		l2.add(1,"Swapnli");
		System.out.println(l2);
		ListIterator<String> itr= l2.listIterator();
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		System.out.println(l);
		//Iterator it= l.iterator();
		
		System.out.println("Using ListIterartor Cursor*****************************************");
		//System.out.println(l);
		ListIterator it1= l.listIterator();
		System.out.println("Next : ");
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("Previous : ");
		while(it1.hasPrevious())
		{
			System.out.println(it1.previous());
		}
		
		System.out.println("Using for each loop*****************************************");
		for (Object object : l) {
			if( object instanceof Student)
			{
				Student s=(Student)object;
				System.out.println(s);
			}
			else if( object instanceof XStudent)
			{
				XStudent s=(XStudent)object;
				System.out.println(s);
			}
			else
			{
			System.out.println(object);
			}
		}

		
	}
}
class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + "]";
	}
	
	
}
class XStudent extends Student{

	public XStudent(int id, String name) {
		super(id, name);
	}
	
	@Override
	public String toString() {
		return "\nXStudent [id=" + id + ", name=" + name + "]";
	}
	
	
}
