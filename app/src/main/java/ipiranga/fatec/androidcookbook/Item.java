package ipiranga.fatec.androidcookbook;

public class Item {

    private String title;
    private String subtitle;
    private int n1;
    private int n2;

    public Item(String title, String subtitle, int n1, int n2) {
        this.title = title;
        this.subtitle = subtitle;
        this.n1 = n1;
        this.n2 = n2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", n1=" + n1 +
                ", n2=" + n2 +
                '}';
    }
}
