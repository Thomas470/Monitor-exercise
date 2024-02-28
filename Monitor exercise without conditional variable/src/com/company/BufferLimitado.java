package com.company;

public class BufferLimitado {

    private int NumeroProd;
    private int max;

    public BufferLimitado(int max){
        this.max = max;
        NumeroProd = 0;
    }

    public synchronized int inserir(int prod) throws InterruptedException{
        int aux = prod;
        while(prod > 0){
            while(NumeroProd == max ) wait();
            NumeroProd++;
            prod--;
        }
        notifyAll();
        return aux;
    }



    public synchronized int remover(int prod) throws InterruptedException{
        int aux = prod;
        while(prod > 0){
            while(NumeroProd == 0 ) wait();
            NumeroProd--;
            prod--;
        }
        notifyAll();
        return aux;
    }
}

