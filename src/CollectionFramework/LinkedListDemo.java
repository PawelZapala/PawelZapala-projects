package CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        var startPoint = System.currentTimeMillis();
        LinkedList<Integer> list = new LinkedList<>();
        int n = 100000;
        for(int i=0; i<n; i++){
            list.add(0, 10);
        }
        var endPoint = System.currentTimeMillis();
        System.out.println(endPoint-startPoint);
    }
}
