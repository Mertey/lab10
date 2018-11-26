package university;

public class stSearchModel extends Person implements Rebuild {
    private String universityName;
    private String facultyName;
    private String deanName;
    private String headName;
    private String groupName;


    private boolean exists;

    public stSearchModel(boolean exists) {
        this.exists = exists;
    }


    public stSearchModel(Student stud, String universityName, String facultyName, String deanName, String headName, String groupName) {
        this.exists = true;
        this.universityName = universityName;
        this.facultyName = facultyName;
        this.deanName = deanName;
        this.headName = headName;
        this.groupName = groupName;
        this.name = stud.getName();
        this.age = stud.getAge();
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getDeanName() {
        return deanName;
    }

    public void setDeanName(String deanName) {
        this.deanName = deanName;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        if(exists) {
            return "Found next student: Name:" + getName() + "; Age is "+ getAge() + "; Student's grous is " + getGroupName() +
                    "; Head Student name is " + getHeadName() + "; Dean name: " + getDeanName() + "; Student study at the faculty " + getFacultyName() + "; At the " + getUniversityName() + "university";
        }
        else{
            return "There is not any student with required name. ";
        }
    }
}
