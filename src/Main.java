import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;
 
import java.util.Scanner;
 
public class Main {
    public static User login() {
        System.out.println("����������");
        Scanner sca=new Scanner(System.in);
        String name=sca.nextLine();
        System.out.println("��������ݣ�1.����Ա 0.ѧ��");
        int choice=sca.nextInt();
        if(choice==1) {
            return new AdminUser(name);
        } else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList books=new BookList();
        User user=login();
        while(true) {
            int choice=user.menu();
            user.doOperation(choice,books);
        }
    }
}