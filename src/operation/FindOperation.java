package operation;
 
import book.Book;
import book.BookList;
 
import java.util.Scanner;
 
public class FindOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("����ͼ��");
        System.out.println("������Ҫ���ҵ�ͼ��");
        Scanner sca=new Scanner(System.in);
        String bookName=sca.nextLine();
        int currentSize= bookList.getUseSize();
        for (int i = 0; i < currentSize; i++) {
            Book book=bookList.getBook(i);
            if(book.getName().equals(bookName)) {
                System.out.println("�ҵ�����Ϣ����");
                System.out.println(book);
                return;
            }
        }
        System.out.println("û��Ҫ�ҵ���");
    }
}