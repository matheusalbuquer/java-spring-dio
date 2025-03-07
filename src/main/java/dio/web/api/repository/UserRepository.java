package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save (Usuario usuario){
        if(usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada de repository");
         else
            System.out.println("UPDATE - Recebendo o usuário na camada de repository");

         System.out.println(usuario);
    }

    public void deleteById (Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuario"));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usúarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson", "password"));
        usuarios.add(new Usuario("frank", "masterpass"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário"));
        return new Usuario("gleyson", "password");
    }

    public Usuario findByUsername(){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para retornar um usuário "));
        return new Usuario("gleyson", "password");
    }



}
