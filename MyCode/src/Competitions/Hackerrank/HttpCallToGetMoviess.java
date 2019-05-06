//package Competitions.Hackerrank;
//
//import java.io.BufferedReader;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.ProtocolException;
//import java.net.URL;
//
//public class HttpCallToGetMoviess {
//
//    static String[] getMovieTitles(String substr) {
//        int total=1,page=1;
//        do{
//        URL url = null;
//        try {
//            url = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title="+substr+"&page="+page);
//
//        HttpURLConnection con = (HttpURLConnection) url.openConnection();
//        con.setRequestMethod("GET");
//            BufferedReader in = new BufferedReader(
//                    new InputStreamReader(
//                            con.getInputStream()));
//            String inputLine;
//            StringBuilder str = new StringBuilder();
//            while ((inputLine = in.readLine()) != null){
//                System.out.println(inputLine);
//                str.append(inputLine);
//            }
//            in.close();
//            inputLine = str.toString();
//            if(inputLine.contains("total")) {
//                int index = inputLine.indexOf("total");
//                inputLine.replaceAll()/(^")|("$)/g, '')
//                String totalPages = inputLine.substring(index + 7, index + 9);
//               total = Integer.parseInt(totalPages);
//            }
//
//            if(inputLine.contains("Title")) {
//                int index = inputLine.indexOf("Title");
//                while (index!=-1) {
//                     index = inputLine.indexOf("Title");
//                     inputLine = inputLine.substring(index+7);
//                     int index1=index;
//                     int coumt=0;
//                     while (inputLine.charAt(index1)!=','){
//                         index1++;
//                     }
//                    String titleOf = inputLine.substring(index,index1);
//                }
//            }
//
//
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (ProtocolException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        page++;
//    }    while(page<=total);
//        return new String[1];
//    }
//
//    public static void main(String [] args){
//        String str="spiderman";
//        String  [] a = getMovieTitles(str);
//        System.out.println(str);
//
//    }
//
//}
