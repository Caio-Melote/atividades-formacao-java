package br.com.alura.bytebank.domain.conta;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import javax.management.RuntimeErrorException;
import javax.print.attribute.SetOfIntegerSyntax;

import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.protocol.ResultsetRow;
import com.mysql.cj.xdevapi.Statement;

import br.com.alura.bytebank.domain.cliente.Cliente;
import br.com.alura.bytebank.domain.cliente.DadosCadastroCliente;

public class contaDAO {
	
	private Connection connDAO;
	
	public contaDAO(Connection conexao) {
		this.connDAO = conexao;
	}
	
	public void salvarDB(DadosAberturaConta dadosDaConta) {
		var saldo = BigDecimal.ZERO;
		var cliente = new Cliente(dadosDaConta.dadosCliente());
        var conta = new Conta(dadosDaConta.numero(), cliente, saldo);
		
		String sqlInsert = "INSERT INTO conta(numero, saldo, cliente_nome, cliente_cpf, cliente_email)"
        		+ "VALUES(?, ?, ?, ?, ?)";
    
        
        try {
        	PreparedStatement preparedStatement = connDAO.prepareStatement(sqlInsert);
            
            preparedStatement.setInt(1, conta.getNumero());
            preparedStatement.setBigDecimal(2, BigDecimal.ZERO);
            preparedStatement.setString(3, dadosDaConta.dadosCliente().nome());
            preparedStatement.setString(4, dadosDaConta.dadosCliente().cpf());
            preparedStatement.setString(5, dadosDaConta.dadosCliente().email());
            
            preparedStatement.execute();
            preparedStatement.close();
            //connDAO.close();
            this.connDAO.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Set<Conta> listarContas(){
		Set<Conta> setContas = new HashSet<>();
		
		String sqlString = "SELECT * FROM conta";
		PreparedStatement pStatement = null;
		ResultSet resultSet = null;

		try {
			pStatement = connDAO.prepareStatement(sqlString);
			resultSet = pStatement.executeQuery();
			
			while(resultSet.next()) {
				Integer numero = resultSet.getInt(1);
				BigDecimal saldoBigDecimal = resultSet.getBigDecimal(2);
				String nome = resultSet.getString(3);
				String cpf = resultSet.getString(4);
				String email = resultSet.getString(5);
				
				DadosCadastroCliente dadosCadastroCliente = new DadosCadastroCliente(nome, cpf, email);
				Cliente cliente = new Cliente(dadosCadastroCliente);
				
				setContas.add(new Conta(numero, cliente, saldoBigDecimal));

			}
			
			resultSet.close();
			pStatement.close();
			//connDAO.close();
			this.connDAO.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return setContas;
	}	
	
	public void alterarValor(Integer numero, BigDecimal valor) {
		PreparedStatement pStatement;
		String sql = "UPDATE conta SET saldo = ? WHERE numero = ?";
		
		try {
			pStatement = connDAO.prepareStatement(sql);
			
			pStatement.setBigDecimal(1, valor);
			pStatement.setInt(2, numero);
			
			pStatement.execute();
			pStatement.close();
			//connDAO.close();
			this.connDAO.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	
	public Conta listarPorNumero(Integer numero) {
        String sql = "SELECT * FROM conta WHERE numero = " + numero;

        PreparedStatement ps;
        ResultSet resultSet;
        Conta conta = null;
        try {
        	ps = connDAO.prepareStatement(sql);
            
            resultSet = ps.executeQuery(sql);

            while (resultSet.next()) {
                Integer numeroRecuperado = resultSet.getInt(1);
                BigDecimal saldo = resultSet.getBigDecimal(2);
                String nome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String email = resultSet.getString(5);
                

                DadosCadastroCliente dadosCadastroCliente =
                        new DadosCadastroCliente(nome, cpf, email);
                Cliente cliente = new Cliente(dadosCadastroCliente);

                //conta = new Conta(numeroRecuperado, saldo, cliente, estaAtiva);
                conta = new Conta(numeroRecuperado, cliente, saldo);
                		
            }
            resultSet.close();
            ps.close();
            //connDAO.close();
            this.connDAO.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conta;
    }
	
	public void deletar(Integer numeroConta) {
		String sql = "DELETE FROM conta WHERE numero = ?";
		
		try {
			PreparedStatement pStatement =  connDAO.prepareStatement(sql);
			
			pStatement.setInt(1, numeroConta);
			
			pStatement.execute();
			pStatement.close();
			//connDAO.close();
			this.connDAO.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
}	
