public class book{
    
    String bookname;
    int noOfPages;
    String author;
    int price;
    int publishedyear;
    String publisher;
    String type;
    book(String bookname, int noOfPages, String author, int price, int publishedyear, String publisher, String type){
        this.bookname=bookname;
        this.noOfPages=noOfPages;
        this.author=author;
        this.price=price;
        this.publishedyear=publishedyear;
        this.publisher=publisher;
        this.type=type;

    }
    public void bookinfo(){
           System.out.println("bookname:"+ bookname);
           System.out.println("noOfPages:"+ noOfPages);
           System.out.println("author:"+author);
           System.out.println("price:"+price);
           System.out.println("publishedyear:"+publishedyear);
           System.out.println("publisher"+publisher);
           System.out.println("type:"+type);
           System.out.println("-----------------------------------");

    }
    public static void main(String[] args){

        book book1= new book("the history of tom jones",200, "henry fielding",250,1749,"andriw miller","novel" );
        book book2= new book("pride and prejudice",150,"jane austen",300,1813,"whitehall","novel");
        book book3= new book("the red and the black",180,"stendhal",320,1830,"levasseur","novel");
        book book4= new book("le pere goriot",155,"honore de balzac",250,1819,"revue de paris","novel");
        book book5= new book("david copperfield",190,"charles dickens",625,1850,"bradbury and evans","novels");
        book book6= new book("provincal manners",500,"gustave flaubert",600,1856,"revue de paries","novels");
        book book7= new book("the whale",550,"herman melville",550,1851,"richard bently","novels");
        
        book1.bookinfo();
        book2.bookinfo();
        book3.bookinfo();
        book4.bookinfo();
        book5.bookinfo();
        book6.bookinfo();
        book7.bookinfo();

    }
}