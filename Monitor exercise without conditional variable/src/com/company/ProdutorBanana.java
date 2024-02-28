package com.company;

import java.util.Random;


public class ProdutorBanana extends Thread {
    private String Nome;
    private BufferLimitado buffer;
    private Random aleatorio;
    int max;

    public ProdutorBanana(String Nome, BufferLimitado buffer, int max)
    {
        this.Nome = Nome;
        this.buffer = buffer;
        aleatorio = new Random();
        this.max = max;
    }

    public void run()
    {
        while (true)
        {
            try {
                int Banana = aleatorio.nextInt(10, max);
                System.out.println(Nome + ":" + " " + "Depositou" + " " + buffer.inserir(Banana) + " " + "Bananas");
                int tempo = aleatorio.nextInt(5000);
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

