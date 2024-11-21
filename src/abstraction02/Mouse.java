package abstraction02;

public class Mouse {
    public String name;
    public int age;
    public static int countOfTail = 1;

    public void sing() {
        System.out.println(name + "찍찍!!!");
    }
}


//static 이란 메모리에 한번 할당되어 프로그램이 종료될 때 해제되는 것을 의미


//M odels: 응용 프로그램의 데이터를 나타내고 유효성 검사 논리를 사용 하 여 해당 데이터에 대 한 비즈니스 규칙을 적용 하는 클래스입니다.
//V iews: 응용 프로그램에서 HTML 응답을 동적으로 생성 하는 데 사용 하는 템플릿 파일입니다.
//C ontrollers: 들어오는 브라우저 요청을 처리 하 고, 모델 데이터를 검색 하 고, 브라우저에 응답을 반환 하는 보기 템플릿을 지정 하는 클래스입니다.