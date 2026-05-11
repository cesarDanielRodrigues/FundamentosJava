package je_exercicio;

import java.time.LocalDate;
import java.util.Date;

public class ContaCorrete {
    Integer numeroConta;
    Integer numeroAgencia;
    String nomeCliente;
    LocalDate dataNascimento;
    Double saldoConta;

    double sacarValor (double valor){
        return valor;
    };

    String transferirValor (int contaOrigem, int contaDestino){
        String resultado = "";
        return resultado;
    };

    String cancelarConta (int numeroConta, String justificativa){
        String resultado = "";
        return resultado;
    }

    String consultarExtratoDurantePeriodo (Date dataInicio, Date dataFinal){
        String resultado = "";

        return resultado;
    }

    double consultarSaldoAtual (){
        double resultado = 0.0;

        return resultado;
    }
}
