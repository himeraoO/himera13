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
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PostMessage that = (PostMessage) o;

        return post != null ? post.equals(that.post) : that.post == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (post != null ? post.hashCode() : 0);
        return result;
    }

    @Override
    public void send() {
        System.out.println("Отправлено сообщение" + post);
    }
}
