package Folders;

import Books.Book;

public class SelfBindingPlasticFolder extends Folder {

    @Override
    protected String getCover() {
        return "Plastic";
    }

    @Override
    protected String getType() {
        return "Self-Binding";
    }
}
