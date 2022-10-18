package tfalc.apiswagger.repository;

import org.springframework.stereotype.Repository;
import tfalc.apiswagger.handler.BusinessException;
import tfalc.apiswagger.handler.ObrigatorioException;
import tfalc.apiswagger.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(Usuario usuario) {
        if(usuario.getLogin() == null) {
            throw new ObrigatorioException("login");
        }

        if(usuario.getPassword() == null) {
            throw new ObrigatorioException("password");
        }
        if (usuario.getId() == null) {
            System.out.println("SAVE - Recebendo usuário na camada repository");
        }else{
            System.out.println("UPDATE - Recebendo usuário na camada repository");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir",id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema...");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Thiago", "password"));
        usuarios.add(new Usuario("Janaina", "masterpass"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d", id));
        return new Usuario("Thiago", "password");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - recebendo: %s", username));
        return new Usuario("Thiago", "password");
    }
}
