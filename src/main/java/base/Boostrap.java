package base;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import base.transaction.TransactionBean;

public class Boostrap {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        TransactionBean bean = context.getBean(TransactionBean.class);
        bean.process();
    }

}
