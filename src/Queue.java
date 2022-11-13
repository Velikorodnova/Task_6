import java.util.ArrayDeque;
import java.util.Queue;

class queueSupermarket {
    private static Queue<String> queue1 = new ArrayDeque();
    private static Queue<String> queue2 = new ArrayDeque();
    private static Queue<String> queue3 = new ArrayDeque();

    String [] buyer;

    public void QueueSupermarket() {
    }

    public static void addQueueSupermarket(String[] buyers) {

        for (int i = 0; i < buyers.length; i++) {
            if (!queue1.contains(buyers[i])&& !queue2.contains(buyers[i])&& queue1.size()<5) {
                queue1.add(buyers[i]);
                System.out.println(buyers[i]+" в очереди 1");
            } else if (!queue1.contains(buyers[i]) && !queue2.contains(buyers[i]) && queue2.size() < 5) {
                queue2.add(buyers[i]);
                System.out.println(buyers[i]+" в очереди 2");
            } else if (queue2.size()>=5){
                System.out.println("Позовите Галю!");
                while (queue3.size()<5){
                    queue3.add(buyers[i]);
                    System.out.println(buyers[i]+" в очереди 3");
                    i++;
                }
                break;
            }
        }
    }

    public static Queue<String> getQueue1() {
        return queue1;
    }

    public static Queue<String> getQueue2() {
        return queue2;
    }

    public static Queue<String> getQueue3() {
        return queue3;
    }
}