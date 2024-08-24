public class LinearQueue {

    static class Queue {
        static int size;
        static int arr[];
        static int rear = -1;

        // Constructor to create Queue
        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        // Method to check whether the Queue is empty or not
        public boolean isEmpty() {
            return rear == -1;
        }

        // ENQUEUE
        public void enqueue(int data) {
            if (rear == (size - 1))
                System. out.println("Queue is Full");
            else {
                rear++;
                arr[rear] = data;
            }
        }

        // DEQUEUE
        public int dequeue() {
            if (isEmpty()) {
                System. out.println("Queue is already Empty");
                return -1;
            } else {
                int front = arr[0];
              
                // SHIFTING AFTER DELETE FRONT
                for (int i = 0; i < rear; i++) {
                    arr[i] = arr[i + 1];
                }
                rear--;
                return front;

            }
        }

        // Method to return peek element
        public int peek() {
            if (isEmpty()) {
                System. out.println("Queue is empty");
                return -1;
            } else {
                return arr[0];

            }

        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(34);
        q.enqueue(45);
        q.enqueue(23);
        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }

    }
}
