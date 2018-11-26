package university;

public class Worker extends Person implements Rebuild {


    private Vacancy vy;



    public Worker(String name, int age, Vacancy vy) {
        this.name = name;
        this.age = age;
        this.vy = vy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Vacancy getVy() {
        return vy;
    }

    public void setVy(Vacancy vy) {
        this.vy = vy;
    }

    public enum Vacancy {PG, docent, professor, HD, dean, semiDean, rector, semiRector};
    //Where PG is post graduated student
    //HD - Head of the Department

}
