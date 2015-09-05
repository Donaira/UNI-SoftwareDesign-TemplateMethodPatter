package Books;

public class RomanceLeatherBook extends Book {

    @Override
    protected String getGenre() {
        return "Romance";
    }

    @Override
    protected String getCover() {
        return "Leather";
    }
}
