package visitor.accepter;

import visitor.visitor.Visitor;

/**
 * Created by hao.yan on 2015/10/9.
 */
public class Post implements Element {
    private String name;

    public Post(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visitPost(this);
    }
}
