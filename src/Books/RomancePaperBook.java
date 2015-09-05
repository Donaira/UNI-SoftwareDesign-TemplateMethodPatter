package Books;

public class RomancePaperBook extends Book {

    @Override
    protected String getGenre() {
        return "Romance";
    }

    @Override
    protected String getCover() {
        return "Paper";
    }
}
