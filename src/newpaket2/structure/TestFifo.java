package newpaket2.structure;

public class TestFifo {
    public static void main(String[] arg) {
        Fifo queue = new Fifo();
        for(int i=0; i<10; i++) {
            queue.enqueue("Строка:" + i);
        }

        while(queue.size() > 0) {
            String s = (String)queue.dequeue();
            System.out.println(s);
            System.out.println("Размер очереди:" + queue.size());
        }

        queue.enqueue("Объект1");
        queue.enqueue("Объект2");
        queue.enqueue("Объект3");
        queue.enqueue("Объект4");
        queue.enqueue("Объект5");
        queue.enqueue("Объект6");
        queue.enqueue("Объект7");

        System.out.println(queue.size());

        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.size());

        while(queue.size() > 0) {
            String s = (String)queue.dequeue();
            System.out.println(s);
            System.out.println("Размер очереди:" + queue.size());
        }

    }
}
