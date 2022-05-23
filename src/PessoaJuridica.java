

/**
 *
 * @author manoel.carvalho
 */
public class PessoaJuridica extends Pessoa{
    
    private String cnpj;
    
    
  @Override
    public String dadosBancarios() {
       
        return cnpj;
    }
    
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

  
    
    
}
