package book;
public class BookList {
    private Book[] books=new Book[10];
    private int useSize=0;
 
    public BookList() {
        books[0] = new Book("��������", "�޹���", 34, "С˵");
        books[1]=new Book("���μ�","��ж�",25,"С˵");
        books[2]=new Book("��¥��","��ѩ��",32,"С˵");
        books[3]=new Book("ˮ䰴�","ʩ����",45,"С˵");
        this.useSize=4;
    }
 
    public int getUseSize() {
        return useSize;
    }
 
    public void setUseSize(int useSize) {
        this.useSize = useSize;
    }
    /*
    �õ�pos�±����
    * */
    public Book getBook(int pos) {
        return books[pos];
    }
    /*����һ������posλ��
    * */
    public void setBook(int pos,Book book) {
       books[pos]=book;
    }
}