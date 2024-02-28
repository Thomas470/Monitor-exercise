package com.company;

import java.util.Random;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int MaximoBananas = 100;
        int MaximoMaçãs = 100;

        BufferLimitado MonitorBananas = new BufferLimitado(MaximoBananas);
        BufferLimitado MonitorMaçãs = new BufferLimitado(MaximoMaçãs);

        ProdutorBanana pb1 = new ProdutorBanana("Produtor de Bananas 1",MonitorBananas, MaximoBananas);
        ProdutorBanana pb2 = new ProdutorBanana("Produtor de bananas 2",MonitorBananas, MaximoBananas);
        ProdutorBanana pb3 = new ProdutorBanana("Produtor de Bananas 3",MonitorBananas, MaximoBananas);
        ProdutorMaca pm1 = new ProdutorMaca("Produtor de Maçãs 1",MonitorMaçãs, MaximoMaçãs);
        ProdutorMaca pm2 = new ProdutorMaca("Produtor de maçãs 2",MonitorMaçãs, MaximoMaçãs);
        ProdutorMaca pm3 = new ProdutorMaca("Produtor de Maçãs 3",MonitorMaçãs, MaximoMaçãs);
        CompradorBanana cb1 = new CompradorBanana("Comprador de Bananas 1",MonitorBananas, MaximoBananas);
        CompradorBanana cb2 = new CompradorBanana("Comprador de Bananas 2",MonitorBananas, MaximoBananas);
        CompradorBanana cb3 = new CompradorBanana("Comprador de Bananas 3",MonitorBananas, MaximoBananas);
        CompradorMaca cm1 = new CompradorMaca("Comprador de Maçãs 1",MonitorMaçãs, MaximoMaçãs);
        CompradorMaca cm2 = new CompradorMaca("Comprador de Maçãs 2",MonitorMaçãs, MaximoMaçãs);
        CompradorMaca cm3 = new CompradorMaca("Comprador de Maçãs 3",MonitorMaçãs, MaximoMaçãs);

        pb1.start();
        cb1.start();
        pb2.start();
        cb2.start();
        pb3.start();
        cb3.start();

        pm1.start();
        cm1.start();
        pm2.start();
        cm2.start();
        pm3.start();
        cm3.start();
    }

}
