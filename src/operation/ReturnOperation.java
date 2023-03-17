package operation;
 
import book.Book;
import book.BookList;
 
import java.util.Scanner;
 
public class ReturnOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.println("请输入要归还的图书");
        Scanner sca=new Scanner(System.in);
        String bookName=sca.nextLine();
        int currentSize= bookList.getUseSize();
        for (int i = 0; i < currentSize; i++) {
            Book book=bookList.getBook(i);
            if(book.getName().equals(bookName)) {
                book.setBorrowed(false);
                System.out.println("归还成功");
                return;
            }
        }
        System.out.println("没有要归还的书");
    }
}