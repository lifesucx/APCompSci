public class ArrayIntList{
    private int[]list;
    private int size;

    public ArrayIntList(){
        this.list = new int[10];
        this.size = 0;
    }

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