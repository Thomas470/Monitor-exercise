package com.company;

import java.util.Random;


public class CompradorBanana extends Thread {
    private String Nome;
    private BufferLimitado buffer;
    private Random aleatorio;
    int max;

    public CompradorBanana(String Nome, BufferLimitado buffer, int max)
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
                System.out.println(Nome + ":" + " " + "Consumiu" + " " + buffer.remover(max) + " " + "Bananas");
                int tempo = aleatorio.nextInt(5000);
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}