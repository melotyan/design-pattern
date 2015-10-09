package visitor.accepter;

import visitor.visitor.Visitor;

/**
 * Created by hao.yan on 2015/10/8.
 */
public class Blog implements Element{
    private String name;

    public Blog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visitBlog(this);
    }
}
