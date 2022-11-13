public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        String[] clients = {"Покупатель1", "Покупатель2", "Покупатель3", "Покупатель4", "Покупатель5",
                "Покупатель6", "Покупатель7", "Покупатель8", "Покупатель9", "Покупатель10", "Покупатель11",
                "Покупатель12", "Покупатель13", "Покупатель14", "Покупатель15", "Покупатель16", "Покупатель17",
                "Покупатель18", "Покупатель19", "Покупатель20", "Покупатель21",};

        queueSupermarket.getQueue1().add(clients[2]);
        queueSupermarket.getQueue1().add(clients[4]);
        queueSupermarket.getQueue1().add(clients[6]);

        queueSupermarket.getQueue1().add(clients[12]);
        queueSupermarket.getQueue1().add(clients[3]);


        queueSupermarket.addQueueSupermarket(clients);

        System.out.println(queueSupermarket.getQueue1().toString());
        System.out.println(queueSupermarket.getQueue2().toString());
        System.out.println(queueSupermarket.getQueue3().toString());

        ChessBoard chessBoard = new ChessBoard();

    }




}

//        Queue<String> one = new ArrayDeque<>(6);
//        Queue<String> two = new ArrayDeque<>(6);
//        checkQueue();
//
////        ArrayDeque<String> queue;
////        for(int i = 0; i<10; i++) {
////            queue.push("Строка:" + i);
////        }
////
////        while(queue.size() > 0) {
////            // Мы делаем жесткое приведение типа, т.к. знаем, что там лежат строки
////            String s = (String)queue.pull();
////            System.out.println(s);
////            System.out.println("Размер очереди:" + queue.size());
//
//        one.add("Иван");
//        one.add("Мария");
//        one.add("Олег");
//        one.add("Владимир");
//        one.add("Маргарита");
//        two.add("Дарья");
//        two.add("Людмила");
//        two.add("Алексей");
//        two.add("Михаил");
//        two.add("Светлана");
//
//    }
//
//
//    public static String checkQueue() {
//        String queue = null;
//        if (queue.length() > 5) {
//            System.out.println("Позовите Галю");
//        } else {
//            System.out.println("Очередь свободна");
//        }
//        return ;
//    }
//}
//
//
////        int[] a = {35, 7, 8, 73, 12, 5, 56, 3};
////        System.out.println(Arrays.toString(getNumbers(a)));
////    }
////
////    public static int[] getNumbers(int[] numbers) {
////        int[] resultNumbers = {numbers[2], numbers[3], numbers[4], numbers[5], numbers[6]};
////        for (int i = 0; i < resultNumbers.length; i++) {
////            if (resultNumbers[i] % 2 == 0) {
////                resultNumbers[i] = resultNumbers[i] + 1;
////            }
////        }
////        return resultNumbers;
////    }
////}

