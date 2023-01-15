

public class Main {
    public static void main(String[] args) {
        Singleton nesne1 = Singleton.nesneDondur();
        Singleton nesne2 = Singleton.nesneDondur();

        if (nesne1 == nesne2){
            System.out.println("aynı adres isaret edildi");
        }

    }
}