package Competitions.Flipkart1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    public static List<Question> questionBank = new ArrayList<>();
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String flag="1";
        System.out.println("CASE SENSITIVE INPUTS");

        System.out.println("Add questions");
        do { try {

            System.out.println("Enter Marks");
            Double marks = Double.valueOf(scan.nextLine());

            System.out.println("Enter text");
            String text = scan.nextLine();

            System.out.println("Enter subject");
            String sub = scan.nextLine();

            System.out.println("Enter topic");
            String topic = scan.nextLine();

            System.out.println("Enter Difficulty");
            String diff = scan.nextLine();



            System.out.println("Want to add more ? 1/0");

            flag = scan.nextLine();

            Question questionPaper = new Question();
            questionPaper.setDifficulty(Difficulty.valueOf(diff));
            questionPaper.setText(text);
            questionPaper.setSubject(Subject.valueOf(sub));
            questionPaper.setMarks(marks);
            questionPaper.setTopic(Topic.valueOf(topic));

            questionBank.add(questionPaper);

        } catch (Exception e){
            System.out.println("Some issue in Input.. FAILED");

        }




        }while (flag.equals("1"));

            List<Question> finalQuestionPaper = new ArrayList<>();
            Double finalMArks=0.0;

            System.out.println("Start creating question");
        do {
            System.out.println("How many marks  FOR THIS CRITERIA");
            Double marks = Double.valueOf(scan.nextLine());

            System.out.println("SELECT A CRITERIA FROM THESE");
            System.out.println(java.util.Arrays.asList(Criterias.values()));

            String criteria = scan.nextLine();
            try {
                CreateQuestion createQuestion = Factory.getCriteria(criteria);

                List<Question> list = createQuestion.getQuestion(questionBank, marks);
                finalQuestionPaper.addAll(list);
                finalMArks+=marks;
                System.out.println("Paper framed of totalMarks"+ finalMArks);
                System.out.println("Want to add more criteria 1/0");
                flag = scan.nextLine();
            } catch (Exception e){
                System.out.println("Error..Retry");

            }

        }
        while (flag.equals("1"));
        printAllList(finalQuestionPaper);
    }

    public static void printAllList(List<Question> list){
        if(list==null || list.size()==0){
            System.out.println("List is empty");
                    return;
        }
        for(int i=0;i<list.size();i++){
            Question question = list.get(i);
            System.out.println("Subject " + question.getSubject());
            System.out.println("Difficulty "+ question.getDifficulty());
            System.out.println("Topic "+ question.getTopic());


        }
    }
}
