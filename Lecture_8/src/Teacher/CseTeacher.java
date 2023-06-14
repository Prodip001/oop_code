package Teacher;

public class CseTeacher extends Teacher{
    String mainSubject= "CSE";
    public static void main(String[] args) {
        CseTeacher senior = new CseTeacher();
        System.out.println("Profession : "+senior.designation);
        System.out.println("University :"+senior.uniName);
        System.out.println("Main Subject :"+senior.mainSubject);
    }
}

