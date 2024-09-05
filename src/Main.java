//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int i;
        i = 10;

        double d = 20.0;



        System.out.println(i);
        System.out.println(d);

        /*자바의 데이터 저장영역은 3개로 분류된다. 이 것을 T메모리 라고 부른다.
        스태틱(static), 스택(stack), 힙(hip) 으로 구성
        모든 자바 프로그램이 반드시 포함하게 되는 패키지:java.lang 패키지는 T메모리의 스태틱 영역에 가져다 놓는다.
        java.lang 패키지가 있기에 System.out.println(); 같은 메서드를 쓸수 있게 되는 것.
        현재 코드에서 클래스는Main이고 이 클래스와 main(String[] args)는 static 영역으로 배치됨
        main() 메서드는 stack 영역에 할당됨 정확히 말하자면 중괄호{ <-열리는 기호를 만날때 마다 스택프레임이 하나씩 생성됨 (*클래스 정의하는 중괄호는 제외)
        스택프레임 영역이 할당되면 그 영역에 메서드의 인자args 를 저장할 변수 공간을 스택프레임의 맨 밑에 확보
        즉 메서드 인자의 변수공간을 할당하는 것임 이 과정을 거친 후 sysout 실행

        위의 코드는 main() 스택 프레임에 args, i, d 인자를 저장할 변수 공간을 할당 받고 할당받은 공간에 각각의 변수를 할당하여 sysout으로 호출하는 코드임
         */

    }
}