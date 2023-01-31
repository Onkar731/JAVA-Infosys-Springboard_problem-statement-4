import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class PerformArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputString = sc.nextLine();

        // extracting numbers from the given string
        List<Integer> values = Arrays.stream(inputString.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        // printing all arithmetic operations result
        System.out.println(
            ComputeArithmeticOperations.addition(values.get(0), values.get(1)) + " " +
            ComputeArithmeticOperations.subtraction(values.get(0), values.get(1)) + " " +
            ComputeArithmeticOperations.multiplication(values.get(0), values.get(1)) + " " +
            ComputeArithmeticOperations.division(values.get(0), values.get(1))
        );

        // closing resources
        sc.close();
    }
}
