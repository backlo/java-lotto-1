package lotto.view;

import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    public static String InputPrice(){
        System.out.println("구매금액을 입력해 주세요.");
        return scanner.nextLine();
    }

}
