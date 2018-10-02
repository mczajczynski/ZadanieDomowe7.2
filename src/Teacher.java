public class Teacher extends People {

    private int startYear;

    public Teacher(String firstName, String surname, int age, int startYear) {
        super(firstName, surname, age);
        setStartYear(startYear);
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    void showInfo() {
        System.out.println(getFirstName() + " " + getSurname() + ", age: " + getAge() + ", work start: " +
                getStartYear());
    }
}