import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by maxam0128 on 2017/02/14.
 */
public class Counter {
    public static int count = 0;
    public static ReentrantLock lock = new ReentrantLock();

    public static void add(){
        lock.lock();
        count ++;
        lock.unlock();
//        synchronized (lock){
//            count ++;
//        }
    }
    public static void main(String[] args) throws InterruptedException {
//        for(int i = 0 ;i < 12345;i++){
//            new Thread(new Runnable() {
//                public void run() {
//                    Counter.add();
//                }
//            }).start();
//        }
//        Thread.sleep(2000L);
//        System.out.printf(" Counter.count = "+Counter.count);
        treeMapTest();
    }


    public static void treeMapTest(){
        Map<Long,String> map = new TreeMap<Long, String>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return -1 * o1.compareTo(o2);
            }
        });

        map.put(19L,"111");
        map.put(423L,"111");
        map.put(734L,"111");
        map.put(33L,"111");
        map.put(121L,"111");
        map.put(1345L,"111");
        map.put(87L,"111");
        map.put(135L,"111");
        System.out.println(map.toString());

    }

}
