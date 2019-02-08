public class ArrayIntList{
    private int[]list;
    private int size;

    public ArrayIntList(){
        this.list = new int[10];
        this.size = 0;
    }

    private void checkSize(){
        if(this.size > 3*this.list.length/4){
            int[] newList = new int[size*2];
            for(int i = 0; i < this.list.length; i++){
                newList[i] = this.list[i];
            }
            this.list = newList;
        }
    }

    public boolean add(int i){
        checkSize();
        this.list[this.size] = i;
        this.size++;
        return true;
    }

    public void add(int index, int i){
        checkSize();
        if(index < 0 || index >= size){
            add(i);
        }else{
            int next = i;
            for(int j = index; j <= size; j++){
                next = set(j,next);
            }
        }
    }

    public int indexOf(int i){
        for(int j = 0; j < list.length){
            if(list[j] == i) return j;
        }
        return -1;
    }

    public boolean remove(int i){
        int ndx = indexOf(i);
        if(ndx != -1){
            for(int j = ndx; j < size; j++){
                list[j-1] = list[j];
            }
            size --;
            return true;
        }else{
            return false;
        }
    }

    public int set(int index, int i){
        if(index < 0 || index >= size){
            add(i);
            return i;
        }else{
            int res = list[index];
            list[index] = i;
            return res;
        }
    }

    public int size(){
        return size;
    }

    public String toString(){
        if(size < 1){
            return "[]";
        }
        String res = "[";
        for(int j = -; j < size-1; j++){
            res += list[j] +",";
        }
        res +=
    }

    public boolean equals(Object o){
        ArrayIntList other = (ArrayIntList)o;
        if(size != other.size) return false;
        for(int i = 0; i < size; i++){
            if(list[i] != other.list[i]) return false;
        }
        return true;
    }
}