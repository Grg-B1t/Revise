public class Teacher extends Person {

    private String teaches;

    
    
    public Teacher(String name, int age, String teaches) {
        super(name, age);
        this.teaches = teaches;
    }



    public void intro() {
        System.out.println("Hi! I am a teacher. My name is " + super.getName());
        System.out.println("May age is "  + super.getAge());
        System.out.println("I am teacher of " + teaches);
    }
}
