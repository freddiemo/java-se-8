package se.example.inheritance_12;

public class Student2 {
	private String name;
    private int age;

   	public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}