package W01;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        float star = sc.nextFloat();
        sc.nextLine();  // nextFloat()는 마지막에 \n 깂이 없기 때문에 엔터값을 입력해줘야 함 안그러면 다음 출력코드에 오류가 뜸
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String input3 = sc.nextLine();
        String input4 = sc.nextLine();
        String input5 = sc.nextLine();
        String input6 = sc.nextLine();
        String input7 = sc.nextLine();
        String input8 = sc.nextLine();
        String input9 = sc.nextLine();
        String input10 = sc.nextLine();

        System.out.println("[" + title + "]");

        System.out.println("별점 : " + (int) star + "(" + (star / 5) * 100 + ")");

        System.out.println("1. " + input1);
        System.out.println("2. " + input2);
        System.out.println("3. " + input3);
        System.out.println("4. " + input4);
        System.out.println("5, " + input5);
        System.out.println("6. " + input6);
        System.out.println("7. " + input7);
        System.out.println("8. " + input8);
        System.out.println("9. " + input9);
        System.out.println("10. " + input10);
    }
}
