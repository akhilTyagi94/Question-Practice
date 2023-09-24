public class MinHeap {

    int[] minHeap;

    int heapSize;

    int realSize = 0;

    public MinHeap(int heapSize) {
        this.heapSize = heapSize;
        minHeap = new int[heapSize + 1];
        minHeap[0] = 0;
    }

    public void add(int element) {
        realSize++;
        if(realSize>heapSize) {
            System.out.println("Added too many elements!");
            realSize--;
            return;
        }

        minHeap[realSize] = element;

        int index = realSize;

        int parent = index/2;

        while(minHeap[index] < minHeap[parent] && index>1) {
            int temp = minHeap[index];
            minHeap[index] = minHeap[parent];
            minHeap[parent] = temp;
            index = parent;
            parent = index/2;
        }
    }

    public int peek() {
        return minHeap[1];
    }

    public int size() {
        return realSize;
    }

    public int pop() {
        if(realSize < 1) {
            System.out.println("Don't have any element!");
            return Integer.MAX_VALUE;
        } else {
            int removeElement = minHeap[1];

            minHeap[1] = minHeap[realSize];
            realSize--;
            int index = 1;

            while(index <= realSize/2) {
                int left = index*2;
                int right = (index*2)+1;

                if(minHeap[index] > minHeap[left] || minHeap[index] > minHeap[right]) {
                    if(minHeap[left] < minHeap[right]) {
                        int temp = minHeap[left];
                        minHeap[left] = minHeap[index];
                        minHeap[index] = temp;
                        index = left;
                    } else {
                        int temp = minHeap[right];
                        minHeap[right] = minHeap[index];
                        minHeap[index] = temp;
                        index = right;
                    }
                } else {
                    break;
                }
            }
            return removeElement;
        }
    }

    public String toString() {
        if(realSize == 0) {
            return "No Element!";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for(int i=1; i<=realSize; i++) {
                sb.append(minHeap[i]);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(']');
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(5);
        minHeap.add(2);
        minHeap.add(6);
        minHeap.add(8);
        minHeap.add(4);
        minHeap.add(7);

        System.out.println(minHeap.toString());

        System.out.println(minHeap.peek());

        System.out.println(minHeap.pop());

        System.out.println(minHeap.toString());

        minHeap.add(1);
        minHeap.add(5);

        System.out.println(minHeap.toString());
    }

}
