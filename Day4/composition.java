package Day4;

class book {
    String title;

    book(String title) {
        this.title = title;

    }
}

class library {
    String name;
    book book;

    library(String name, String title) {
        this.name = name;
        this.book = new book(title);

    }

    void show() {
        System.out.println(name + " has book " + book.title);
    }
}

public class composition {
    public static void main(String[] args) {

        library l = new library("pari", "heaven");
        l.show();
    }

}
