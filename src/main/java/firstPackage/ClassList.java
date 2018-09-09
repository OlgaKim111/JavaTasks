package firstPackage;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class ClassList{

    public static void main(String[] args) {

        List<Integer> list =new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(9);

        System.out.println(list.get(1));
        System.out.println();

        int a=list.get(2);

        System.out.println(a);
        System.out.println();

        list.set(2,100);
        System.out.println(list.get(2));
        System.out.println();

        System.out.println(list.size());
        System.out.println();


        List<Integer> list2=new ArrayList<Integer>();
        list2.add(22);
        list2.add(33);
        list2.add(44);

        list.addAll(list2);
        System.out.println(list.size());
        System.out.println();

        list.removeAll(list2);
        System.out.println(list.size());
        System.out.println();

        System.out.println(list.contains(55));
        System.out.println(list.contains(100));
        System.out.println(list.isEmpty());
        System.out.println();


        Iterator<Integer> iterator=list.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println();
        }



    }
}
