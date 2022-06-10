public class Teacher extends Person {

    private int ID;
    private String course;

    
    
    public Teacher(TeacherData td) {
        super(td.getName(), td.getAge());
        course = td.getCourse();
        ID = td.getID(); 
    }



    public void intro() {
        System.out.println("Hi! I am a teacher. My name is " + super.getName());
        System.out.println("My ID is " + ID);
        System.out.println("May age is "  + super.getAge());
        System.out.println("I am teacher of " + course);
    }
}
