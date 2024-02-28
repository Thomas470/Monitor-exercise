package com.company;

import java.util.Random;

public class ProdutorMaca extends Thread {
    private String Nome;
    private BufferLimitado buffer;
    private Random aleatorio;
    int max;

    public ProdutorMaca(String Nome, BufferLimitado buffer, int max)
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
                int Maca = aleatorio.nextInt(10, max);
                
                System.out.println(Nome + ":" + " " + "Depositou" + " " + buffer.inserir(Maca) + " " + "Maçãs");
                int tempo = aleatorio.nextInt(5000);
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
