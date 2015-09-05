package Folders;

import Books.Book;

public class SelfBindingPaperFolder extends Folder {

    @Override
    protected String getCover() {
        return "Paper";
    }

    @Override
    protected String getType() {
        return "Self-Binding";
    }
}
