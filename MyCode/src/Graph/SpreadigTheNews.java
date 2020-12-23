package Graph;

//In a large organization, everyone knows a lot of colleagues. However, friendship relations are kept with
//        only a few of them, to whom news are told.
//        Suppose that whenever an employee knows of a piece of news, he tells it to all his friends on the
//        following day. So, on the first day, the source of the information tells it to his friends; on the second
//        day, the source’s friends tell it to their friends; on the third day, the friends of the source’s friends’ tell
//        it to their friends; and so on.
//        The goal is to determine:
//        • the maximum daily boom size, which is the largest number of employees that, on a single day,
//        hear the piece of news for the first time; and
//        • the first boom day, which is the first day on which the maximum daily boom size occurs.
//        Write a program that, given the friendship relations between the employees and the source of a piece
//        of news, computes the maximum daily boom size and the first boom day of that information spreading
//        process.
//        Input
//        The first line of the input contains the number E of employees (1 ≤ E ≤ 2500). Employees are
//        numbered from 0 to E − 1.
//        Each of the following E lines specifies the set of friends of an employee’s (from employee 0 to
//        employee E − 1). A set of friends contains the number of friends N (0 ≤ N < 15), followed by N
//        distinct integers representing the employee’s friends. All integers are separated by a single space.
//        The next line contains an integer T (1 ≤ T < 60), which is the number of test cases.
//        Each of the following T lines contains an employee, which represents the (unique) source of the
//        piece of news in the test case.
//
//Output
//        The output consists of T lines, one for each test case.
//        If no employee (but the source) hears the piece of news, the output line contains the integer ‘0’.
//        Otherwise, the output line contains two integers, M and D, separated by a single space, where M
//        is the maximum daily boom size and D is the first boom day.
//        Sample Input
//        6
////        2 1 2
////        2 3 4
////        3 0 4 5
////        1 4
////        0
////        2 0 2
////        3
//        0
//        4
//        5
//        Sample Output
//        3 2
//        0
//        2 1

import java.util.*;

class SpreadigTheNews {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < a; j++) {
                arr.add(scan.nextInt());
            }
            edges.add(arr);
        }

        int test = scan.nextInt();
        while (test > 0) {
            test--;
            func(scan.nextInt(), edges, n);
        }

    }

    private static void func(int a, ArrayList<ArrayList<Integer>> edges, int nodes) {

        boolean[] visited = new boolean[nodes];
        Queue<Integer> queue = new ArrayDeque<>(nodes);
        int[] count = new int[nodes];
        Map<Integer, Integer> map = new HashMap<>();
        count[a] = 0;
        queue.add(a);
        visited[a] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            ArrayList<Integer> vertices = edges.get(node);

            for (int j = 0; j < vertices.size(); j++) {
                int edge = vertices.get(j);

                if (!visited[edge]) {
                    queue.add(edge);
                    count[edge] = count[node] + 1;
                    map.put(count[edge], map.getOrDefault(count[edge], 0) + 1);
                    visited[edge] = true;
                }
            }
        }


        int max = 0;
        int index = 0;
        if (map.size() == 0) {
            System.out.println(0);
        } else {
            for (Map.Entry<Integer, Integer> obg : map.entrySet()) {
                if (max < obg.getValue()) {
                    index = obg.getKey();
                    max = obg.getValue();
                }

            }
            System.out.println(max + " " + index);
        }

    }

}
