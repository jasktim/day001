package book;
public class BookList {
    private Book[] books=new Book[10];
    private int useSize=0;
 
    public BookList() {
        books[0] = new Book("三国演义", "罗贯中", 34, "小说");
        books[1]=new Book("西游记","吴承恩",25,"小说");
        books[2]=new Book("红楼梦","曹雪芹",32,"小说");
        books[3]=new Book("水浒传","施耐庵",45,"小说");
        this.useSize=4;
    }
 
    public int getUseSize() {
        return useSize;
    }
 
    public void setUseSize(int useSize) {
        this.useSize = useSize;
    }
    /*
    得到pos下标的书
    * */
    public Book getBook(int pos) {
        return books[pos];
    }
    /*设置一本书在pos位置
    * */
    public void setBook(int pos,Book book) {
       books[pos]=book;
    }
}