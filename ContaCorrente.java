package sef.module4.activity;

import java.util.Date;
import javax.swing.JOptionPane;

public class ContaCorrente {

	private int numero;
	private Cliente cliente;
	private float saldo;
	private Date data;

	public ContaCorrente(int numero,Cliente cliente, float saldo, Date data) {
		this.numero = numero;
		this.saldo = saldo;
		this.data = data;
		this.cliente = cliente;
	}
	
	public float getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void Depositar(float valor) {
		if (valor > 0) {
			saldo += valor;
			JOptionPane.showMessageDialog(null, "Depósito de " + valor + " realizado com sucesso. Saldo atual: " + saldo);
		} else {
			JOptionPane.showMessageDialog(null, "O valor do depósito deve ser maior que zero.");
		}
	}

	public void Sacar(float valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			JOptionPane.showMessageDialog(null, "Saque de " + valor + " realizado com sucesso. Saldo atual: " + saldo);
		} else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente ou valor inválido para saque.");
		}
	}

    public void ExibirExtrato() {
        StringBuilder extrato = new StringBuilder();
        extrato.append("Número da conta: ").append(numero).append("\n");
        extrato.append("Nome do cliente: ").append(cliente.getNome()).append(" ").append(cliente.getSobrenome()).append("\n");
        extrato.append("CPF do cliente: ").append(cliente.getCpf()).append("\n");
        extrato.append("Saldo atual: ").append(saldo).append("\n");
        extrato.append("Data da transação: ").append(data).append("\n");
        JOptionPane.showMessageDialog(null, extrato.toString());
    }

	public void Transferir(ContaCorrente destino, float valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			destino.saldo += valor;
			JOptionPane.showMessageDialog(null,
					"Transferência de " + valor + " para a conta " + destino.numero + " realizada com sucesso. Saldo atual: " + saldo);
		} else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente ou valor inválido para transferência.");
		}
	}
	
}