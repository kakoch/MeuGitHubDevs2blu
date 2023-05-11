import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> numberList = new ArrayList<Integer>();
        var scanner = new Scanner(System.in);
        Boolean fineshed = Boolean.FALSE;
        List<Integer> positionExclude = new ArrayList<Integer>();

        System.out.println("Quantos indices tem o Array? ");
        var arrayLength = scanner.nextInt();

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Digite o numero inteiro: ");
            numberList.add(scanner.nextInt());
        }
        for (int i = 0; i < arrayLength - 1; i++) {
            if (numberList.size() > 0) {
                var num1 = numberList.get(i);
                List<Integer> auxNumberList = new ArrayList<Integer>(numberList);
                auxNumberList.remove(i);
                for (int num2 : auxNumberList ) {
                    if (num1 + num2 == 10 && !positionExclude.contains(numberList.indexOf(num1))) {
                        positionExclude.add(numberList.indexOf(num2));
                        fineshed = Boolean.TRUE;
                        System.out.printf("Par que soma 10 econtrado, são eles: %s e %s", num1, num2);
                        System.out.printf("\n");
                    }
                }
                // var num2 = numberList.get( + 1);
            }
        }
        if (!fineshed){System.out.println("Não há pares cuja soma igual a 10!");}
    }
}