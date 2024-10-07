public class Book {
    private String title;
    private int pageNum;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void infor() {
        System.out.println("title:" + title);
        System.out.println("pageNum:" + pageNum);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        book1.setTitle("little star");
        book2.setTitle("big star");
        book1.setPageNum(10);
        book2.setPageNum(100);

        book1.infor();
        book2.infor();

    }
}
