package Folders;

public abstract  class Folder {
    public void printDescription() {
        System.out.println(String.format("%s %s folder", getType(), getCover()));
    }

    protected abstract String getCover();
    protected abstract String getType();
}
