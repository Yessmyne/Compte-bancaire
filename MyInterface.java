import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    double lireSolde()throws RemoteException;
    String crediter(double s)throws RemoteException;
    String debiter(double s)throws RemoteException;
}
