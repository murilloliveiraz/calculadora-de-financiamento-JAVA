public class CalculadoraFinanciamento {

    public static void main (String [] args) {
        int valorDoCarro = 10000;
        int duracaoDoEmprestimo = 3;
        double taxaDeJuros = 5;
        int valorEntrada = 2000;

        if (duracaoDoEmprestimo <= 0 || taxaDeJuros <= 0){
            System.out.println("ERRO! O seu emprestimo não é valido !");
        } else if ( valorEntrada >= valorDoCarro){
            System.out.println("o carro pode ser pago integralmente");
        } else {
            double saldoRestante = valorDoCarro - valorEntrada;
            double numeroDeMeses = duracaoDoEmprestimo * 12; 
            double saldoMensal = saldoRestante/numeroDeMeses;
            double juros = (saldoMensal*taxaDeJuros)/100;
            double pagamentoMensal = saldoMensal + juros;
            System.out.println("O pagamento é "+pagamentoMensal);
        }
    }
}