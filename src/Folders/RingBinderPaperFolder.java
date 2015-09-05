package Folders;

import Books.Book;

public class RingBinderPaperFolder extends Folder {

    @Override
    protected String getCover() {
        return "Paper";
    }

    @Override
    protected String getType() {
        return "Ring-Binder";
    }
}
