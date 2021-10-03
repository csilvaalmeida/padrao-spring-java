package clodoaldo.api.padrao.service;

import clodoaldo.api.padrao.model.Telefone;

public interface TelefoneService {

    Iterable<Telefone> buscarTodosTelefone();

    Telefone buscarPorId(Long id);

    void inserir(Telefone telefone);

    void atualizar(Long id, Telefone telefone);

    void deletar(Long id);

}
