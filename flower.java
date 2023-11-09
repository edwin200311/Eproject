import java.util.Scanner;

public class flower implements Manageable {

    String name;        //이름
    String language;    //꽃말
    String flowering;   //개화시기
    String color;       //색상
    String care;        //관리법
    int cost;           //가격

    @Override
    public void read(Scanner scan) {
        name = scan.next();
        language = scan.next();
        flowering=scan.next();
        color=scan.next();
        cost=scan.nextInt();
        care=scan.nextLine();
    }
    
    @Override
    public void print(){
        System.out.printf("이름: %s 꽃말: %s 개화시기:%s 색상:%s 관리법:%s 가격: %d\n",name,language,flowering,color,care,cost);
    }
    @Override
    public boolean matches(String kwd){
        if(name.equals(kwd)) return true;
        return false;
    }

    public String getname(){
        return this.name;
    }
}
