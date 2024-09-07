//import java.util.Scanner;
//
//public class OperacoesMatematica {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Digite o primeiro valor: ");
//        double num1 = scan.nextDouble();
//
//        System.out.println("Digite o segundo valor: ");
//        double num2 = scan.nextDouble();
//
//        System.out.println("Informe a operação (+, -, *, /): ");
//        String operacao = scan.next();
//
//        // Executando a operação e imprimindo o resultado
//        double resultado = performOperation(operacao, num1, num2);
//        System.out.println("O resultado é: " + resultado);
//
//        scan.close();
//    }
//
//    // Método para realizar a operação matemática
//    public static double performOperation(String operacao, double x, double y) {
//        switch (operacao) {
//            case "+":
//                return x + y;
//            case "-":
//                return x - y;
//            case "*":
//                return x * y;
//            case "/":
//                if (y == 0) {
//                    System.out.println("Não é possível dividir por zero.");
//                    return Double.NaN;
//                }
//                return x / y;
//            default:
//                System.out.println("Operação inválida.");
//                return Double.NaN;
//        }
//    }
//}