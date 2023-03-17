package operation;
 
import book.Book;
import book.BookList;
 
import java.util.Scanner;
 
public class FindOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("查找图书");
        System.out.println("请输入要查找的图书");
        Scanner sca=new Scanner(System.in);
        String bookName=sca.nextLine();
        int currentSize= bookList.getUseSize();
        for (int i = 0; i < currentSize; i++) {
            Book book=bookList.getBook(i);
            if(book.getName().equals(bookName)) {
                System.out.println("找到了信息如下");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有要找的书");
    }
}