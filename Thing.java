public class Thing<T> {

    T thing;

    public void add(T thing){
        this.thing = thing;
    }
    public T show(){
        return this.thing;
    }
}
