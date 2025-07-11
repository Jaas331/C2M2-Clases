import java.time.LocalDate;

public class Book {
    // Atributos
    private String title;
    private String author;
    private Integer pages;
    private LocalDate publishiDate;  // nuevo metodo para manejar fechas
    private String editor;
    private String category;

    // Constructor, inicializa un objeto
    public Book(){
        title = "Las aventuras de cesar";
        author = "Cesar Diaz";
        pages = 10;
        publishiDate = LocalDate.now();
        editor = "McGrawHill";
        category = "Action";

    }

    public Book(String title, String author, Integer pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publishiDate = LocalDate.now();
        this.editor = "McGrawHill";
        this.category = "Action";
    }

        public Book(String title, String author, Integer pages, LocalDate publishDate, String editor, String category) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publishiDate = publishiDate;
        this.editor = editor ;
        this.category = category;
        }

    // Metodos
    public  String dameTuTitulo(){
        return this.title;
    }

    // Metodos Getter -> Obtener los valores de los atributos
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }

    public String getpages(){
        return author;
    }

    // Setter -> cambiar de manera directa el valor de un atributo -> set<Atributo>(TD par)
    public void setCategory(String category){
        this.category = category;
    }

    public String toString(){
        return "Libro: titulo: " + title;
    }
}
