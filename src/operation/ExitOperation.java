package operation;
 
import book.Book;
import book.BookList;
 
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("ÍË³ö³ÌÐò");
        int currentSize= bookList.getUseSize();
        for (int i=0;i<currentSize;i++) {
            bookList.setBook(i,null);
        }
        System.exit(0);
    }
}