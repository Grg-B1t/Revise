import java.util.ArrayList;

class Main{
        public static void main(String[] args) {
        ArrayList<StudentData> sd = new ArrayList<>();
        sd.add(new StudentData(1, 3.5, "Sam", 20, "Computer Science"));

        ArrayList<TeacherData> td = new ArrayList<>();
        td.add(new TeacherData(1, "Douglus", 32, "Computer Science"));

       Student s = new Student(sd.get(0)); 
       Teacher t = new Teacher(td.get(0));

       s.intro();
       System.out.println("----------------------------");
       t.intro();

    }
}