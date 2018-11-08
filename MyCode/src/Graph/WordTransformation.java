package Graph;

//A common word puzzle found in many newspapers and magazines is the word transformation. By
//        taking a starting word and successively altering a single letter to make a new word, one can build
//        a sequence of words which changes the original word to a given end word. For instance, the word
//        “spice” can be transformed in four steps to the word “stock” according to the following sequence:
//        spice, slice, slick, stick, stock. Each successive word differs from the previous word in only
//        a single character position while the word length remains the same.
//        Given a dictionary of words from which to make transformations, plus a list of starting and ending
//        words, your team is to write a program to determine the number of steps in the shortest possible
//        transformation.
//        Input
//        The first line of the input is an integer N, indicating the number of test set that your correct program
//        should test followed by a blank line.
//        Each test set will have two sections. The first section will be the dictionary of available words with
//        one word per line, terminated by a line containing an asterisk (*) rather than a word. There can be
//        up to 200 words in the dictionary; all words will be alphabetic and in lower case, and no word will be
//        longer than ten characters. Words can appear in the dictionary in any order.
//        Following the dictionary are pairs of words, one pair per line, with the words in the pair separated
//        by a single space. These pairs represent the starting and ending words in a transformation. All pairs
//        are guaranteed to have a transformation using the dictionary given. The starting and ending words
//        will appear in the dictionary.
//        Two consecutive input set will separated by a blank line.
//        Output
//        The output should contain one line per word pair for each test set, and must include the starting word,
//        the ending word, and the number of steps in the shortest possible transformation, separated by single
//        spaces.
//        Two consecutive output set will be separated by a blank line.
//
//        Sample Input
//        1
//        dip
//        lip
//        mad
//        map
//        maple
//        may
//        pad
//        pip
//        pod
//        pop
//        sap
//        sip
//        slice
//        slick
//        spice
//        stick
//
//        stock
//        *
//        spice stock
//        may pod
//
//        Sample Output
//        spice stock 4
//        may pod 3

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

 class WordTransformation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            Map map = new HashMap<Integer, ArrayList<String>>();
            String str1 = "";
            while (!str1.equals("*")) {
                str1 = scanner.nextLine();
                int len = str1.length();
                if (map.containsKey(len)) {
                    ArrayList arr = (ArrayList) map.get(len);
                    arr.add(str1);

                } else {
                    ArrayList arr = new ArrayList<String>();
                    arr.add(str1);
                    map.put(len, arr);

                }
            }


            while (scanner.hasNextLine()) {
                String abc = scanner.nextLine();
                if (abc.isEmpty()) {
                    break;
                }
                String start = abc.split(" ")[0];

                String end = abc.split(" ")[1];
                ArrayList<String> arr = (ArrayList<String>) map.get(start.length());
                ArrayList<String> arr1 = (ArrayList<String>) arr.clone();


                arr = (ArrayList<String>) map.get(start.length());
                arr1 = (ArrayList<String>) arr.clone();
                int a = func(arr1, start, end);
                System.out.println(start + " " + end + " " + a);

                // scanner.nextLine();

            }
            System.out.println();

        }
    }

    private static int func(ArrayList<String> arr, String start, String end) {
        if (start.equals(end))
            return 0;
        int len = start.length();
        ArrayList<Integer> count = new ArrayList<>();
        Queue queue = new ArrayDeque();
        queue.add(new x(start, 0));
        count.add(0, 0);
        while (!queue.isEmpty() && arr.size() > 0) {
            x x = (WordTransformation.x) queue.poll();
            String head = x.data;
            int index = x.index;
            arr.remove(head);

            for (String str : arr) {
                if (oneLetterDifference(head, str, start)) {

                    if (str.equals(end)) {
                        return index + 1;
                    }
                    x obj = new x(str, index + 1);
                    queue.add(obj);
                }
            }

        }


        return -1;
    }

    private static boolean oneLetterDifference(String head, String str, String tail) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (head.charAt(i) == str.charAt(i)) {

            } else {
                count++;
            }
        }
        if (count == 1)
            return true;
        return false;
    }

    static class x {
        String data;
        int index;

        x(String data, int index) {
            this.data = data;
            this.index = index;
        }
    }
}

//1
//
//dip
//lip
//mad
//map
//maple
//may
//pad
//pip
//pod
//pop
//sap
//sip
//slice
//slick
//spice
//stick
//stock
//*
//spice stock
//
//may pod