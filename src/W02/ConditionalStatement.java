package W02;

public class ConditionalStatement {

    public static void main(String[] args) {
        // 조건문
        boolean flag = true;

        if (flag) {
            System.out.println("flag 값은 true 입니다."); // flag 값은 true 입니다. 출력
        }

        // 조건문 with else
        boolean flag1 = false;
        if (flag1) {
            System.out.println("flag1 값은 true 입니다.");   // 미출력
        } else {
            System.out.println("flag1 값은 false 입니다. "); // flag 값은 false 입니다. 출력
        }
    }
}