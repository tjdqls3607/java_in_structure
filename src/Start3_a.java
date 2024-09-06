public class Start3_a {
    public static void main(String[] args) {
        int i = 10;
        int k = 20;

        if(i == 10) {
            int m = k + 5;
            k = m;
        }else {
            int p = k +10;
            k = p;
        }
        //System.out.println(m);
        //k = m + p;

    }
}




/*
T메모리에는 static, stack, hip 영역이 있는데 각각 의 영역에 저장되는 변수들이 있다.
지역변수(local variable)
클래스 멤버 변수 (class member variable)
객체 멤버 변수 (object member variable)

지역변수는 stack 영역의 스택 프레임 안에서 존재할 수 있고
클래스 멤버 변수는 static 영역에서 존재할 수 있다. static에 자리 잡으면 JVM이 종료될 떄까지 고정된 상태로 존재한다.
객체 멤버 변수는 hip 영역에서 존재가 가능하다. 객체 멤버 변수들은 객체와 함께 garbage collecter 라고 하는 힙 메모리 회수기에 의해 일생을 마침

스택프레임 안의 변수를 지역 변수(local variable)이라고 한다 스택 프레임 안에서만 효용이 있는
변수이기 떄문에 외부에서는 사용할 수 없다.
또한 그 지역(스택 프레임) 이 삭제되면 지역변수도 메모리에서 함께 사라진다.


 */

