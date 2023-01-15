public class Singleton {
    private static Singleton nesne;
    private Singleton(){}

    public static Singleton nesneDondur(){
        if(nesne == null) {
            nesne = new Singleton();
        }
            return nesne;
    }
}
