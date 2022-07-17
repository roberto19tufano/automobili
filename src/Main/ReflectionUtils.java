package Main;

public class ReflectionUtils<T> {

    public static Object instantiateClass (String nomeClasse){
        try {
            return Class.forName(nomeClasse).getDeclaredConstructor().newInstance(); //da Java 9 serve mettere getDeclaredConstructor() prima di newInstance()
        } catch (Throwable e) {
            return null;
        }
    }
}

