package visitor.visitor;

import visitor.accepter.Blog;
import visitor.accepter.Post;

/**
 * Created by hao.yan on 2015/10/9.
 */
public class WebVisitor extends Visitor {
    public void visitBlog(Blog blog) {
        System.out.println("通过网页访问博客: " + blog.getName());
    }

    public void visitPost(Post post) {
        System.out.println("通过网页访问论坛帖子：" + post.getName());
    }
}
