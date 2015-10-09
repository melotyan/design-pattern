package visitor;

import visitor.accepter.Blog;
import visitor.accepter.Blogs;
import visitor.accepter.Forum;
import visitor.accepter.Post;
import visitor.visitor.AppVisitor;
import visitor.visitor.Visitor;
import visitor.visitor.WebVisitor;

/**
 * Created by hao.yan on 2015/10/8.
 */
public class Main {
    public static void main(String[] args) {
        Blogs blogs = new Blogs();
        Blog blog1 = new Blog("第一个博客");
        Blog blog2 = new Blog("第二个博客");
        Blog blog3 = new Blog("第三个博客");
        blogs.addBlog(blog1);
        blogs.addBlog(blog2);
        blogs.addBlog(blog3);

        Forum forum = new Forum();
        Post post1 = new Post("第一个帖子");
        Post post2 = new Post("第二个帖子");
        forum.addPost(post1);
        forum.addPost(post2);

        Visitor appVisitor = new AppVisitor();
        Visitor webVisitor = new WebVisitor();
        blog1.accept(appVisitor);
        blog1.accept(webVisitor);
        post2.accept(appVisitor);
        post2.accept(webVisitor);

        blogs.accept(appVisitor);
        blogs.accept(webVisitor);
        forum.accept(appVisitor);
        forum.accept(webVisitor);
    }
}
