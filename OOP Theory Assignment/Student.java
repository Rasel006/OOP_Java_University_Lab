public class Student{

    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String major;

    public Student(){
        this("", "", "", 0, "");
    }

    public Student(String studentId, String firstName, String lastName, int age, String major) {
        this.studentId=studentId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.major=major;
    }

    public String getStudentId(){
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }

    public boolean isEligibleForGraduation() {
        return age >= 18;
    }

    public void updateStudentInfo(String firstName, String lastName, int age, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
    }

    public static void main(String[] args) {

        Student student1 = new Student();

        Student student2 = new Student("0272230005101014", "Rizu", "Islam", 20, "Computer Science");

        student1.displayStudentInfo();
        System.out.println("Is Student 2 eligible for graduation? " + student2.isEligibleForGraduation());

        student1.updateStudentInfo("Md.", "Rasel", 22, "Mathematics");
        student1.displayStudentInfo();
    }
}
