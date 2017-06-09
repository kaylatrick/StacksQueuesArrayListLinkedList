package queue;

public class Queue {
    
    private int[] vals;
    private int startIdx;
    private int stopIdx;
    private int qLen;
    
    public void enqueue(int a) {
        if (this.stopIdx < this.vals.length) {
        	this.qLen++;
        	vals[this.stopIdx] = a;
        	this.stopIdx++;
        } else {
        	int[] tempQ = new int[this.vals.length * 2];
        	for (int i = this.startIdx; i < this.stopIdx; i++) {
        		tempQ[i-this.startIdx] = this.vals[i];
        	}
        	this.vals = tempQ;
        	this.enqueue(a);
        }
        return;
    }
    
    public int dequeue() {
        this.startIdx++;
        return this.vals[this.startIdx-1];
    }
    
    public Queue() {
        this.vals = new int[10];
        this.startIdx = 0;
        this.stopIdx = 0;
    }
    
    public static void main(String[] args) {
        Queue q;
        q = new Queue();
        q.enqueue(3);
        q.enqueue(18);
        System.out.println(q.dequeue());
        q.enqueue(9);
        q.enqueue(10);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }

}