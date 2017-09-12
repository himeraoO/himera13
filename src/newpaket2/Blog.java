package newpaket2;

import java.util.Date;
public class Blog {
    public static void main(String[] args) {
        Post[] posts = new Post[7];
        posts[0] = new Post(24,"Night", "Hello", new Date());
        posts[1] = new Post(23,"Day" ,"Yes", new Date());
        posts[2] = new Post(2, "Star", "Smile", new Date());
        posts[3] = new Post(5, "World", "Tea", new Date());
        posts[4] = new Post(16, "Moon", "Carrot", new Date());
        posts[5] = new Post(42, "Pool", "Apple", new Date());
        posts[6] = new Post(8, "Card", "Hats", new Date());
        for (Post a: posts)
            System.out.println(a.getPostId() +" " + a.getTitle() + " " + a.getText() + " " + a.getPostedAt());
        for (int i = 0; i < posts.length; i++) {
            for (int j = i + 1; j < posts.length; j++) {
                if (posts[i].getPostId() > posts[j].getPostId()) {
//              if (posts[i].getTitle().compareTo(posts[j].getTitle()) < 0) {
                    Post temp = posts[j];
                    posts[j] = posts[i];
                    posts[i] = temp;
                }
            }
        }
        for(Post post : posts) {
            System.out.println(post.getPostId() + "");
//            System.out.println(post.getTitle() + "");
        }
    }
}
