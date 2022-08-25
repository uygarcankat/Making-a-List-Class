import java.lang.reflect.Array;
import java.util.Arrays;

public class  MyList<T> {

    private T [] array;


    public  MyList(int capacity) {


        this.array = (T[]) new Object[capacity];

    }

    public  MyList(){




        this.array = (T[]) new Object [10];

    }


    public void add(T data) {

        if(this.array[this.array.length-1]!=null){

            int new_length=this.array.length*2;

            this.array=Arrays.copyOf(this.array,new_length);

        }


        for(int i=0;i<this.array.length ;i++){

            if(array[i]==null ){

            array[i]=data;
            break;

            }
        }



    }
    public int size(){

        for(int i=0;i<this.array.length;i++){

            if(this.array[i]==null){

               return i;

            }

        }

        return array.length;

    }


    public T get(int index){

        if(index>=array.length || index<0){

            return null;
        }

            return this.array[index];

    }

    public void remove(int index){

        for(int i= index;i<this.array.length;i++){

            this.array[index]=this.array[index+1];

        }

        this.array[this.array.length-1]=null;


    }

    public T set(int index, T data){


        if(index >= this.array.length || index<0){

            return null;
        }

        array[index]= data;

        return array[index];


    }


    public int getCapacity(){

        int capacity= this.array.length;

        return capacity;

    }

    public T[] getArray() {
        return array;
    }

    public String toString(){


        T[] new_arrays;

        int x=0;
        for(int i=0;i< this.array.length;i++){
            if(this.array[i]==null){

                x=i;
                break;

            }
        }

        new_arrays= Arrays.copyOfRange(this.array,0,x);



        return Arrays.toString(new_arrays); // emin değilim başka kullanımı olabilir

    }


    public int indexOf(T data){

        for(int i=0;i<this.array.length;i++){

            if(this.array[i]==data){

                return i;

            }

        }

        return -1;

    }

    public int lastIndexOf(T data){

        int max=0;
        for(int i=0;i<this.array.length;i++){

            if(array[i]==data){
                if(max<i){

                   max=i;

                }

            }

        }

        return max;

    }

    public boolean isEmpty(){

        for(T i : this.array) {
            if (i != null) {
                return false;
            }
        }

        return true;

    }

    public T[] toArray() {


        return this.array;

    }

    public void clear(){

     /*   for(T i : this.array) {

            i=null;

        }*/


        for(int i=0;i<this.array.length;i++){

            this.array[i]=null;

        }

    }


    public MyList<T> subList(int start,int finish){



        MyList<T> newList = new MyList<>(finish - start);

        for(int i = start; i <= finish; i++) {

            newList.add(this.array[i]);


        }


        return newList;
    }


    public boolean contains(T data){


        for(T i : this.array){
            if(i==data){
                return true;
            }

        }

        return false;

    }

}
