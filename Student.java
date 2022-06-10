public class Student extends Person {
    private int ID;
    private String major;
    private double gpa;

    public Student(StudentData sd) {
        super(sd.getName(), sd.getAge());
        ID = sd.getID();
        major = sd.getMajor();
        this.gpa = sd.getGpa();
    }

    @Override
    public void intro() {
        // TODO Auto-generated method stub
        System.out.println("Hi! May name is " + super.getName());
        System.out.println("My student ID is " + ID);
        System.out.println("May age is "  + super.getAge());
        System.out.println("My major is " + major);
        System.out.println("My gpa is " + gpa);
    }

    

}
