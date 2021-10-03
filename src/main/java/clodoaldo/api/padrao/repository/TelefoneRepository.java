package clodoaldo.api.padrao.repository;


import clodoaldo.api.padrao.model.Telefone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends CrudRepository<Telefone, Long> {
}
