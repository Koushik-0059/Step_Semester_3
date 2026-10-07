package control_flow.class_problems.assignment_problems.Week_6;

class BookInventory {

    String title;
    String author;
    int copiesAvailable;

    BookInventory(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copies;
    }

    void printEntry() {
        System.out.println(title + " by " + author +
                           " - " + copiesAvailable + " copies available");
    }
}

public class BookInventoryApp {

    public static void main(String[] args) {

        BookInventory[] books = {
            new BookInventory("Clean Code", "Robert C. Martin", 3),
            new BookInventory("Effective Java", "Joshua Bloch", 5),
            new BookInventory("Refactoring", "Martin Fowler", 0),
            new BookInventory("Design Patterns", "GoF", 2)
        };

        for (BookInventory b : books) {
            b.printEntry();
        }
    }
}