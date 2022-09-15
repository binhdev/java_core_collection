package advance.dev;


public class Student{
	private int id;
	private String name;
	private double mark;
	
	public Student(int id, String name, double mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%d %s %.1f", id, name, mark);
	}
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		if(mark > o.getMark()) return 1;
//		if(mark < o.getMark()) return -1;
//		return 0;
//	}
	
}
