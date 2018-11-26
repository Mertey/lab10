import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {
    Controller ct;

    public void createMenuWithoutUniversity() {
        System.out.println("You are using app for control university system. " +
                "Unfortunately, you've ran program without university database. Please enter university database: ");
        ct = new Controller();
        System.out.println("Enter file name if file consists in program directory or full path in another case(file in format JSON without .json)[For default using enter filename: Saved]:");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        try {
             fileName = bf.readLine();
        } catch (IOException e) {
            System.out.println("Failing in reading file");
        }
        ct.readUniversityFromJson(fileName);

        createMenuWithUniversity();
    }


    private void createMenuWithUniversity() {
       int choice = -1;

       while (choice < 4){

            System.out.println("Chose variant:\n1. Find student\n2. Find worker\n3. Write university structure and data in file\n4. Exit");
            BufferedReader bfChoiceReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                choice = Integer.parseInt(bfChoiceReader.readLine());
            } catch (IOException e) {
                System.out.println("Wrong choice!");
            }
            switch (choice){
                case 1: {
                    choice = 1;
                    System.out.println("Enter student's name: ");
                    String studentName = "";
                    BufferedReader bfStudentSearch = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        studentName = bfStudentSearch.readLine();
                    } catch (IOException e) {
                        System.out.println("Exception in reading student name");
                    }
                    ct.findStudent(studentName);
                    break;
                }
                case 2: {
                    System.out.println("Enter worker's name: ");
                    String workerName = "";
                    BufferedReader bfWorkerSearch = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        workerName = bfWorkerSearch.readLine();
                    } catch (IOException e) {
                        System.out.println("Exception in reading worker name");
                    }
                    ct.findWorker(workerName);
                    break;
                }
                case 3: {
                    ct.writeUniversityInJsonFile();
                    System.out.println("Successful done");
                    break;
                }
//                case 4: {
//                    choice = 4;
//                    System.exit(0);
//                }
            }
        }


    }


}
