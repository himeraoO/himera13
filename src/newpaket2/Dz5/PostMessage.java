package newpaket2.Dz5;

public class PostMessage extends Message {

    private Message post;

    public Message getPost() {
        return post;
    }

    public void setPost(Message post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PostMessage)) return false;

        PostMessage that = (PostMessage) o;

        return getPost() != null ? getPost().equals(that.getPost()) : that.getPost() == null;
    }

    @Override
    public int hashCode() {
        return getPost() != null ? getPost().hashCode() : 0;
    }

    @Override
    public void send() {
        System.out.println("Отправлено сообщение" + post);
    }
}
