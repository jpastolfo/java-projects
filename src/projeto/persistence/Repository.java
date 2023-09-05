package projeto.persistence;

import java.util.List;
import projeto.model.Entidade;

public interface Repository<T extends Entidade<ID>, ID> {

    T cadastrar(T entidade);

    boolean atualizar(T entidade);

    List<T> listarTodos();

    T buscarPorId(ID cpf);

}
