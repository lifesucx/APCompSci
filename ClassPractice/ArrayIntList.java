public class ArrayIntList{
    /*
    *This is the code that Coach Booth had us copy as he wrote
    *It is supposed to create a random array, and then let us add ints to that array
    *We can find indexs and all that jazz
    *Also we can add and set those ints.. whoo!
    */
    private int[]list;
    private int size;

    //You do not always need this. but we used it because we just learned what it is
    public ArrayIntList(){
        this.list = new int[10];
        this.size = 0;
    }

    //You don't want to cause an error by not having enough space
    private void checkSize(){
        if(this.size > this.list.length/4){
            int[] newList = new int[size*2];
            for(int i = 0; i < this.list.length; i++){
                newList[i] = this.list[i];
            }
        }
    }

    public boolean add(int i){
        this.list[this.size] = i;
        this.size++;
        return true;
    }

    public void add(int index, int i){

    }

    public int indexOf(int i){

    }

    public boolean remove(int i){

    }

    public int set(int index, int i){

    }

    public int size(){

    }

    public String toString(){

    }

    public boolean equals(Object o){
        //
    }
}