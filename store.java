
import java.util.Scanner;

public class store {
	Scanner scan = new Scanner(System.in);
	static Manager flowerMgr = new Manager();
	static Manager userMgr = new Manager();
	
	void run() {
		flowerMgr.readAll("flower.txt", new flowerFac());
		flowerMgr.printAll();
		userMgr.readAll("user.txt", new Factory() {
			public Manageable create() {
				return new user();
			}
		});
		userMgr.printAll();
		searchMenu();
	}
	class flowerFac implements Factory {
		public Manageable create() {
			return new flower();
		}
	}
	void searchMenu()	{
        while(true){
        System.out.printf("(1): 검색 (2): 구매 (3): 관리자\n");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                flowerMgr.search(scan);
                break;
            case 2:
                
                break;

            case 3:

                break;
            default:
                break;
        }
    }
	}
	
	public static void main(String args[]) {
		store my = new store();
		my.run();
	}
}