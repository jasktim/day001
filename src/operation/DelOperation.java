package operation;
 
import book.Book;
import book.BookList;
 
import java.util.Scanner;
 
public class DelOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("ɾ��ͼ��");
        System.out.println("������Ҫɾ��ͼ�������");
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
            System.out.println("û��Ҫɾ������");
            return ;
        }
        for (int j = index; j <currentSize ; j++) {
            Book book=bookList.getBook(j+1);
            bookList.setBook(j,book);
        }
        bookList.setBook(currentSize-1,null);
        bookList.setUseSize(currentSize-1);
        System.out.println("ɾ���ɹ�");
    }
}