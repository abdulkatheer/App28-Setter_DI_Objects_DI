package org.katheer.test;

import org.katheer.bean.Address;
import org.katheer.bean.Profile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        Objects can be injected in two ways.
        1. Creating another bean and passing ref of it. In this case, this bean object can be used for another purpose.
        2. Creating another inner bean. This inner can be accessed from outside. Single purpose.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("org" +
                "/katheer/resource/applicationContext.xml");
        Profile p1 = (Profile) context.getBean("profile1");
        p1.showProfile();

        Profile p2 = (Profile) context.getBean("profile2");
        p2.showProfile();

        String[] beans = context.getBeanDefinitionNames();

        for(String bean : beans) {
            System.out.print(bean + " ");
        }

        //Address a1 = (Address) context.getBean("a1");

    }
}
