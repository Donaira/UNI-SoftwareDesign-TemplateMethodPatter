package Folders;

import Books.Book;

public class SelfBindingLeatherFolder extends Folder {

    @Override
    protected String getCover() {
        return "Leather";
    }

    @Override
    protected String getType() {
        return "Self-Binding";
    }
}
