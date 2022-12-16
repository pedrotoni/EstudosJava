public class MetodoJava {
    public static void main (String[] args) {
        ContaExemplo conta1 = new ContaExemplo();
        conta1.saldo = 2300;
        conta1.depositaValor(2000);
        conta1.sacaValor(1000);

    }
}

class ContaExemplo {
    String titular;
    double saldo;

    public void depositaValor(double valor) {
        saldo += valor;
        System.out.println("R$"+valor+" depositado com sucesso!");
        System.out.println("Saldo atual: R$"+saldo);
    }

    public boolean sacaValor(double valorSaque) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque;
            System.out.println("Saque de R$"+valorSaque+" concluído com sucesso!");
            System.out.println("Saldo atual: R$"+saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente para este valor de saque!");
            return false;
        }
    }
}
