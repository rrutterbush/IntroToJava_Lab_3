
/**
 * Instantiates book objects. Each object should contain the following:
 * Author Last Name.
 * Author First Name.
 * ISBN Number
 * Book Title
 * Publication Date
 * Number of Pages
 * 
 * @author Rodnie Rutterbush
 * @version 2015.1.28
 * @updated 2015.2.2
 */
public class BookTemplate {

    private String authorLast;
    private String authorFirst;
    private int ISBN;
    private String bookTitle;
    private int date;
    private int numPages;
    private int minPages;
    
    public BookTemplate () {
        setAuthorLast();
        setAuthorFirst();
        setISBN();
        setBookTitle();
        setDate();
        setNumPages();
        
    }
    
    private void setAuthorLast() {
        this.authorLast;
    }
    
    private void setAuthorFirst() {
        this.authorFirst;
    }
    
    private void setISBN() {
        this.ISBN;
    }
    
    private void setBookTitle() {
    this.BookTitle;
    }
    
    private void setDate() {
        this.BookTitle;
    }
    
    private void setNumPages() {
        this.numPages;
        checkNumPages(numPages);
    }
    
    private void checkNumPages (int numPages) {
       int minPages = 10;
       if (numPages < minPages){
        printBook();
        }
    }
    public void printBook (String authorLast, String authorFirst, int ISBN, String bookTitle, int date, int numPages){
        System.out.println("#########################");
        System.out.println("#Title:" + bookTitle +"#");
        System.out.println("#Author" + authorLast +","+ authorFirst +"#");
        System.out.println("#ISBN:"+ ISBN + "#");
        System.out.println("#Date Published:" + date +"#");
        System.out.println("#Number of Pages:" + numPages +"#");
        System.out.println("################################");
        System.out.println();
    }
        
}