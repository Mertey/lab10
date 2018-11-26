package university;

import java.util.ArrayList;

public class Faculty {

    private String name;

    private Worker dean;

    private Worker semiDean;

    private ArrayList<Pulpit> pulpits;

    public Faculty(String name, Worker dean, Worker semiDean) {
        this.name = name;
        this.dean = new Worker(dean.getName(),dean.getAge(),dean.getVy());
        this.semiDean = new Worker(semiDean.getName(),semiDean.getAge(),semiDean.getVy());
        pulpits = new ArrayList<Pulpit>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker getDean() {
        return dean;
    }

    public void setDean(Worker dean) {
        this.dean = dean;
    }

    public Worker getSemiDean() {
        return semiDean;
    }

    public ArrayList<Pulpit> getPulpits() {
        return pulpits;
    }

    public void setSemiDean(Worker semiDean) {
        this.semiDean = semiDean;
    }

    public void addPulpit(Pulpit pt){
        pulpits.add(pt);
    }


}
