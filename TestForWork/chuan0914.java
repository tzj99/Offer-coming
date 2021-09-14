package Help;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class chuan0914 {
    public int[] divide(int[] bottle) {
        int[] res = new int[2];
        PriorityQueue<Integer> pqBottle = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int len = bottle.length;
        for (int i = 0; i < len; i++) {
            pqBottle.add(bottle[i]);
        }
//        System.out.println(pqBottle.toString());
        int A = pqBottle.poll();
        int B = pqBottle.poll();
        System.out.print(A+" "+B+" ");
        int cnt = 0;
        while (!pqBottle.isEmpty()) {
            int peek = pqBottle.poll();
            System.out.print(peek+" ");
            if (cnt == 0) {
                if (A > B) {
                    B += peek;
                    cnt--;
                } else {
                    A += peek;
                    cnt++;
                }
            } else if (cnt == -1) {
                A += peek;
                cnt++;
            } else {
                B += peek;
                cnt--;
            }
        }
        res[0] = A;
        res[1] = B;
        System.out.println();
        return res;
//        PriorityQueue<Integer> As = new PriorityQueue<>();
//        PriorityQueue<Integer> Bs = new PriorityQueue<>();
//        int A = 0, B = 0;
//        for (int i = 0; i < bottle.length; i++) {
//            if (As.size() == Bs.size()) {
//                if (A > B) {
//                    As.
//                } else {
//
//                }
//            }
//        }
    }

    public static void main(String[] args) {
        int[] bottle = {447, 156, 249,100};
        System.out.println(Arrays.toString(new chuan0914().divide(bottle)));
    }
}
