package W02;

public class ConditionalStatement {

    public static void main(String[] args) {

        // 조건문 (IF문)
        boolean flag = true;

        if (flag) {
            System.out.println("flag 값은 true 입니다."); // flag 값은 true 입니다. 출력됨
        }

        // 조건문 (If - Else문)
        boolean flag1 = false;
        if (flag1) {
            System.out.println("flag1 값은 true 입니다.");   // 출력안됨
        } else {
            System.out.println("flag1 값은 false 입니다. "); // flag 값은 false 입니다. 출력됨
        }
    }
}