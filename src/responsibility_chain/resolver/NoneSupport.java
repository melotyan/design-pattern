package responsibility_chain.resolver;

import responsibility_chain.Trouble;

/**
 * Created by hao.yan on 2015/10/19.
 */
public class NoneSupport extends Support {

    public NoneSupport(String name) {
        super(name);
    }

    public boolean resolve(Trouble trouble) {
        return false;
    }
}
