package operation;
 
import book.Book;
import book.BookList;
 
import java.util.Scanner;
 
public class BorrowOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("����ͼ��");
        System.out.println("������Ҫ���ĵ�ͼ��");
        Scanner sca=new Scanner(System.in);
        String bookName=sca.nextLine();
        int currentSize= bookList.getUseSize();
        for (int i = 0; i < currentSize; i++) {
            Book book=bookList.getBook(i);
            if(book.getName().equals(bookName)) {
               book.setBorrowed(true);
                System.out.println("���ĳɹ�");
                return;
            }
        }
        System.out.println("û��Ҫ���ĵ���");
    }
}