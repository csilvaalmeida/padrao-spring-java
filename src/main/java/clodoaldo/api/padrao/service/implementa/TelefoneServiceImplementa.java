package clodoaldo.api.padrao.service.implementa;


import clodoaldo.api.padrao.model.Telefone;
import clodoaldo.api.padrao.repository.ClienteRepository;
import clodoaldo.api.padrao.repository.EnderecoRepository;
import clodoaldo.api.padrao.repository.TelefoneRepository;
import clodoaldo.api.padrao.service.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TelefoneServiceImplementa implements TelefoneService {

    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private TelefoneRepository telefoneRepository;

    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Telefone> buscarTodosTelefone() {
        return telefoneRepository.findAll();
    }

    @Override
    public Telefone buscarPorId(Long id) {
        // Buscar Cliente por ID.
        Optional<Telefone> telefone = telefoneRepository.findById(id);
        return telefone.get();
    }

    @Override
    public void inserir(Telefone telefone) {
        salvarClienteTelefone(telefone);
    }

    @Override
    public void atualizar(Long id, Telefone telefone) {
        // Buscar Cliente por ID, caso exista:
        Optional<Telefone> telefonebd = telefoneRepository.findById(id);
        if (telefonebd.isPresent()) {
            salvarClienteTelefone(telefone);
        }
    }

    @Override
    public void deletar(Long id) {
        // Deletar Cliente por ID.
        telefoneRepository.deleteById(id);
    }

    private void salvarClienteTelefone( Telefone telefone) {

        Long numeroFone= telefone.getNumeroFone();
        Telefone telefonemodel = telefoneRepository.findById(numeroFone).orElseGet(() -> {
            Telefone novoTelefone = new Telefone();
            novoTelefone.setNumeroFone(telefone.getNumeroFone());
            novoTelefone.setTipo(telefone.getTipo());
            telefoneRepository.save(novoTelefone);
            return novoTelefone;
        });

       // Cliente cliente = telefone.getCliente();
        //clienteRepository.save(cliente);
    }
}