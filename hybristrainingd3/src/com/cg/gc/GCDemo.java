package com.cg.gc;

class Student{
	String name;
	public Student(String name){
		this.name=name;
	}
	
	@Override
	protected void finalize() throws Throwable{
	System.out.println(name + "destroyed");
		
	}
}
public class GCDemo {

	public static void main(String[] args) {
		Student Student1 = new Student("ritesh");
		Student Student2 = new Student("utsav");
		Student Student3 = new Student("atul");
		//Student Student4 = Student3;
		Student3 = new Student("Bindu");//Student4
		
		Student1=null;
		
		int i = 90;
		if (i>0) {
			Student Student5 = new Student("rishabh");
		}
		
		System.gc();

	}

}
