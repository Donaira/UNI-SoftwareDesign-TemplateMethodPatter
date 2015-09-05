package Books;

public class RomancePlasticBook extends Book {

    @Override
    protected String getGenre() {
        return "Romance";
    }

    @Override
    protected String getCover() {
        return "Plastic";
    }
}
