package operation;
 
import book.Book;
import book.BookList;
 
import java.util.Scanner;
 
public class ReturnOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("�黹ͼ��");
        System.out.println("������Ҫ�黹��ͼ��");
        Scanner sca=new Scanner(System.in);
        String bookName=sca.nextLine();
        int currentSize= bookList.getUseSize();
        for (int i = 0; i < currentSize; i++) {
            Book book=bookList.getBook(i);
            if(book.getName().equals(bookName)) {
                book.setBorrowed(false);
                System.out.println("�黹�ɹ�");
                return;
            }
        }
        System.out.println("û��Ҫ�黹����");
    }
}