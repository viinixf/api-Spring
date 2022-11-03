package br.com.exercicioDois.ExercicioDois;

import br.com.exerciciodois.ExercicioDois.Cliente;
import java.util.ArrayList;
import java.util.List;

abstract class ClienteMock {

    private List<Cliente> listaDeClientes = new ArrayList<>();

    public ClienteMock() {
        this.inicializaLista();
    }

    public List<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    protected Cliente deleteRegistro(Cliente cliente) {
        listaDeClientes.remove(cliente);
        return cliente;
    }

    protected Cliente atualizaCadastro(long id, Cliente clienteUpdate) {
        for (Cliente cliente : getListaDeClientes()) {
            System.out.println(cliente.getNome());
            if (cliente.getId().equals(id)) {
                listaDeClientes.remove(cliente);
            }
        }
        clienteUpdate.setId(id);
        listaDeClientes.add(clienteUpdate);
        return clienteUpdate;
    }

    protected Cliente addCliente(Cliente cliente) {
        this.listaDeClientes.add(cliente);
        return cliente;
    }

    //Lista de Registros
    protected List<Cliente> listaMockada() {
        return listaDeClientes;
    }

    public abstract Cliente insert(Cliente cliente);

    public abstract Cliente delete(Cliente cliente);

    public abstract Cliente atualiza(Long id, Cliente cliente);

    public abstract List<Cliente> getAll();

    private void inicializaLista() {
        this.listaDeClientes.add(new Cliente(1l, "Fritz", 22, "93494107025", "0259548125"));
        this.listaDeClientes.add(new Cliente(2l, "Frida", 22, "93494107014", "59984954564"));
    }

}
