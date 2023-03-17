package user;
 
import operation.*;
 
import java.util.Scanner;
 
public class NormalUser extends User{
 
    public NormalUser(String name) {
        super(name);
        iOperations=new IOperation[]{//初始化
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
        };
    }
    public int menu() {
        System.out.println("hello "+this.name+" 来到图书系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("请选择你的操作");
        Scanner sca=new Scanner(System.in);
        int choice=sca.nextInt();
        return choice;
    }
}