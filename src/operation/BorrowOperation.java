package operation;
 
import book.Book;
import book.BookList;
 
import java.util.Scanner;
 
public class BorrowOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        System.out.println("请输入要借阅的图书");
        Scanner sca=new Scanner(System.in);
        String bookName=sca.nextLine();
        int currentSize= bookList.getUseSize();
        for (int i = 0; i < currentSize; i++) {
            Book book=bookList.getBook(i);
            if(book.getName().equals(bookName)) {
               book.setBorrowed(true);
                System.out.println("借阅成功");
                return;
            }
        }
        System.out.println("没有要借阅的书");
    }
}