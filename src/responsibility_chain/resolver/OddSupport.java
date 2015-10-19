package responsibility_chain.resolver;

import responsibility_chain.Trouble;

/**
 * Created by hao.yan on 2015/10/19.
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    public boolean resolve(Trouble trouble) {
        return trouble.getNum() % 2 == 0 ? false : true;
    }
}
