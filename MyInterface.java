/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    double lireSolde()throws RemoteException;
    String crediter(double s)throws RemoteException;
    String debiter(double s)throws RemoteException;
}
