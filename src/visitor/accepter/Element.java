package visitor.accepter;

import visitor.visitor.Visitor;

/**
 * Created by hao.yan on 2015/10/9.
 */
public interface Element {
    public void accept(Visitor visitor);
}
