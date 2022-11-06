import java.util.Scanner;

public class CodingTankAula02 {

    public static void main (String[] args) {
        System.out.println("Qual o seu salário mensal? ");
        Scanner sc = new Scanner(System.in);
        Double salarioMensal = sc.nextDouble();
        Double salarioComDecimo = salarioMensal*13;
        Double adicionalFerias = salarioMensal/3; //nao desconta INSS;
        System.out.printf("Seu salário anual bruto é: R$%.2f.", salarioComDecimo+adicionalFerias);
        System.out.println("\n----------------------------------------");
        Double salarioMensalDesc = 0d;
        Double descontoMensal = 0d;

        if (salarioMensal <= 1212.00) {
            salarioMensalDesc = salarioMensal - salarioMensal*0.075;
            descontoMensal = salarioMensal*0.075;
        } else if (salarioMensal >= 1212.01 && salarioMensal <= 2427.35) {
            salarioMensalDesc = salarioMensal - salarioMensal*0.09;
            descontoMensal = salarioMensal*0.09;
        } else if (salarioMensal >= 2427.36 && salarioMensal <= 3641.03) {
            salarioMensalDesc = salarioMensal - salarioMensal*0.12;
            descontoMensal = salarioMensal*0.12;
        } else if (salarioMensal >= 3641.04 && salarioMensal <= 7087.22) {
            salarioMensalDesc = salarioMensal - salarioMensal*0.14;
            descontoMensal = salarioMensal*0.14;
        } else {
            salarioMensalDesc = salarioMensal-900;
            descontoMensal = 900d;
        }

        Double salarioAnualLiq = salarioMensalDesc*13 + adicionalFerias;
        System.out.printf("Seu salário anual líquido é: R$%.2f.", salarioAnualLiq);
        System.out.println("\n----------------------------------------");
        Double TotalDescINSS = descontoMensal*13;
        System.out.printf("Seu total anual de INSS descontado é: R$%.2f.", TotalDescINSS);
    }
}
