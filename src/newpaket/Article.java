package newpaket;
public class Article extends Publisher {
    public Article(){}
    @Override
    public void print() {
        System.out.println(author);
    }
}
