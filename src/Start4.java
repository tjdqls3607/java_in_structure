public class Start4 {
    public static void main(String[] args) {
        int k = 5;
        int m;

        m = square(k);
    }
    private static int square(int k) {
        int result;

        k = 25;

        result = k;

        return result;
    }
}

/* 위의 코드 같은 경우 5번줄 수행 이후  T메모리는 static 영역에 square(k:int), main(args:String[])
이 존재하고 stack 영역에는 main 스택 프레임이 할당된다. main 스택 프레임 내에는 args, m변수 공간, 변수 k값이 존재하게 된다.
6번줄에서 m=square(k) 에 의해 square 메서드를 호출한다. square 메서드 내에는 인자값도 있고 return 값도 있기에
square 메서드가 선언된 8번줄로 이동하게 된다. 그후 T메모리의 변화는 static 영역은 그대로일 것이고
stack 영역의 스택 프레임은 main메서드 위에 square 메서드가 할당될 것이다.square 스택 프레임 내에는
result, k, return이 할당된다. 11번줄을 수행하고 나면 T메모리 내의 변화는 square 스택프레임 에는 k값 25가 저장될 것이다.
여기서 main() 메서드가 가진 변수k와 square()메서드가 가진 변수 k가 이름만 같고 실제로는 서로 별도의 변수공간이라는 것이다.
따라서 square내의 k변수에 무슨 짓을 해도 main()메서드 안의 k변수는 영향이 없다.
그 후 닫는 중괄호를 만나면 스택 프레임 하나가 또 사라진다 7번줄의 닫는 중괄호는 main()메서드 스택 프레임을 메모리에서 사라지게 하고 모든 프로그램이 종료된다.

 */