package W01;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // System.out.print & println 사용법
        System.out.println("Hello, Java!");

        System.out.print(7);
        System.out.println(3);
        System.out.println(3.14);
        System.out.println("JAVA");

        /*
         //주석
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

        /* 변수 타입 - 기본형 변수 */
        // 논리형 변수 - boolean
        boolean flag = true;    // 1. 논리형 변수 boolean 선언 및 True 값으로 초기화
        flag = false;           // 2. False 값으로 저장 가능

        // 문자형 변수 - char
        char c = 'A';       // 문자 하나를 저장한다.

        // 정수형 변수 - byte, short, int, long
        byte byteNumber = 127;              // byte -128 ~ 127 범위와 숫자만 저장 가능
        short shortNumber = 32767;          // short -32,768~32,767 범위와 숫자만 저장 가능
        int intNumber = 2147483647;         // int -21 ~21 범위와 숫자만 저장 가능
        long longNumber = 2147483647L;      // long은 숫자 뒤에 L을 붙여서 표기하며 매우 큰 수를 저장 가능

        // 실수형 변수 - float, double
        float floatNumber = 0.123f;         // float 4byte 3.4 * 10^38 범위를 표현하는 실수값
        double doubleNumber = 0.123123123;  // double 8byte 1.7 * 10^308 범위를 표현하는 실수값

        /* 변수 타입 - 참조형 변수 */
        // 문자열 - String
        String message = "Hello World"; // 문자열을 저장

        // 그 외 - Object, Array, LIst
        List<Integer> n = List.of(0, 1, 2, 3);  //  기본형 변수 여러개 저장

        /* 변수 타입 - 래퍼 클래스 변수
         * 기본형 변수를 클래스로 한번 랩핑하는 변수 */
        // 박식 vs 언박싱
        // 박싱
        // Integer 래퍼 클래스 num 에 21 의 값을 저장
        int number1 = 21;
        Integer num3 = new Integer(number1);

        // 언박싱
//        int n1 = num.intValue(); // 래퍼 클래스들은 inValue() 같은 언박싱 메서드들을 제공.

        System.out.println("-----------------------------------------------------");
        /* 숫자와 문자 */
        // 숫자 -> 문자
        Scanner sc = new Scanner(System.in);

//        int asciiNumber = sc.nextInt();
//        char ch = (char) asciiNumber;   // 문자로 형변환을 해주면 숫자에 맞는 문자로 표현됨

//        System.out.println(ch);

        // 문자 -> 숫자
        char letter = sc.nextLine().charAt(0);  // 첫번째 글자만 받아오기 위해 charAt(0) 메서드를 사용한다.
        int asciiNumber = (int) letter;

        System.out.println(asciiNumber);

        /* 문자와 문자열 */
        // 선언 관점에서 차이점
        // 문자
        // 문자 뒤에 \0(널문자)가 없음 (1byte만 쓰기 때문에 끝을 알아서 데이터만 저장하면 된다.)
        char alphabet = 'A';    // 문자 하나를 저장함

        // 문자열
        // 다른 기본형 변수가 실제 값을 저장하는 저장공간이라면 참조형 변수는 실제 값이 아닌 원본값의 주소값을 저장한다.
        // 참조형 변수는 주소값을 저장하는 주소형 변수라고 부르기도 함
        String str = "Hello World";    // 문자열을 저장함

    }
}
