package erros;

import java.math.BigDecimal;
import java.util.Date;

import javax.swing.JOptionPane;

public class ContaCorrente {

	private int numero;
	private Cliente cliente;
	private BigDecimal saldo;
	private Date data;

	public ContaCorrente(int numero, Cliente cliente, BigDecimal saldo, Date data) {
		this.numero = numero;
		this.saldo = saldo;
		this.data = data;
		this.cliente = cliente;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void Depositar(BigDecimal valor) throws DepositoInvalidoException {
		if (valor.compareTo(BigDecimal.ZERO) > 0) {
			saldo = saldo.add(valor);
			JOptionPane.showMessageDialog(null, "Depósito de " + valor + " realizado com sucesso. Saldo atual: " + saldo);
		} else {
			throw new DepositoInvalidoException("O valor do depósito deve ser maior que zero.");
		}
	}

	public void Sacar(BigDecimal valor) throws EstouroSaqueException {
		if (valor.compareTo(BigDecimal.ZERO) > 0 && valor.compareTo(saldo) <= 0) {
			saldo = saldo.subtract(valor);
			JOptionPane.showMessageDialog(null, "Saque de " + valor + " realizado com sucesso. Saldo atual: " + saldo);
		} else {
			throw new EstouroSaqueException("Saldo insuficiente ou valor inválido para saque.");
		}
	}

	public void ExibirExtrato() {
		StringBuilder extrato = new StringBuilder();
		extrato.append("Número da conta: ").append(numero).append("\n");
		extrato.append("Nome do cliente: ").append(cliente.getNome()).append(" ").append(cliente.getSobrenome())
				.append("\n");
		extrato.append("CPF do cliente: ").append(cliente.getCpf()).append("\n");
		extrato.append("Saldo atual: ").append(saldo).append("\n");
		extrato.append("Data da transação: ").append(data).append("\n");
		JOptionPane.showMessageDialog(null, extrato.toString());
	}

	public void Transferir(ContaCorrente destino, BigDecimal valor) throws TransferenciaInvalidaException {
		if (valor.compareTo(BigDecimal.ZERO) > 0 && valor.compareTo(saldo) <= 0) {
			saldo = saldo.subtract(valor);
			destino.saldo = destino.saldo.add(valor);
			JOptionPane.showMessageDialog(null,
					"Transferência de " + valor + " para a conta " + destino.numero + " realizada com sucesso. Saldo atual: " + saldo);
		} else {
			throw new TransferenciaInvalidaException("Saldo insuficiente ou valor inválido para transferência.");
		}
	}
}
