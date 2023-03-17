package operation;
 
import book.Book;
import book.BookList;
 
public class DisplayOperation implements IOperation{
 
    @Override
    public void work(BookList bookList) {
        System.out.println("œ‘ æÕº È");
        int currentSize= bookList.getUseSize();
        for (int i=0;i<currentSize;i++) {
            Book book=bookList.getBook(i);
            System.out.println(book);
        }
    }
}