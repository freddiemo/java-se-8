package se.example;


import se.example.classes_11.Student6;

/**
 * Classes samples.
 */
public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            String name =  "";
            switch(i) {
                case 1: name = "Mary"; break;
                case 2: name = "Carol"; break;
                case 3: name = "Tim"; break;
                case 4: name = "Harry"; break;
                case 5: name = "Lisa"; break;
                default: name = "Anonymous"; break;
            };
            Student6 student = new Student6("S92300" + i,
                               name,
                                "05/11/1985",
                                "Java Masterclass");
            System.out.println(student);
        }
    }

}