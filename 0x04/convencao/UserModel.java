package convensao;

import java.util.ArrayList;
import java.util.List;

// Classe User representando nossa entidade
public class UserModel {

    int idUser;
    String descricao;

    public static final int IDADE_MINIMA = 18;

    // Função que coleta todos os users
    public List<UserModel> fetchUsers() {
        return new ArrayList<>();
    }

    // Função que coleta todos os users
    public List<UserModel> allUsers() {
        return new ArrayList<>();
    }

    // Função que coleta todos os users
    public List<UserModel> getUsers() {
        return new ArrayList<>();
    }
}
