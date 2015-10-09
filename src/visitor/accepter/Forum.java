package visitor.accepter;

import visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hao.yan on 2015/10/9.
 */
public class Forum {
    private List<Post> list = new ArrayList<Post>();

    public void addPost(Post post) {
        list.add(post);
    }

    public void removePost(Post post) {
        list.remove(post);
    }

    public void accept(Visitor visitor) {
        for (Post post : list) {
            visitor.visitPost(post);
        }
    }
}
