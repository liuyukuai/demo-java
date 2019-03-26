package com.itxiaoer.demo.leetcode;

import java.util.stream.Stream;

/**
 * 929. 独特的电子邮件地址
 * <p>
 * see https://leetcode-cn.com/problems/unique-email-addresses/description/
 *
 * @author : liuyk
 */
public class LeetCode929 {

    public static void main(String[] args) {
        String[] emails = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
//        String[] emails = new String[]{"j+ezsorqlmc@rfpycgjuf.com", "j+k+ri+rigt.ad@rfpycgjuf.com", "hfmeqzk.isx+i@fiidmdrsu.com", "j+p+h+d+d+p+z.j.k.g@rfpycgjuf.com", "zygekdy.l.w+s@snh.owpyu.com", "j+m.l+ia+qdgv+w@rfpycgjuf.com", "r+hwbjwefkp@wcjaki.n.com", "zygekdy.l.w+d@snh.owpyu.com", "bizdm+sz.f.a.k@il.cjjlp.com", "hfmeqzk.isx+t@fiidmdrsu.com", "hfmeqzk.isx+i@fiidmdrsu.com", "bizdm+f+j+m.l.l@il.cjjlp.com", "zygekdy.l.w+g@snh.owpyu.com", "r+evgvxmksf@wcjaki.n.com", "hfmeqzk.isx+h@fiidmdrsu.com", "bizdm+lov+cy@il.cjjlp.com", "hfmeqzk.isx+o@fiidmdrsu.com", "bizdm+hs+qao@il.cjjlp.com", "r+v+z+rcuznrj@wcjaki.n.com", "j+r.kn+h.w.a.h+bh@rfpycgjuf.com", "hfmeqzk.isx+t@fiidmdrsu.com", "hfmeqzk.isx+a@fiidmdrsu.com", "zygekdy.l.w+o@snh.owpyu.com", "zygekdy.l.w+i@snh.owpyu.com", "r+vy.u.y+f.er+aw@wcjaki.n.com", "zygekdy.l.w+c@snh.owpyu.com", "bizdm+wztzg@il.cjjlp.com", "j+h.fwbsr+chp@rfpycgjuf.com", "zygekdy.l.w+s@snh.owpyu.com", "zygekdy.l.w+d@snh.owpyu.com", "bizdm+qq.o.q+p@il.cjjlp.com", "zygekdy.l.w+o@snh.owpyu.com", "j+c+zqbq+h.dyt@rfpycgjuf.com", "r+hl.b.i+fz.hz.t@wcjaki.n.com", "r+cbabpf.k+w+e@wcjaki.n.com"};

        System.out.println(numUniqueEmails(emails));
    }

    private static int numUniqueEmails(String[] emails) {

        return (int) Stream.of(emails).map(e -> e.split("@")).map(a -> {
            String name = a[0];
            String address = a[1];
            if (name.contains("+")) {
                name = name.substring(0, name.indexOf("+"));

            }

            if (name.contains(".")) {
                name = name.replaceAll("\\.", "");
            }
            return name + "@" + address;
        }).distinct().count();


//        return (int) Stream.of(emails).map(e -> e.split("@"))
//                .collect(Collectors.toMap(e -> e[0], e -> e[1]))
//                .entrySet()
//                .stream()
//                .map(data -> {
//                    String key = data.getKey();
//                    if (key.contains("+")) {
//                        key = key.substring(0, key.indexOf("+"));
//
//                    }
//
//                    if (key.contains(".")) {
//                        key = key.replaceAll("\\.", "");
//                    }
//                    return key + "@" + data.getValue();
//                }).distinct().count();
    }


}
