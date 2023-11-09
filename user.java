import java.util.ArrayList;
import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class user implements Manageable{

    String id;
    ArrayList<flower> registeredFlower = new ArrayList<>();

    @Override
    public void read(Scanner scan){
        id=scan.next();
        String flowername;
        flower Flower =null;
        while(true){
            flowername=scan.next();
            if(flowername.equals("0")) break;
            Flower = (flower)store.flowerMgr.find(flowername);
            if(Flower == null) System.out.print("null: "+flowername);
            registeredFlower.add(Flower);
            System.out.println(registeredFlower.get(0));
        }
    }

    @Override
    public void print(){
        System.out.printf("%s: ",id);
        for(flower myflower: registeredFlower){
            System.out.printf("%s ",myflower.getname());
        }
        System.out.println();
    }
    @Override
    public boolean matches(String kwd){
        if(id.contentEquals(kwd)) return true;
        if(registeredFlower.contains(kwd)) return true;
        return false;
    }
}