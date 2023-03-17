package user;
 
import operation.*;
 
import java.util.Scanner;
 
public class AdminUser extends User{
 
    public AdminUser(String name) {
        super(name);
        iOperations=new IOperation[]{//初始化
                 new ExitOperation(),
                 new FindOperation(),
                 new AddOperation(),
                 new DelOperation(),
                 new DisplayOperation(),
         };
    }
    public int menu() {
        System.out.println("hello "+this.name+" 来到图书系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("请选择你的操作");
        Scanner sca=new Scanner(System.in);
        int choice=sca.nextInt();
        return choice;
    }
}