package Books;

public abstract class Book {
    public void printDescription() {
        System.out.println(String.format("%s %s book", getGenre(), getCover()));
    }

    protected abstract String getGenre();

    protected abstract String getCover();
}
