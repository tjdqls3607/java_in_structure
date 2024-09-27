package abstraction01;

public class MouseDriver {
    public static void main(String[] args) {
        Mouse mickey = new Mouse();
        mickey.name = "미키";
        mickey.age = 85;
        mickey.countOfTail = 1;

        mickey.sing();

        mickey = null;

        Mouse jerry = new Mouse();;

        jerry.name = "제리";
        jerry.age = 73;
        jerry.countOfTail = 1;

        jerry.sing();

    }
}
/*      static 영역
____________________________________________
|java.lang              mouse              |
|                       name               |
| mousedriver           age                |
|main(args:String)     countoftail         |
|                        sing()            |
 mouse 에 name, age, countoftail 에는 변수 저장 공간이 안보임
 왜냐하면 이 세개의 속성은 Mouse 클래스에 속한 속성이 아닌 Mouse 객체에 속한 속성이기 때문
 객체가 생성 돼야만 속성의 값을 저장하기 위한 메모리 공간이 스태틱 영역이 아닌 힙 영역에 할당됨.
  Mouse mickey = Mouse 객체에 대한 참조변수 mickey를 만든다
  new Mouse() = Mouse 클래스의 인스턴스를 하나 만들어 힙에 배치한다.
  대입문 = Mouse 객체에 대한 주소(포인터)를 참조 변수 mickey에 할당한다.

 */
