package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ���������������޳�û������������
 * ��������������������
 * ���������ߩ��������ߩ�
 * ����������������������
 * ����������������������
 * ���������ש������ס���
 * ����������������������
 * �������������ߡ�������
 * ����������������������
 * ����������������������
 * ���������������������ޱ���, ����BUG!
 * ������������������Code is far away from bug with the animal protecting
 * ��������������������������
 * �������������������������ǩ�
 * ����������������������������
 * �������������������ש�����
 * �������������ϩϡ����ϩ�
 * �������������ߩ������ߩ�
 * �������������о������թ�����������
 * Module Desc:clover
 * User: z.mm | 2428922347@qq.com
 * Date: 2016/1/29
 * Time: 15:14
 * state:
 */
public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/*.xml");
        context.start();
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.getUser(1L));
    }
}
