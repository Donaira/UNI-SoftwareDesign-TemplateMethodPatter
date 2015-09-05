package Books;

public class MysteryPaperBook extends Book {

    @Override
    protected String getGenre() {
        return "Mystery";
    }

    @Override
    protected String getCover() {
        return "Paper";
    }
}
