package W01;

import java.util.Scanner;

public class HW01_Sample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        float rate = sc.nextFloat();
        sc.nextLine();  // nextFloat는 공백이 없기 때문에 넣어줘야 함
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

        title = "[ " + title + " ]"; // [ 제목 ]
        System.out.println(title);
        int intRate = (int) rate; // 강제 형변환
        System.out.println(intRate);
        double percentageRate = intRate * 100 / 5.0; // 자동 형변환
        System.out.println(percentageRate);
        System.out.println("1. " + input1);
        System.out.println("2. " + input2);
        System.out.println("3. " + input3);
        System.out.println("4. " + input4);
        System.out.println("5. " + input5);
        System.out.println("6. " + input6);
        System.out.println("7. " + input7);
        System.out.println("8. " + input8);
        System.out.println("9. " + input9);
        System.out.println("10. " + input10);
    }
}
