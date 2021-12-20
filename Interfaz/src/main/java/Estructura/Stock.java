package Estructura;

public class Stock {
    private int maxSize;
    private Plantas[] array;
    private int top;
    public Stock(int s){
        maxSize = s;
        array = new Plantas[maxSize];
        top = -1;
    }

    public void push(Plantas j){
        int actual = ++top;
        array[actual] = j;
    }
    public void show(){
        int n=0;
        for(int i=0; i<maxSize;i++){
            if(array[i]==null){
                n++;
            }else{
                System.out.println("indice["+(i)+"]; "+array[i]);
            }
        }
        if(n==maxSize){
            System.out.println("Fila Vacia");
        }
    }
}
