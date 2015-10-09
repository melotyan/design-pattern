package visitor.accepter;

import visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hao.yan on 2015/10/9.
 */
public class Blogs {
    List<Blog> list = new ArrayList<Blog>();

    public void addBlog(Blog blog) {
        list.add(blog);
    }

    public void removeBlog(Blog blog) {
        list.remove(blog);
    }

    public void accept(Visitor visitor) {
        for (Blog blog : list) {
            visitor.visitBlog(blog);
        }
    }

}
