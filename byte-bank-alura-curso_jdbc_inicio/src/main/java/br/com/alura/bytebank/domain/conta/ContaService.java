package br.com.alura.bytebank.domain.conta;

import br.com.alura.bytebank.ConnectionFactory;
import br.com.alura.bytebank.domain.RegraDeNegocioException;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class ContaService {

	private ConnectionFactory conectorDB;// Cria variavel privada da classe (tipo) em que foi configurada a conexão
	
	public ContaService() { // Método publico para instânciar o objeto
		this.conectorDB = new ConnectionFactory();
	}

	//private Set<Conta> contas = new HashSet<>();

	public Set<Conta> listarContasAbertas() {
		Connection conn = conectorDB.conectarBanco();
		return new contaDAO(conn).listarContas();
	}

	public BigDecimal consultarSaldo(Integer numeroDaConta) {
		var conta = buscarContaPorNumero(numeroDaConta);
		return conta.getSaldo();
	}

	public void abrir(DadosAberturaConta dadosDaConta) {
		Connection conn = conectorDB.conectarBanco();
		new contaDAO(conn).salvarDB(dadosDaConta);
		// contas.add(conta);
		try {
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public void realizarSaque(Integer numeroDaConta, BigDecimal valor) {
		 var conta = buscarContaPorNumero(numeroDaConta);

	        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
	            throw new RegraDeNegocioException("Valor do saque deve ser superior a zero!");
	        }

	        if (valor.compareTo(conta.getSaldo()) > 0) {
	            throw new RegraDeNegocioException("Saldo insuficiente!");
	        }

	        BigDecimal novoValor = conta.getSaldo().subtract(valor);
	        alterar(conta, novoValor);
	}

	public void realizarDeposito(Integer numeroDaConta, BigDecimal valor) {
		var conta = buscarContaPorNumero(numeroDaConta);
		
		if (valor.compareTo(BigDecimal.ZERO) <= 0) {
			throw new RegraDeNegocioException("Valor do deposito deve ser superior a zero!");
		}

		// conta.depositar(valor);
		BigDecimal novoValor = conta.getSaldo().add(valor);
		alterar(conta, novoValor);
	}

	public void encerrar(Integer numeroDaConta) {
		var conta = buscarContaPorNumero(numeroDaConta);
		if (conta.possuiSaldo()) {
			throw new RegraDeNegocioException("Conta não pode ser encerrada pois ainda possui saldo!");
		}

		//contas.remove(conta);
		
		Connection conn = conectorDB.conectarBanco();
		
		new contaDAO(conn).deletar(numeroDaConta);
	}

	private Conta buscarContaPorNumero(Integer numero) {
		Connection conn = conectorDB.conectarBanco();
		Conta conta = new contaDAO(conn).listarPorNumero(numero);
		try {
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		if (conta != null) {
			return conta;
		} else {
			throw new RegraDeNegocioException("Não existe conta cadastrada com esse número!");
		}
	}
	
	private void alterar(Conta conta, BigDecimal valor) {
        Connection conn = conectorDB.conectarBanco();
        new contaDAO(conn).alterarValor(conta.getNumero(), valor);
        
        try {
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
    }
	
	public void transferirValor (Integer numeroContaOrigem, Integer numeroContadestino, BigDecimal valor) {
		
		this.realizarSaque(numeroContaOrigem, valor);
		this.realizarDeposito(numeroContadestino, valor);
	}

}
