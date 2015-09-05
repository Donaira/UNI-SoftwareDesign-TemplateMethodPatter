package Folders;

import Books.Book;

public class RingBinderPlasticFolder extends Folder {

    @Override
    protected String getCover() {
        return "Plastic";
    }

    @Override
    protected String getType() {
        return "Ring-Binder";
    }
}
