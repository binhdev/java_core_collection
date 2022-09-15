package advance.dev;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getMark() > o2.getMark()) return 1;
		if(o1.getMark() < o2.getMark()) return -1;
		return 0;
	}

}
