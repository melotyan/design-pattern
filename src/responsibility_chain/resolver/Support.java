package responsibility_chain.resolver;

import responsibility_chain.Trouble;

/**
 * Created by hao.yan on 2015/10/19.
 */
public abstract class Support {
    protected Support next;
    protected String name;

    protected Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    protected abstract boolean resolve(Trouble trouble);

    public void done(Trouble trouble) {
        System.out.println(trouble.toString() + "was solved by " + name);
    }

    public void fail(Trouble trouble) {
        System.out.println(trouble.toString() + " cannot be solved");
    }
}
