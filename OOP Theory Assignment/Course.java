public class Course {

    private String courseCode;
    private String courseName;
    private int creditHours;

    public Course() {
        this.courseCode = "C0000";
        this.courseName = "No Course";
        this.creditHours = 0;
    }

    public Course(String courseCode, String courseName, int creditHours) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    public void setCourseInfo(String courseCode, String courseName, int creditHours) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void displayCourseInfo() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credit Hours: " + creditHours);
    }

    private void internalMethod() {
    }

    protected void protectedMethod() {
    }

    public static void main(String[] args) {
        Course course1 = new Course();
        course1.displayCourseInfo();

        Course course2 = new Course("CS101", "Introduction to Computer Science", 3);
        course2.displayCourseInfo();

        course1.setCourseInfo("MATH202", "Calculus II", 4);
        course1.displayCourseInfo();
    }
}

