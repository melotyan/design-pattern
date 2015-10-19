package responsibility_chain.resolver;

import responsibility_chain.Trouble;

/**
 * Created by hao.yan on 2015/10/19.
 */
public class LimitSupport extends Support {
    private int num;

    public LimitSupport(String name, int num) {
        super(name);
        this.num = num;
    }

    public boolean resolve(Trouble trouble) {
        return trouble.getNum() < num ? true : false;
    }
}
