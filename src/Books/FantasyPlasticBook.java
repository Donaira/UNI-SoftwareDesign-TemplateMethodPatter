package Books;

public class FantasyPlasticBook extends Book {

    @Override
    protected String getGenre() {
        return "Fantasy";
    }

    @Override
    protected String getCover() {
        return "Plastic";
    }
}
