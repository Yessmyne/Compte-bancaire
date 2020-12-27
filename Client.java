import java.rmi.Naming;


public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            service1.crediter(200);
            service1.debiter(100);
            System.out.println(service1.lireSolde());

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}
