package operation;
import book.Book;
import book.BookList;
import java.util.Scanner;
 
public class AddOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("新增图书");
        System.out.println("图书名字");
        Scanner sca=new Scanner(System.in);
        String name=sca.nextLine();
        System.out.println("图书作者");
        String author=sca.nextLine();
        System.out.println("图书类型");
        String type=sca.nextLine();
        System.out.println("图书价格");
        int price=sca.nextInt();
 
        Book book=new Book(name,author,price,type);
        int currentSize= bookList.getUseSize();
        bookList.setBook(currentSize,book);
        bookList.setUseSize(currentSize+1);
        System.out.println("新增成功");
    }
}