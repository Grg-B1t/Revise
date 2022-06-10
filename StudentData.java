public class StudentData{
    private int ID;
    private double gpa;
    private String name;
    private int age;
    private String major;

    public StudentData(int iD, double gpa, String name, int age, String major) {
        ID = iD;
        this.gpa = gpa;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public int getID() {
        return ID;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }
    
}