package Folders;

import Books.Book;

public class RingBinderLeatherFolder extends Folder {

    @Override
    protected String getCover() {
        return "Leather";
    }

    @Override
    protected String getType() {
        return "Ring-Binder";
    }
}
