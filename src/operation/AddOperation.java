package operation;
import book.Book;
import book.BookList;
import java.util.Scanner;
 
public class AddOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("����ͼ��");
        System.out.println("ͼ������");
        Scanner sca=new Scanner(System.in);
        String name=sca.nextLine();
        System.out.println("ͼ������");
        String author=sca.nextLine();
        System.out.println("ͼ������");
        String type=sca.nextLine();
        System.out.println("ͼ��۸�");
        int price=sca.nextInt();
 
        Book book=new Book(name,author,price,type);
        int currentSize= bookList.getUseSize();
        bookList.setBook(currentSize,book);
        bookList.setUseSize(currentSize+1);
        System.out.println("�����ɹ�");
    }
}