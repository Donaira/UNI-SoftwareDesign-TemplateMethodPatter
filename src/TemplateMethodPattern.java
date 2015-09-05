import Books.Book;
import Books.FantasyPaperBook;
import Books.MysteryLeatherBook;
import Books.RomancePlasticBook;
import Folders.*;

public class TemplateMethodPattern {
    public static void main(String[] args) {
        Book fantasyPaperBook = new FantasyPaperBook();
        fantasyPaperBook.printDescription();

        Book mysteryLeatherBook = new MysteryLeatherBook();
        mysteryLeatherBook.printDescription();

        Book romancePlasticBook = new RomancePlasticBook();
        romancePlasticBook.printDescription();

        Folder selfBinderPaperFolder = new SelfBindingLeatherFolder();
        selfBinderPaperFolder.printDescription();

        Folder selfBinderPlasticFolder = new SelfBindingPlasticFolder();
        selfBinderPlasticFolder.printDescription();

        Folder selfBinderLeatherFolder = new SelfBindingLeatherFolder();
        selfBinderLeatherFolder.printDescription();

        Folder ringBinderPaperFolder = new RingBinderPaperFolder();
        ringBinderPaperFolder.printDescription();

        Folder ringBinderPlasticFolder = new RingBinderPlasticFolder();
        ringBinderPlasticFolder.printDescription();

        Folder ringBinderLeatherFolder = new RingBinderLeatherFolder();
        ringBinderLeatherFolder.printDescription();
    }
}
