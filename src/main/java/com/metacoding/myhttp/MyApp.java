package com.metacoding.myhttp;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class MyApp {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/todos/1"); //ip주소 포트는 디폴트로 80이라 생략가능
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();  // 서버 소켓에 연결 그러므로 conn은 소켓이다
            //소켓을 만들기 위한 객체 프로토콜이 적혀있는 소켓

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()) // 소켓 연결
            );

            String download = "";

            while (true){
                String line = br.readLine(); // '\' 때문에 while을 돌려서 찾아낸다

                if(line==null)
                    break;

                download = download + line;
            }
            //System.out.println(download);

            ObjectMapper om = new ObjectMapper();
            Todo todo = om.readValue(download, Todo.class);

            //jason은 빈 생성자를 만들어주면 parsing 해준다.
            //제이슨 데이터를 자바스크립트로 변환 시켜 줄 때 빈 생성자가 필요하다.

            System.out.println(todo.getTitle()); //유효하지 않은 정의 exception 오류가 뜬다.


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
