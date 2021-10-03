package clodoaldo.api.padrao.model;


import javax.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id  ;
    public String nome ;

    @ManyToOne
    private Endereco endereco;


    //@OneToMany
  //  @ManyToOne
  //  private Telefone telefone;

// getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

 //   public Telefone getTelefone() {
  //      return telefone;
 //   }

 //   public void setTelefone(Telefone telefone) {
 //       this.telefone = telefone;
 //   }


}

