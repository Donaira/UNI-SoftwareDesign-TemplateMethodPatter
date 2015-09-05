package Books;

public class FantasyPaperBook extends Book {

    @Override
    protected String getGenre() {
        return "Fantasy";
    }

    @Override
    protected String getCover() {
        return "Paper";
    }
}
