package model;

public class Counter implements AutoCloseable {
    private int count;
    private boolean close;


    public Counter() {
        count = 0;
        close =false;
    }

    public int getCount() {
        return count;
    }


    public void add(){
        if(close){
            throw new RuntimeException();
        }
        count ++;

    }

    @Override
    public void close() throws Exception {
        close = true;
        count = 0;
    }
}
