package Competitions.Flipkart1;

import java.util.*;

public class BasedOnTopic implements CreateQuestion {
    static  Double totalSum;
    @Override
    public QuestionPaper getQuestion(List<Question> questionBank, Double marks) {
        if(questionBank==null || questionBank.size()==0){
            System.out.println("No questions in bank");
            return null;
        }
        QuestionPaper questionPaper = new QuestionPaper();
        Scanner scanner = new Scanner(System.in);
        questionPaper.questionPaper = new ArrayList<>();

        System.out.println("Enter percentage for ");

        System.out.println(java.util.Arrays.asList(Topic.values()));
        try {


            int os  = scanner.nextInt();
            int algo = scanner.nextInt();

            Map<Topic,List<Question>> map  = getAllQuestions(questionBank);


            if(os>0){
                List list1 = getQuestionBasedOnCriteria(map.get(Topic.OS),((os*marks)/100));
                if(list1!=null){
                    questionPaper.questionPaper.addAll(list1);
                }
            }

            if(algo>0){
                List list1 = getQuestionBasedOnCriteria(map.get(Topic.ALGO),((algo*marks)/100));
                if(list1!=null){
                    questionPaper.questionPaper.addAll(list1);
                }
            }

            }


        catch (IllegalArgumentException e){

        }catch (Exception e1){

        }
        return questionPaper;


    }




    public static List<Question> getQuestionBasedOnCriteria(List<Question> questions,Double marks){
        Collections.sort(questions, new Comparator<Question>() {
            @Override
            public int compare(Question o1, Question o2) {
                return (int) (o1.getMarks()-o2.getMarks());
            }
        });

        List<Question> listOfQuestions = new ArrayList<>();
        int sum=0;
        for(int i = 0;i<questions.size();i++){
            sum = (int) (sum+questions.get(i).getMarks());
            if(sum==marks){
                listOfQuestions.add(questions.get(i));
                return listOfQuestions;
            }else
            if(sum>marks){
                return listOfQuestions;
            } else
            listOfQuestions.add(questions.get(i));

        }

        System.out.println("We dont have enough question in this criteria...Adding whole set");
        System.out.println("Total marks/out of"+sum+"/"+marks);
        // totalSum+=sum;
        return listOfQuestions;
    }


    public static Map<Topic,List<Question>> getAllQuestions(List<Question> questionBank) {
        Map<Topic, List<Question>> map = new HashMap<>();

        for (int i = 0; i < questionBank.size(); i++) {
            Question question = questionBank.get(i);
            if (question.getTopic().equals(Topic.ALGO)) {
                if (map.containsKey(Topic.ALGO)) {
                    map.get(Topic.ALGO).add(question);
                } else {

                    List<Question> list = new ArrayList<>();
                    list.add(question);
                    map.put(Topic.ALGO, list);
                }
            }
            if (question.getTopic().equals(Topic.OS)) {
                if (map.containsKey(Topic.OS)) {
                    map.get(Topic.OS).add(question);
                } else {

                    List<Question> list = new ArrayList<>();
                    list.add(question);
                    map.put(Topic.OS, list);
                }
            }
        }
        return map;
    }
}
