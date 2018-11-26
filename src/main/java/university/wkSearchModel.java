package university;

public class wkSearchModel extends Person implements Rebuild   {

    private String pulpitName;
    private String facultyName;
    private String universityName;
    private String vac;
    boolean exists;

    public wkSearchModel(boolean exists) {
        this.exists = false;
    }

    public wkSearchModel(Worker wk, String pulpitName, String facultyName, String universityName) {
        this.exists = true;
        this.name = wk.name;
        this.age = wk.getAge();
        this.vac = wk.getVy().toString();
        this.pulpitName = pulpitName;
        this.facultyName = facultyName;
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        if(exists) {
            return "Found next worker: Name: " + getName() + "; Age is "+ getAge() + "; Worker's vacancy is " + getVac() + "; Worker's pulpit is " + getPulpitName() +
                    "; Worker's faculty is " + getFacultyName() +"; Works at the " + getUniversityName() + "university";
        }
        else{
            return "There is not any worker with required name. ";
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public String getPulpitName() {
        return pulpitName;
    }

    public void setPulpitName(String pulpitName) {
        this.pulpitName = pulpitName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getVac() {
        return vac;
    }

    public void setVac(String vac) {
        this.vac = vac;
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }
}
