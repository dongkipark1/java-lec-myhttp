package com.metacoding.myhttp;

import lombok.*;

@NoArgsConstructor // 디폴트 생성자를 생성할 수 있는 어노테이션
@AllArgsConstructor //모든 인수를 다 받는 생성자 어노테이션
@Data // GETTER SETTER 모두 들고 있는 어노테이션
//@Setter
//@Getter //어노테이션: 주석과도 같은거 JVM이 무시한다 @로 나오는 주석은 JVM이 무시하지 않는 JVM이 보는 주석 실행 시에(런타임시에) 발동하는데 GETTER가 붙어있음 = 클래스 데이터를 보고 실행시에 자동으로 실행된다.
//어노테이션은 실행시에 GETTER를 만들어 버린다
// 실행 할 때(컴파일 할 때)만 작동 한다 코드에 GETTER를 적는 것이 아니라
// 플러그인이 없으면 게터가 없는 줄 알아서 코드 상에서는 오류가 나게 된다
// 즉 플러그인의 설치는 툴에게 '실행 하게 되면 클래스 OR 생성자가 있는 줄 알아라' 라고 얘기하는 것이라고 보는것이다.

public class Posts {    // 클래스 안에 데이터만 맞으면 상관없다
    private int userId;
    private int id;
    private String title;
    private String body;

    //public Posts() {}

//    public Posts(int userId, int id, String title, String body) {
//        this.userId = userId;
//        this.id = id;
//        this.title = title;
//        this.body = body;
//    }


}
