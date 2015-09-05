package Books;

public class MysteryLeatherBook extends Book {

    @Override
    protected String getGenre() {
        return "Mystery";
    }

    @Override
    protected String getCover() {
        return "Leather";
    }
}
