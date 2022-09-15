package advance.dev;
/**
 * Viet chuong trinh nhap danh sach sinh vien ngau nhien su dung ArrayList
 * Ham in ra ma hinh danh sach sinh vien vua nhap
 * Sap sep danh sach sinh vien vua nhap
 * Tim sinh vien co diem cao nhat
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MainApp {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		input(studentList);
		print(studentList);
		sort(studentList);
		findMax(studentList);
	}

	private static void findMax(List<Student> studentList) {
		// TODO Auto-generated method stub
		if(studentList.size() == 0) return;
		Student max = studentList.get(0);
		for (Student student : studentList) {
			if(student.getMark() > max.getMark())
				max = student;
		}
		System.out.println(max);
	}

	private static void sort(List<Student> studentList) {
		// TODO Auto-generated method stub
//		Collections.sort(studentList);
		Collections.sort(studentList, new StudentComparator());
	}

	private static void print(List<Student> studentList) {
		// TODO Auto-generated method stub
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

	private static void input(List<Student> studentList) {
		// TODO Auto-generated method stub
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			String name = "Student " + i;
			double mark = random.nextDouble() * 10;
			studentList.add(new Student(i, name, mark));
		}
	}
}
