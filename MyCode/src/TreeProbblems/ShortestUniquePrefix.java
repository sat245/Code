package TreeProbblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class ShortestUniquePrefix {
//
//     public static ArrayList<String> prefix(ArrayList<String> A) {
//         Trie trie = new Trie(true,null,new ArrayList<Trie>());
//         for(int i=0;i<A.size();i++){
//             String str = A.get(0);
//             int count = 0;
//             Trie root = trie;
//             while(count<str.length()){
//                 String  x= String.valueOf(str.charAt(count));
//                 if(trie.data.containsKey(x)){
//
//                 }else{
//
//                 }
//                 count++;
//             }
//         }
//     }
}

 class Trie {

    boolean isEnd=true;
    Map<String,String> data = new HashMap();
    ArrayList<Trie> arrayList = new ArrayList<>();

    public Trie(boolean isEnd,  Map<String,String> data, ArrayList<Trie> arrayList) {
        this.isEnd = isEnd;
        this.data = data;
        this.arrayList = arrayList;
    }
}
