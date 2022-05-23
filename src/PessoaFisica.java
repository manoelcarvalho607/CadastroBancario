

/**
 *
 * @author manoel.carvalho
 */
public class PessoaFisica extends Pessoa{
    
    private String cpf;

    @Override
    public String dadosBancarios() {
        return cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
