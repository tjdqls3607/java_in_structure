public class Start3 {
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

        //k = m + p;
    }
}

/* if구문이 추가 됐다. 이 코드에선 i변수에 저장된 값이 10인지 물어보고 있고 비교 결과값은 true,
if문의 특징에 따라서 if~else 블록중 위의 블록이 실행됨 앞저 적었지만 스택프레임은 여는 중괄호를 만나면 스택프레임이 시작됨
여기서 생성되는 스택 프레임은 메서드의 스택프레임이 아니라 if문, 그것도 참인 블록의 스택 프레임이다.
T메모리는 main()스택프레임 안에 if(true) 스택프레임이 중첩되어 생성됨
if 스택 프레임 안에있는 m 변수공간에 밖에 있는 k의 값을 연산하여 m 변수공간에 할당한다 이때 실행되는 코드는 m = k + 5
이후 닫는 중괄호를 만나면 if 블록 스택 프레임은 스택 영역에서 사라진다. 이때 if블록 안에 있던 변수의 저장 공간도
함께 사라짐 if(true)스택 프레임과 그 안에 있던 인자들 모두 사라짐 if 연산이 끝났기 때문에 else블록은
메모리에 할당되지 않고 종료된다.

주석 처리된 k=m+p 구문은 T메모리에 m변수와 p변수가 존재하지 않기때문에 주석을 풀고 실행하면 컴파일러 오류가 발생한다
이때 경고메세지는
m cannot be resolved to a variable
p cannot be resolved to a variable

시스템 종료 순서 : T메모리 소멸, JVM기동 중지, JRE사용 자원 운영체제 반납

 */