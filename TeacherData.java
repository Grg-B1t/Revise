public class TeacherData{
    private int ID;
    private String name;
    private int age;
    private String course;

    public TeacherData(int iD, String name, int age, String course) {
        ID = iD;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    
    
    
}