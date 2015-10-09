package visitor.visitor;

import visitor.accepter.Blog;
import visitor.accepter.Post;

/**
 * Created by hao.yan on 2015/10/8.
 */
public abstract class Visitor {
    public abstract void visitBlog(Blog blog);
    public abstract void visitPost(Post post);
}
