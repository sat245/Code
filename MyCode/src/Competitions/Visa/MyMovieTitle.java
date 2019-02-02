package Competitions.Visa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Scanner;

public class MyMovieTitle {
    static String[] getMovieTitles(String substr) {

        String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title="+substr;
        try {
            URL obj = new URL(url);
            URLConnection conn = obj.openConnection();
            InputStream input = conn.getInputStream();
            Map<String, String> map = new Gson().fromJson(new InputStreamReader(input, "UTF-8"), new TypeToken<Map<String, String>>(){}.getType());


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
    }
}
