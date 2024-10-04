package exit;

public class editor {
    private EventManager man;

    public EventManager getMan() {
        return man;
    }

    public void setMan(EventManager man) {
        this.man = man;
    }

    public editor(EventManager man) {
        this.man = man;
    }

    public void openFile() {
        man.notifyAdd("file open");
    }

    public void saveFile(){
        man.notifyAdd("file close");
    }

}
