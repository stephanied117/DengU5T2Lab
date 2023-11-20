public class Student {
    private String name;
    private int gradeLevel;
    private String school;

    /* Write the two constructors here, as described above */
    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        if (gradeLevel > 0 && gradeLevel < 6) {
            this.school = "elementary school";
        } else if (gradeLevel > 5 && gradeLevel < 9) {
            this.school = "middle school";
        } else if (gradeLevel > 8 && gradeLevel < 13) {
            this.school = "high school";
        } else {
            this.school = "unknown";
        }
    }
    public Student(String name, int gradeLevel, String school) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.school = school;
    }
    public String studentInfo() {
        /* implement me, as described above */
        return name + " is in grade " + gradeLevel + " and goes to " + school;
    }
}
