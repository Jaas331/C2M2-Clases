import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Book book1 = new Book();
        var book2 = new Book("Programacion en java", "Pedro Martinez", 900);
        var book3 = new Book("Lengua inglesa", "Jonh Dog", 500, LocalDate.of(2015, 10, 21), "Englis chool", "Aprendiz");
    
    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);
    
    }
}
