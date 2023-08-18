package erros;

import java.math.BigDecimal;
import java.util.Date;

import javax.swing.JOptionPane;

public class PrincipalContaCorrente {

	public static void main(String[] args) throws Exception {
		
        BigDecimal valorDeposito = BigDecimal.ZERO;
        BigDecimal valorSaque = BigDecimal.ZERO;
        BigDecimal valorTransferencia = BigDecimal.ZERO;
		
        // Instanciando os clientes
        Cliente cliente1 = new Cliente("José", "123.456.789-01", "Neto");
        Cliente cliente2 = new Cliente("Pedro", "987.654.321-09", "Silva");

        // Instanciando as contas correntes
        ContaCorrente conta1 = new ContaCorrente(1, cliente1, BigDecimal.valueOf(1000.0), new Date());
        ContaCorrente conta2 = new ContaCorrente(2, cliente2, BigDecimal.valueOf(500.0), new Date());

        // Exibindo Extratos
        conta1.ExibirExtrato();
        conta2.ExibirExtrato();
        
        // Executando métodos Depositar, Sacar e Transferir
        valorDeposito = new BigDecimal(JOptionPane.showInputDialog("Digite o valor do depósito para a conta1: "));
        conta1.Depositar(valorDeposito);

        valorSaque = new BigDecimal(JOptionPane.showInputDialog("Digite o valor do saque da conta1: "));
        conta1.Sacar(valorSaque);

        valorTransferencia = new BigDecimal(JOptionPane.showInputDialog("Digite o valor da transferência da conta1 para a conta2:"));
        conta1.Transferir(conta2, valorTransferencia);

        // Exibindo saldos
        JOptionPane.showMessageDialog(null, "Saldo da conta1: " + conta1.getSaldo());
        JOptionPane.showMessageDialog(null, "Saldo da conta2: " + conta2.getSaldo());

        // Exibindo nome do cliente da conta1
        JOptionPane.showMessageDialog(null, "Nome do cliente Conta 1: " + conta1.getCliente().getNome());
	}

}
