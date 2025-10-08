public class Error {

    // Use Exceptions ao invés de retornar o código
    public User createUser(User user){
        try {
            loadUser(user.getId());
            throw new UserExistsException(user.getId());
        } catch (UserNotFoundException exception){
            // detalhamento do tratamento de exceção
        }
        resolveGroup(user);
        return userRepository.save(user);
    }

    // Exceções com contexto
    public void validate(String id){
        if(ownerRepo.count(id) == 0){
            throw new ValidationException("ocorreu uma exceção ...");
        }
    }

    // Não retorne null e não passe null
    public User createUserWithoutNull(User user){
        try {
            loadUser(user.getId());
            throw new UserExistsException(user.getId());
        } catch (UserNotFoundException exception){
            // detalhamento do tratamento de exceção
        }
        resolveGroup(user);
        return userRepository.save(user);
    }

    // Dependências fictícias para compilação
    private UserRepository userRepository;
    private OwnerRepo ownerRepo;

    private void resolveGroup(User user){}

    private Object loadUser(String id) throws UserNotFoundException{
        return null;
    }

    // Classes de exceção fictícias
    public static class UserExistsException extends RuntimeException{
        public UserExistsException(String id){ super("User already exists: " + id);}
    }

    public static class ValidationException extends RuntimeException{
        public ValidationException(String message){ super(message);}
    }

    public static class UserNotFoundException extends Exception{}
    public static class User{}
    public static class UserRepository{
        public User save(User user){ return user;}
    }
    public static class OwnerRepo{
        public int count(String id){ return 0;}
    }
}
