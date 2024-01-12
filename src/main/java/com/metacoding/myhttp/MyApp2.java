package com.metacoding.myhttp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//title, body만 콘솔에 출력
public class MyApp2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );

            String download = "";

            while (true){
                String line = br.readLine(); // '\' 때문에 while을 돌려서 찾아낸다

                if(line==null)
                    break;

                download = download + line;
            }
            ObjectMapper om = new ObjectMapper();
            Posts posts = om.readValue(download, Posts.class);

            System.out.println(posts.getTitle());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

//ctrl + alt + l : 코드 들여쓰기 정렬
//단계별로 실행해보자