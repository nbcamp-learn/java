package W02;

public class Main {

    public static void main(String[] args) {

        /* 연산자 */
        int x = 5;
        int y = 10;

        int total = x + y;
        System.out.println(total);

        // 사칙 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2
        System.out.println(2 / 4); // 0
        System.out.println(4 % 2); // 0
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        // 덧셈
        c = a + b;
        System.out.println(c); // 30

        // 뺼셈
        c = a - b;
        System.out.println(c); // 10

        // 곱셈
        c = a * b;
        System.out.println(c); // 200

        // 나눗셈 (몫)
        c = a / b;
        System.out.println(c); // 2

        // 나눗셈 (나머지) = 나머지 연산
        c = a % b;
        System.out.println(c); // 0

        // 비교 연산자 (참이면 true, 거짓이면 false)
        System.out.println(10 > 9); // 10 는 9 보다 크다 (참이면 true, 거짓이면 false)
        System.out.println(10 >= 9); // 10 는 9 보다 크거나 같다 (true)
        System.out.println(10 < 9); // 10 는 9 보다 작다 (false)
        System.out.println(10 <= 9); // 10 는 9 보다 작거나 같다 (false)
        System.out.println(10 == 10); // 10 는 10 와 같다 (true)
        System.out.println(10 == 9); // 10 는 9 과 같다 (false)
        System.out.println(10 != 10); // 10 는 10 와 같지 않다 (false)
        System.out.println(10 != 9); // 10 는 9 과 같지 않다 (true)

        // 논리 연산자
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1); // true
        System.out.println(flag2); // true
        System.out.println(flag3); // false

        // 피연산자 중 하나라도 true 이면 true
        System.out.println(flag1 || flag2); // true
        System.out.println(flag1 || flag2 || flag3); // true

        // 피연산자 모두 true 이면 true
        System.out.println(flag1 && flag2); // true (flag1, flag2 모두 true 라서)
        System.out.println(flag1 && flag2 && flag3); // false (flag3은 false 라서)

        // And 연산
        System.out.println((5 > 3) && (3 > 1)); // 5 는 3 보다 크고, 3 은 1 보다 크다 (true)
        System.out.println((5 > 3) && (3 < 1)); // 5 는 3 보다 크고, 3 은 1 보다 작다 (false)

        // Or 연산
        System.out.println((5 > 3) || (3 > 1)); // 5 는 3 보다 크거나, 3 은 1 보다 크다 (true)
        System.out.println((5 > 3) || (3 < 1)); // 5 는 3 보다 크거나, 3 은 1 보다 작다 (true)
        System.out.println((5 < 3) || (3 < 1)); // 5 는 3 보다 작거나, 3 은 1 보다 작다 (false)
        // System.out.println(1 < 3 < 5); // 불가능한 코드

        // 논리 부정 연산자
        System.out.println(!flag1); // false (flag1 값의 반대)
        System.out.println(!flag3); // true (flag3 값의 반대)
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true

        // 대입 연산자
        int number = 10;
        number = number + 2;
        System.out.println(number); // 12
        number = number - 2;
        System.out.println(number); // 10
        number = number * 2;
        System.out.println(number); // 20
        number = number / 2;
        System.out.println(number); // 10
        number = number % 2;
        System.out.println(number); // 0
        number = number++;
        System.out.println(number); // 2
        number = number--;
        System.out.println(number); // 0

        // 복합 대입 연산자
        number = 10;
        number += 2;
        System.out.println(number); // 12
        number -= 2;
        System.out.println(number); // 10
        number *= 2;
        System.out.println(number); // 20
        number /= 2;
        System.out.println(number); // 10
        number %= 2;
        System.out.println(number); // 0

        // 기타 연산자
        // 형변환 연산자
        int intNumber = 93 + (int) 98.8; // 93 + 98
        double doubleNumber = (double) 93 + 98.8; // 93.0 + 98.8

        // 삼항 연산자
        int xx = 1;
        int yy = 9;
        boolean bb = (xx == yy) ? true : false;
        System.out.println(bb); // false
        String s = (xx != yy) ? "정답" : "땡";
        System.out.println(s); // 땡
        int max = (xx > yy) ? xx : yy;
        System.out.println(max); // 9
        int min = (xx < yy) ? xx : yy;
        System.out.println(min); // 1

        // 연산자 우선순위
        int x1 = 2;
        int y1 = 9;
        int z1 = 10;

        boolean result = x1 < y1 && y1 < z1; // <,> 비교연산자 계산 후 && 논리 연산자 계산
        System.out.println(result); // true

        result = x1 + 10 < y1 && y1 < z1; // +10 산술연산자 계산 후 <,> 비교연산자 계산 후 && 논리 연산자 계산
        System.out.println(result); // false

        result = x1 + 2 * 3 > y1; // 산술연산자 곱센 > 덧셈 순으로 계산 후 > 비교연산자 계산
        System.out.println(result); // false (8>9)

        result = (x + 2) * 3 > y; // 괄호안 덧셈 연산 후 괄호 밖 곱셈 계산 후 > 비교연산자 계산
        System.out.println(result); // true (12>9)
    }
}
