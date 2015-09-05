package Books;

public class MysteryPlasticBook extends Book {

    @Override
    protected String getGenre() {
        return "Mystery";
    }

    @Override
    protected String getCover() {
        return "Plastic";
    }
}
