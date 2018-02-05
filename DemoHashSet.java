package CollectionPractice;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args)
	{
		Set s= new HashSet();
		s.add(1);
		s.add(200000);
		s.add("Amol");
		s.add(null);
		System.out.println(s.hashCode());
		System.out.println(s);
		Set s1= new HashSet();
		s1.add(1);
		s1.add(200000);
		s1.add("Amol");
		s1.add("Amol");
		s1.add(null);
		s1.add(null);
		s1.add(s);
		

		System.out.println(s1.hashCode());
		System.out.println("................................");
		System.out.println(s.equals(s1));
		System.out.println("Remove........ ");
		System.out.println(s1);
		System.out.println(s1.remove(s));
		System.out.println(s1);
		System.out.println("Contains...... ");
		System.out.println(s1.contains(s));
		System.out.println("ContainsAll...... ");
		System.out.println("GetClass............");
		System.out.println(s1.getClass());
		System.out.println("Is A Empty............");
		System.out.println(s1.isEmpty());
	
	}

}
