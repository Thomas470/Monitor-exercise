package com.company;

import java.util.Random;

public class CompradorMaca extends Thread {
    private String Nome;
    private BufferLimitado buffer;
    private Random aleatorio;
    int max;

    public CompradorMaca(String Nome, BufferLimitado buffer, int max)
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
                System.out.println(Nome + ":" + " " + "Consumiu" + " " + buffer.remover(aleatorio.nextInt(10, max)) + " " + "Maçãs");
                int tempo = aleatorio.nextInt(5000);
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
