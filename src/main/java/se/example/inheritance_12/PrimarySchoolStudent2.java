package se.example.inheritance_12;

public class PrimarySchoolStudent2 extends Student2 {
	private String parentName;

    public PrimarySchoolStudent2(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}