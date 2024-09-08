public class Start6 extends Thread{
    static int share;

    public static void main(String[] args){
        Start6 t1 = new Start6();
        Start6 t2 = new Start6();

        t1.start();
        t2.start();
    }

    public void run(){
        for(int count = 0; count < 10; count++){
            System.out.println(share++);

            try {sleep(1000);} catch (InterruptedException e) {}
        }
    }
}

/*
멀티 스레드(Multi Thread)의 T메모리 모델은 스택 영역을 스레드 개수만큼 분할해서 쓰는 것이다.
 ______________________________________
ㅣ스태틱 영역                             ㅣ
 --------------------------------------
ㅣ스택 영역- 메서드들의 놀이터 ㅣ 힙 영역       |
-------------------------              ㅣ
|    스레드    |   스레드   |             |
---------------------------------------

멀티 프로세스는 다수의 데이터 저장 영역, 즉 다수의 T메모리를 갖는 구조다.
멀티 프로세스는 각 프로세스 마다 각자의 T메모리가 있고 각자 고유의 공간이므로 서로 참조할 수 없다.
그에 반해 멀티 스레드는 하나의 T메모리만 사용하는데 스택 영역만 분할해서 사용하는 구조다.
멀티 프로세스는 하나의 프로세스가 다른 프로세스의 T메모리 영역을 절대 침범할 수 없는 메모리 안전한 구조이지만 메모리
사용량은 그만큼 크다.
 */
