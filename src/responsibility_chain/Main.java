package responsibility_chain;

import responsibility_chain.resolver.LimitSupport;
import responsibility_chain.resolver.NoneSupport;
import responsibility_chain.resolver.OddSupport;
import responsibility_chain.resolver.Support;

/**
 * Created by hao.yan on 2015/10/19.
 */
public class Main {

    public static void main(String[] args) {
        Support alice = new NoneSupport("Alice");
        Support bob = new LimitSupport("Bob", 10);
        Support tom = new OddSupport("Tom");

        alice.setNext(bob).setNext(tom);

        for (int i = 0; i < 15; i++) {
            alice.support(new Trouble(i));
        }
    }
}
