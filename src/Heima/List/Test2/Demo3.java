package Heima.List.Test2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
    ListIterator：列表迭代器
        通过List集合的listIterator​()方法得到，所以说它是List集合特有的迭代器
        用于允许程序员沿任一方向遍历列表的列表的迭代器，在迭代期间修改列表，并获取列表中迭代器的当前位置

    ListIterator中的常用方法
        E next()：返回迭代中的下一个元素
        boolean hasNext()：如果迭代具有更多元素，则返回 true
        E previous​()：返回列表中的上一个元素
        boolean hasPrevious​()：如果此列表迭代器在相反方向遍历列表时具有更多元素，则返回 true
        void add​(E e)：将指定的元素插入列表
 */
public class Demo3 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> Li = new ArrayList<String>();

        Li.add("ou");
        Li.add("uo");
        Li.add("ouo");



//        while(l.hasNext()){
//            String n = l.next();
//            System.out.println(n);
//        }
//
//
//        while(l.hasPrevious()){
//            String p = l.previous();
//            System.out.println(p);

/*
        用Iterator调用的add方法报错：ConcurrentModificationException
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if(s.equals("world")) {
                list.add("javaee");
            }
        }*/

        //通过List集合的listIterator​()方法得到
        ListIterator<String> l = Li.listIterator();
        //获取列表迭代器
        while(l.hasNext()){
            String n = l.next();
            if(n=="ou"){
                l.add("----");
            }
        }
        System.out.println(Li);
    }
}
