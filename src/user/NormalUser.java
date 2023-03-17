package user;
 
import operation.*;
 
import java.util.Scanner;
 
public class NormalUser extends User{
 
    public NormalUser(String name) {
        super(name);
        iOperations=new IOperation[]{//��ʼ��
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
        };
    }
    public int menu() {
        System.out.println("hello "+this.name+" ����ͼ��ϵͳ");
        System.out.println("1.����ͼ��");
        System.out.println("2.����ͼ��");
        System.out.println("3.�黹ͼ��");
        System.out.println("0.�˳�ϵͳ");
        System.out.println("��ѡ����Ĳ���");
        Scanner sca=new Scanner(System.in);
        int choice=sca.nextInt();
        return choice;
    }
}