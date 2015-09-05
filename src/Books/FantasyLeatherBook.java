package Books;

public class FantasyLeatherBook extends Book {

    @Override
    protected String getGenre() {
        return "Fantasy";
    }

    @Override
    protected String getCover() {
        return "Leather";
    }
}
