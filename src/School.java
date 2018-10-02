public class School {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Hanna", "Nowakowska", 28, 1997);
        Teacher teacher2 = new Teacher("Gosia", "Kowalczyk", 67, 2009);
        Teacher teacher3 = new Teacher("Franek", "Dolas", 84, 1970);

        Student student1 = new Student("Maciej", "Polak", 5, 5);
        Student student2 = new Student("Filip", "Kaczynski", 8, 4);
        Student student3 = new Student("Frania", "Bartoszewska", 7, 3);
        Student student4 = new Student("Bartek", "Kurek", 11, 8);

        System.out.println("Teachers:");
        teacher1.showInfo();
        teacher2.showInfo();
        teacher3.showInfo();
        System.out.println("\nStudents:");
        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
    }
}