
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz_App {
    public static void main(String[] args) throws IOException, ParseException {
        try{
            // User information reading from file section

            String userpath = "./src/main/resources/users.json";

            JSONParser jsonParser = new JSONParser();
            JSONArray usersArray = (JSONArray) jsonParser.parse(new FileReader(userpath));

            JSONObject adminObj = (JSONObject) usersArray.get(0);
            JSONObject studentObj = (JSONObject) usersArray.get(1);

            String adminName = (String) adminObj.get("username");
            String adminPassword = (String) adminObj.get("password");
            int adminpassword = Integer.parseInt(adminPassword);

            String studentName = (String) studentObj.get("username");
            String studentPassword = (String) studentObj.get("password");
            int studentpassword = Integer.parseInt(studentPassword);

            //user input section

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your username");
            String user_name = input.next();

            System.out.println("Enter password");

            int password = input.nextInt();
            input.nextLine();

            // Check user is Admin or Student

            if (user_name.equals(adminName) && password==adminpassword)
            {
                // Admin section

                String quizpath = "./src/main/resources/quiz.json";
                System.out.println("Welcome admin! Please create new questions in the question bank.");

                char ch;
                // Admin creating question section
                do {
                    JSONParser jsonParserq = new JSONParser();
                    JSONArray quizArray = (JSONArray) jsonParserq.parse(new FileReader(quizpath));

                    JSONObject createQues = new JSONObject();


                    System.out.println("Input your Question: ");
                    createQues.put("question",input.nextLine());

                    System.out.println("Input option 1: ");
                    createQues.put("Input option 1: ",input.nextLine());

                    System.out.println("Input option 2: ");
                    createQues.put("Input option 2: ",input.nextLine());

                    System.out.println("Input option 3: ");
                    createQues.put("Input option 3: ",input.nextLine());

                    System.out.println("Input option 4: ");
                    createQues.put("Input option 4: ",input.nextLine());

                    System.out.println("AnswerKey: ");
                    createQues.put("AnswerKey",input.nextLine());

                    quizArray.add(createQues);

                    FileWriter fileWriter = new FileWriter(quizpath);
                    fileWriter.write(quizArray.toString());
                    fileWriter.flush();
                    fileWriter.close();
                    System.out.println("Saved successfully! Do you want to add more questions? (press s for start and q for quit)");
                    ch = input.next().charAt(0);
                    input.nextLine();
                }while (ch !='q');

                // Check user is Admin or Student

            }
            else if (user_name.equals(studentName) && password==studentpassword)
            {
                // Student section

                System.out.println("Welcome pranab to the quiz! We will throw you 10 questions. Each MCQ mark is 1 and no negative marking. Are you ready? Press 's' to start.");
                //.......................................................

                char cha = input.next().charAt(0);
                input.nextLine();
                if(cha == 's') {

                    String quizpath = "./src/main/resources/quiz.json";
                    char ch;
                    do {
                        JSONParser jsonParsers = new JSONParser();
                        JSONArray quizArray = (JSONArray) jsonParsers.parse(new FileReader(quizpath));

                        //Quiz test section

                        int count = 0;
                        for (int i = 0; i < 10; i++) {

                            JSONObject quiz0Obj = (JSONObject) quizArray.get((int) (Math.random() * (30 - 0) + 0));

                            String question = (String) quiz0Obj.get("question");
                            String option1 = (String) quiz0Obj.get("Input option 1: ");
                            String option2 = (String) quiz0Obj.get("Input option 2: ");
                            String option3 = (String) quiz0Obj.get("Input option 3: ");
                            String option4 = (String) quiz0Obj.get("Input option 4: ");
                            String answerkey = (String) quiz0Obj.get("AnswerKey");

                            System.out.println("[Question " + (i + 1) + "] " + question);
                            System.out.println("1. " + option1);
                            System.out.println("2. " + option2);
                            System.out.println("3. " + option3);
                            System.out.println("4. " + option4);

                            System.out.print("Put answer : ");
                            String answer = input.nextLine();
                            System.out.println();
                            if (answer.equals(answerkey)) {
                                count++;
                            }
                        }

                        if (count >= 8) {
                            System.out.println("Excellent! You have got " + count + " out of 10");
                        } else if (count >= 5 && count < 8) {
                            System.out.println("Good. You have got " + count + " out of 10");
                        } else if (count >= 2 && count<5) {
                            System.out.println("Very poor! You have got " + count + " out of 10");
                        } else if (count >= 0 && count < 2) {
                            System.out.println("Very sorry you are failed. You have got " + count + " out of 10");
                        }
                        System.out.println("Would you like to start again? press s for start or q for quit");
                        ch = input.next().charAt(0);

                        if (ch != 's') {
                            break;
                        }
                        input.nextLine();

                    } while (ch != 'q');
                }
                else
                {
                    System.out.println("You are not ready.");
                }
                //......................................................
            }
            else {
                System.out.println("Invalid Username or Password. Please try again..");
            }

        }
        catch(Exception exception)
        {
            System.out.println("Please enter username as string and password as integer number..");
        }
        finally{
            System.out.println("\n\nYou are exited from the program.\nTo continue please rerun this program and Login Again");
        }
    }
}