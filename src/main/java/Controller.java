import university.University;
import university.stSearchModel;
import university.wkSearchModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;

public class Controller {

     private University uty;



     public void readUniversityFromJson(String fileName) {
         try {
             Gson gson = new Gson();
             BufferedReader br = new BufferedReader(new FileReader(fileName + ".json"));
             uty = gson.fromJson(br, new TypeToken<University>(){}.getType());
         } catch (FileNotFoundException e) {
             System.out.println("Exception caused by reading file:  " + fileName + ".json");}
     }


     public void writeUniversityInJsonFile() {
         try (Writer writer = new FileWriter(uty.getName() + ".json")) {
             Gson gson = new GsonBuilder().create();
             gson.toJson(uty, writer);
         }
         catch (IOException e) {
             e.printStackTrace();
         }
     }

     public void findStudent(String studentName) {
         stSearchModel res;
         res = uty.findStudent(studentName);
         System.out.println(res.toString());
     }

    public void findWorker(String workerName) {
        wkSearchModel res;
        res = uty.findWorker(workerName);
        System.out.println(res.toString());
    }




}

