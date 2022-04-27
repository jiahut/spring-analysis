package base.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 测试事务.
 *
 * @author skywalker
 */
@Component
public class TransactionBean {

    @Autowired
    private NestedBean nestedBean;

    @Transactional(propagation = Propagation.REQUIRED)
    public void process() {
        System.out.println("父亲嵌套事务开始执行");
        try {
            nestedBean.nest();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("父亲嵌套事务结束执行");
    }

}
