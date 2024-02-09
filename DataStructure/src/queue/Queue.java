package queue;

public class Queue {

	private int front = -1;

	private int rear = -1;

	private int size;

	private int[] queue;

	/**
	 * create a queue
	 * @param size
	 */
	public Queue(int size) {
		this.size = size;
		this.queue = new int[size];
	}

	/**
	 * check if queue is empty
	 * @return true or fasle
	 */
	public boolean isEmpty() {
		return front == rear;
	}

	/**
	 * check if queue is full
	 * @return true or fasle
	 */
	public boolean isFull() {
		if (front != -1) {
			for (int i = front + 1; i <= rear; i++) {
				queue[i - (front + 1)] = queue[i];
			}
			rear = rear - (front + 1);
			front = -1;
		}
		return rear == (size - 1);
	}
	
	/**
	 *  deQueue element from queue
	 * @return element  which has deQueue
	 * @throws Exception 
	 */
	public int deQueue() throws Exception{
		if (isEmpty()) {
			throw new Exception("queue has no element!");
		}
		front = front + 1;
		return queue[front];
	}
	
	/**
	 * enqueue element into queue
	 * @param item
	 * @return 
	 */
	public boolean enQueue(int item) {

		/*
		 * when front is not -1 mean the array which have been dequeue before, 
		 * we need to reposition front to -1 and rear which is by the element length.
		 * To ensure space which be use efficient. But front is not -1 will execute this 
		 * snippet, the time complexity will be O(n).
		 */
		if (front != -1) {
			for (int i = front + 1; i <= rear; i++) {
				queue[i - (front + 1)] = queue[i];
			}
			rear = rear - (front + 1);
			front = -1;
		}
		if (isFull()) {
			return false;
		}
		rear = rear + 1;
		queue[rear] = item;
		return true;

		
	}


}
