import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Recebendo o salário dos funcionários
        System.out.print("Digite o salário do primeiro funcionário ");
        double num1 = scan.nextDouble();
        System.out.print("Digite o salário do segundo funcionário ");
        double num2 = scan.nextDouble();
        System.out.print("Digite o salário do terceiro funcionário ");
        double num3 = scan.nextDouble();
        System.out.print("Digite o salário do quarto funcionário ");
        double num4 = scan.nextDouble();
        System.out.print("Digite o salário do quinto funcionário ");
        double num5 = scan.nextDouble();



        // Calculando os descontos do INSS e IRRF
        double descontoInss1 = calcularDescontoInss(num1);
        double descontoInss2 = calcularDescontoInss(num2);
        double descontoInss3 = calcularDescontoInss(num3);
        double descontoInss4 = calcularDescontoInss(num4);
        double descontoInss5 = calcularDescontoInss(num5);

        double descontoIrrf1 = calcularDescontoIrrf(num1);
        double descontoIrrf2 = calcularDescontoIrrf(num2);
        double descontoIrrf3 = calcularDescontoIrrf(num3);
        double descontoIrrf4 = calcularDescontoIrrf(num4);
        double descontoIrrf5 = calcularDescontoIrrf(num5);

        // Calculando o salário líquido
        double liquido1 = num1 - descontoInss1 - descontoIrrf1;
        double liquido2 = num2 - descontoInss2 - descontoIrrf2;
        double liquido3 = num3 - descontoInss3 - descontoIrrf3;
        double liquido4 = num4 - descontoInss4 - descontoIrrf4;
        double liquido5 = num5 - descontoInss5 - descontoIrrf5;

        // Exibindo os resultados
        System.out.println("\nFuncionário 1:");
        System.out.println("Salário Bruto: R$" + num1);
        System.out.println("Desconto INSS: R$" + descontoInss1);
        System.out.println("Desconto IRRF: R$" + descontoIrrf1);
        System.out.println("Salário Líquido: R$" + liquido1);

        System.out.println("\nFuncionário 2:");
        System.out.println("Salário Bruto: R$" + num2);
        System.out.println("Desconto INSS: R$" + descontoInss2);
        System.out.println("Desconto IRRF: R$" + descontoIrrf2);
        System.out.println("Salário Líquido: R$" + liquido2);

        System.out.println("\nFuncionário 3:");
        System.out.println("Salário Bruto: R$" + num3);
        System.out.println("Desconto INSS: R$" + descontoInss3);
        System.out.println("Desconto IRRF: R$" + descontoIrrf3);
        System.out.println("Salário Líquido: R$" + liquido3);

        System.out.println("\nFuncionário 4:");
        System.out.println("Salário Bruto: R$" + num4);
        System.out.println("Desconto INSS: R$" + descontoInss4);
        System.out.println("Desconto IRRF: R$" + descontoIrrf4);
        System.out.println("Salário Líquido: R$" + liquido4);

        System.out.println("\nFuncionário 5:");
        System.out.println("Salário Bruto: R$" + num5);
        System.out.println("Desconto INSS: R$" + descontoInss5);
        System.out.println("Desconto IRRF: R$" + descontoIrrf5);
        System.out.println("Salário Líquido: R$" + liquido5);


        scan.close();
    }

    // Função para calcular o desconto do INSS
    public static double calcularDescontoInss(double salario) {
        if (salario <= 1212.00) {
            return salario * 0.075; // 7.5%
        } else if (salario <= 2427.35) {
            return salario * 0.09; // 9%
        } else if (salario <= 3641.03) {
            return salario * 0.12; // 12%
        } else if (salario <= 7087.22) {
            return salario * 0.14; // 14%
        } else {
            return 7087.22 * 0.14; // Teto máximo
        }
    }

    // Função para calcular o desconto do IRRF
    public static double calcularDescontoIrrf(double salario) {
        if (salario <= 1903.98) {
            return 0; // 0%
        } else if (salario <= 2826.65) {
            return (salario * 0.075) - 142.80; // 7,5%
        } else if (salario <= 3751.05) {
            return (salario * 0.15) - 354.80; // 15%
        } else if (salario <= 4664.68) {
            return (salario * 0.225) - 636.13; // 22,5%
        } else {
            return (salario * 0.275) - 869.36; // 27,5%
        }
    }
}