package HomeWork.HomeWorkFour;

import java.util.LinkedList;

public class TaskOne {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");
        for (Object o : revert(ll)) {
            System.out.println(o);
        }

    }

    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> lll = new LinkedList<>();
        boolean work = true;
        while (work) {
            if (ll.size() > 0) {
                lll.add(ll.removeLast());
            } else {
                work = false;
            }
        }

        return lll;
    }
}
