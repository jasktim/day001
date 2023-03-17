package operation;
 
import book.Book;
import book.BookList;
 
import java.util.Scanner;
 
public class DelOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.println("请输入要删除图书的名字");
        Scanner sca=new Scanner(System.in);
        String name=sca.nextLine();
        int currentSize= bookList.getUseSize();
        int index=0;
        int i = 0;
        for (; i <currentSize ; i++) {
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)) {
                index=i;
                break;
            }
        }
        if(i==currentSize) {
            System.out.println("没有要删除的书");
            return ;
        }
        for (int j = index; j <currentSize ; j++) {
            Book book=bookList.getBook(j+1);
            bookList.setBook(j,book);
        }
        bookList.setBook(currentSize-1,null);
        bookList.setUseSize(currentSize-1);
        System.out.println("删除成功");
    }
}