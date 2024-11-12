package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Endereco;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de endereço. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 *
 * @author ptoshiok
 */
public interface EnderecoService {

    Iterable<Endereco> buscarTodos();

    Endereco buscarPorId(Long id);

    void inserir(Endereco endereco);

    void atualizar(Long id, Endereco cliente);

    void deletar(Long id);

}
