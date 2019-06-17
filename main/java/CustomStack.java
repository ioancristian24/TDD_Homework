public class CustomStack {

    private static final int SEGMENT = 6;

    private int[] myStack;

    private int size;

    public CustomStack() {
        myStack = new int[SEGMENT];
        size = 0;
    }

    public boolean isEmpty(){

        return myStack[size] == 0;
    }

    public int getSize() {
        return size;
    }

    public int push(int value) {
        if (myStack.length == size) {
            increaseCapacity();
        }
        myStack[size] = value;
        size++;
        return value;
    }

    private void increaseCapacity() {

        int[] c = new int[myStack.length + SEGMENT];

        for (int i = 0; i < myStack.length; i++) {
            c[i] = myStack[i];
        }

        myStack = c;
    }

    public int get (int index){

        System.out.println("Dimensiunea array-ului este: " + size + "/" + myStack.length);

        for (int i = 0; i < size; i++){
            System.out.print(myStack[i] + " ");
        }
        System.out.println();
        return myStack[index];
    }

    public int peek (){
        return myStack[size - 1];
    }

    public int pop(){
        int value = myStack[size -1];
        myStack[size - 1] = 0;
        size--;
        return value;
    }

}
