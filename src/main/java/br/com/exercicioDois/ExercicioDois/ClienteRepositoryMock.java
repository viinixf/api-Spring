package br.com.exercicioDois.ExercicioDois;

import java.util.List;
import org.springframework.stereotype.Component;
import br.com.exerciciodois.ExercicioDois.Cliente;

/**
 * Descrição da classe.
 */
//@Component
public class ClienteRepositoryMock extends ClienteMock {

    public ClienteRepositoryMock() {
        super();
    }

    /**
     * Retorna a lista de Cliente
     *
     * @return {@code List<Pessoa>}
     */
    @Override
    public List<Cliente> getAll() {
        return getListaDeClientes();
    }

    /**
     * Deleta um Cliente
     *
     * @param cliente
     * @return
     */
    @Override
    public Cliente delete(Cliente cliente) {
        return deleteRegistro(cliente);
    }

    @Override
    public Cliente insert(Cliente cliente) {
        return addCliente(cliente);
    }

    @Override
    public Cliente atualiza(Long id, Cliente cliente) {
        return atualizaCadastro(id, cliente);
    }
}
