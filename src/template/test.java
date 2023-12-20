package template;

import java.util.Collections;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class test extends AbstractQueuedSynchronizer {
    protected boolean tryAcquire(int arg) {
//        Collections.synchronizedMap()
        return true;
    }

}
