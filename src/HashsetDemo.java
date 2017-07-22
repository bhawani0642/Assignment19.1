import java.util.HashSet;
import java.util.Iterator;
//Created a class HashsetDemo
public class HashsetDemo {

	public static void main(String[] args) {
		//Creating hash set
		HashSet<Student> std= new HashSet<Student>();
		//Now populating HashSet
		std.add(new Student("Neha",2001,"chemistry"));
		std.add(new Student("Sonam",3003,"physics"));
		std.add(new Student("Dipika",4002,"biology"));
		//Creating Iterator
		Iterator iterator=std.iterator();
		//Checking the values
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}

}
