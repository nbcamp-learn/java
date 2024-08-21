package W01;

public class Main {
    public static void main(String[] args) {

        // System.out.print & println 사용법
        System.out.println("Hello, Java!");

        System.out.print(7);
        System.out.println(3);
        System.out.println(3.14);
        System.out.println("JAVA");

        // 주석
        /*
         * 실제 츠로그램 실핼에는 영향을 미치지 않는 유령코드.
         * 개발자들끼리 협업할때 코드에 대한 설명을 추가하거나 주의사항 메모할 때 사용.
         */
        String data = "데이터";     // 출력할 데이터 문자열
        System.out.println(data); // 데이터를 출력한다

        // 저장공간의 선언과 값의 저장
        int number;     // number 이름의 int 타입의 저장공간을 선언
        String name;    // name 이름의 String 타입의 저장공간을 선언

        int num = 11;   // 1. 선언과 동시에 값을 초기화
        num = 10;         // 2. 선언 이후 다른값을 저장공간에 저장

        // 변수
        int num1 = 10;    // 1. 변수로 선언 및 초기화
        num1 = 11;        // 2. 뱐수와 값을 덮는다.

        // 상수
        final int num2 = 10;    // 1. 상수로 선언(타입 앞에 'final' 붙이면 된다.)
//        num2 = 11;              // 2. 변수값을 변경하면 에러가 난다.

    }
}
