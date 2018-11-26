package university;

import java.util.ArrayList;

public class Pulpit {

    private String name;
    private Worker HD;
    private ArrayList<Worker> workers;
    private ArrayList<Group> groups;


    public Pulpit(String name, Worker HD) {
        this.name = name;
        this.HD = new Worker(HD.getName(),HD.getAge(),HD.getVy());
        workers = new ArrayList<Worker>();
        workers.add(HD);
        groups = new ArrayList<Group>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker getHD() {
        return HD;
    }

    public void setHD(Worker HD) {
        this.HD = HD;
    }

    public void addGroup (Group gp) {
        groups.add(gp);
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void addWorker(Worker wk){
        workers.add(wk) ;
    }
}