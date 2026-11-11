package baozi_store.service;

import baozi_store.exception.RecursoNaoEncontradoException;
import baozi_store.exception.RegraNegocioException;
import baozi_store.model.Pedido;
import baozi_store.repository.ClienteRepository;
import baozi_store.repository.PedidoRepository;
import baozi_store.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;
    private final ProdutoRepository produtoRepository;

    public PedidoService(PedidoRepository pedidoRepository, ClienteRepository clienteRepository,
                         ProdutoRepository produtoRepository) {
        this.pedidoRepository = pedidoRepository;
        this.clienteRepository = clienteRepository;
        this.produtoRepository = produtoRepository;
    }

    public Pedido cadastrar(Pedido pedido ) {
        if (clienteRepository.findById(pedido.getClienteId()).isEmpty()) {
            throw new RecursoNaoEncontradoException("Cliente não encontrado");

        } else if (produtoRepository.findById(pedido.getProdutoId()).isEmpty()) {
            throw  new RecursoNaoEncontradoException("Produto não encontrado");

        } else if (pedido.getQuantidade() == null || pedido.getQuantidade() <= 0) {
            throw  new RegraNegocioException("Quantidade precisa ser maior que 0");
        }

        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public void excluir(Long id) {
        pedidoRepository.deleteById(id);
    }
}
