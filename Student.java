public class Student extends Person {
    private String major;
    private double gpa;
    public Student(String name, int age, String major, double gpa) {
        super(name, age);
        this.major = major;
        this.gpa = gpa;
    }
    @Override
    public void intro() {
        // TODO Auto-generated method stub
        System.out.println("Hi! May name is " + super.getName());
        System.out.println("May age is "  + super.getAge());
        System.out.println("My major is " + major);
        System.out.println("My gpa is " + gpa);
    }

    

}
