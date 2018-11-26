package university;

import java.util.ArrayList;

public class University {

    private String name;
    private Worker rector;
    private Worker semiRector;
    private ArrayList<Faculty> faculties;

    public University(String name, Worker rector, Worker semiRector) {
        this.name = name;
        this.rector = new Worker(rector.getName(), rector.getAge(), rector.getVy());
        this.semiRector = new Worker(semiRector.getName(), semiRector.getAge(), semiRector.getVy());
        faculties = new ArrayList<Faculty>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker getRector() {
        return rector;
    }

    public void setRector(Worker rector) {
        this.rector = rector;
    }

    public Worker getSemiRector() {
        return semiRector;
    }

    public void setSemiRector(Worker semiRector) {
        this.semiRector = semiRector;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(ArrayList<Faculty> faculties) {
        this.faculties = faculties;
    }

    public void addNewFaculty(Faculty fc) {
        faculties.add(fc);
    }

    public stSearchModel findStudent( String studentName) {//UnitType - find Student or Worker
        stSearchModel st = new stSearchModel(false);


        for (int i = 0; i < faculties.size(); i++) {//on faculties
            for (int j = 0; j < faculties.get(i).getPulpits().size(); j++) {//on cafedras
                for (int k = 0; k < faculties.get(i).getPulpits().get(j).getGroups().size(); k++) {//on groups
                    for (int l = 0; l < faculties.get(i).getPulpits().get(j).getGroups().get(k).getStudents().size(); l++) {
                        if (faculties.get(i).getPulpits().get(j).getGroups().get(k).getStudents().get(l).getName().equals(studentName)) {
                            st = new stSearchModel(faculties.get(i).getPulpits().get(j).getGroups().get(k).getStudents().get(l),
                                    this.getName(), faculties.get(i).getName(),
                                    faculties.get(i).getDean().getName(), faculties.get(i).getPulpits().get(j).getGroups().get(k).getHeadman().getName(),
                                    faculties.get(i).getPulpits().get(j).getGroups().get(k).getName());
                        }
                    }
                }
            }
        }
            return st;





    }

    public wkSearchModel findWorker( String workerName) {
        wkSearchModel wk = new wkSearchModel(false);

        for (int i = 0; i < faculties.size(); i++) {//on faculties
            for (int j = 0; j < faculties.get(i).getPulpits().size(); j++) {//on cafedras
                for (int k = 0; k < faculties.get(i).getPulpits().get(j).getWorkers().size(); k++) {//on groups
                    if (faculties.get(i).getPulpits().get(j).getWorkers().get(k).getName().equals(workerName)) {
                        wk = new wkSearchModel(faculties.get(i).getPulpits().get(j).getWorkers().get(k),
                                faculties.get(i).getPulpits().get(j).getName(),
                                faculties.get(i).getName(), this.getName());
                    }
                }
            }
        }
        return wk;
    }

    }
