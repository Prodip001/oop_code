public class Test {
    public static void main(String[]args){
        Student one ;
        one = new Student();
        one.setInformation("134","Prodip",3.40,"CSE");
        Student two = new Student();
        two.setInformation("456","Mredul",3.50,"CSE");

        Student three = new Student();
        three.setInformation("678","Toha",3.65,"CSE");
        System.out.println("Student three information :");

        three.getInformation();

    }


}