package clodoaldo.api.padrao.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Telefone {

    @Id
    public  Long numeroFone;
    public  TipoTelefone tipo ;

  //  @ManyToOne
  //  @JoinColumn(name = "clienet_id")
 //   private Cliente  cliente;

    // getters and setters


    public Long getNumeroFone() {
        return numeroFone;
    }

    public void setNumeroFone(Long numeroFone) {
        this.numeroFone = numeroFone;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }

   // public Cliente getCliente() {
 //       return cliente;
 //   }

  //  public void setCliente(Cliente cliente) {
//        this.cliente = cliente;
//    }
}
