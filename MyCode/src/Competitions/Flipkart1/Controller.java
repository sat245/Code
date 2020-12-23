package Competitions.Flipkart1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    static Double finalMArks = 0.0;
    static Long questionId = new Long(0);
    public static List<Question> questionBank = new ArrayList<>();
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        String flag = "1";
        System.out.println("CASE SENSITIVE INPUTS");

        System.out.println("Add questions");
        do {
            add(new Question());
            System.out.println("Want to add more ? 1/0");
            flag = scan.nextLine();
        } while (flag.equals("1"));

        List<Question> finalQuestionPaper = new ArrayList<>();
do {
    System.out.println("Start creating question");
    do {

        System.out.println("SELECT A CRITERIA FROM THESE");
        System.out.println(java.util.Arrays.asList(Criterias.values()));
        String criteria = scan.nextLine();


        System.out.println("How many marks  FOR THIS CRITERIA");
        Double marks = Double.valueOf(scan.nextLine());


        try {
            CreateQuestion createQuestion = Factory.getCriteria(criteria);
            QuestionPaper questionPaper = createQuestion.getQuestion(questionBank, marks);
            List<Question> list = questionPaper.questionPaper;
            finalQuestionPaper.addAll(list);
            double sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum = sum + list.get(i).getMarks();
            }
            finalMArks += sum;
            System.out.println("Paper framed of totalMarks" + finalMArks);
            if (finalMArks>=100){
                System.out.println("NO more criteria can be added.100 marks question is formed");

                flag = "0";
            }else {
                System.out.println("Want to add more criteria 1/0");
                flag = scan.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Error..Retry");

        }

    }
    while (flag.equals("1"));
    printAllList(finalQuestionPaper);

    do {
        System.out.println("Bonus Feature");
        System.out.println(java.util.Arrays.asList(QuestionBankOperation.values()));

        String operation = scan.nextLine();

        switch (QuestionBankOperation.valueOf(operation)) {

            case ADD: {
                add(new Question());
                printAllList(questionBank);
                break;
            }
            case DELETE: {
                delete();
                printAllList(questionBank);
                break;
            }
            case MODIFY: {
                modify();
                printAllList(questionBank);
                break;
            }
        }
        System.out.println("Want to perform more operations on questionbank? 1/0");
        flag = scan.nextLine();
    } while (flag.equals("1"));

    System.out.println("Want to create more questions 1/0");
    flag = scan.nextLine();
}while (flag.equals("1"));

    }



    public static void printAllList(List<Question> list){
        if(list==null || list.size()==0){
            System.out.println("List is empty");
                    return;
        }
        for(int i=0;i<list.size();i++){
            Question question = list.get(i);
            System.out.println("************");
            System.out.println("Question Id " + question.getQuestionId());
            System.out.println("Subject " + question.getSubject());
            System.out.println("Difficulty "+ question.getDifficulty());
            System.out.println("Topic "+ question.getTopic());
            System.out.println("Text "+ question.getText());
            System.out.println("************");



        }
    }

    public static void add( Question questionPaper) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println(" QuestionId " + ++questionId);
        //    Long id = Long.valueOf(scan.nextLine());

            System.out.println("Enter Marks");
            Double marks = Double.valueOf(scan.nextLine());

            System.out.println("Enter text");
            String text = scan.nextLine();

            System.out.println("Enter subject");
            System.out.println(java.util.Arrays.asList(Subject.values()));
            String sub = scan.nextLine();

            System.out.println("Enter topic");
            System.out.println(java.util.Arrays.asList(Topic.values()));
            String topic = scan.nextLine();

            System.out.println("Enter Difficulty");
            System.out.println(java.util.Arrays.asList(Difficulty.values()));
            String diff = scan.nextLine();





            questionPaper.setQuestionId(questionId);
            questionPaper.setDifficulty(Difficulty.valueOf(diff));
            questionPaper.setText(text);
            questionPaper.setSubject(Subject.valueOf(sub));
            questionPaper.setMarks(marks);
            questionPaper.setTopic(Topic.valueOf(topic));

            questionBank.add(questionPaper);

        } catch (Exception e){
            System.out.println("Some issue in Input.. FAILED");

        }

    }

    public static void delete() {

        if(questionBank==null || questionBank.size()==0){
            return;
        }
        try {
            System.out.println("Enter question id to be deleted");
            Scanner scanner = new Scanner(System.in);
            Long id = Long.valueOf(scanner.nextLine());

            for(int i=0;i<questionBank.size();i++){
                if(questionBank.get(i).getQuestionId()==id){
                    questionBank.remove(i);
                    System.out.println("Successfully deleted");
                    return;
                }
            }

            System.out.println("could not find id");



        } catch (Exception e) {

        }
    }

    public static void modify() {

        if(questionBank==null || questionBank.size()==0){
            return;
        }
        try {
            System.out.println("Enter question id to be deleted");
            Scanner scanner = new Scanner(System.in);
            Long id = Long.valueOf(scanner.nextLine());

            for(int i=0;i<questionBank.size();i++){
                if(questionBank.get(i).getQuestionId()==id){
                    Question question = questionBank.get(i);
                    add(question);
                    System.out.println("Successfully moodified");
                    return;
                }
            }

            System.out.println("could not find id");



        } catch (Exception e) {

        }
    }
}
