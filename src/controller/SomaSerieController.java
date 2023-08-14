package controller;

public class SomaSerieController {
    public SomaSerieController() {
        super();
    }

    public double CalcSomaSerie(int num) {
        if (num == 1) { // condição de parada: num é reduzido até chegar em 1 quando retorna um valor conhecido
            return 1;
        } else { // em cada chamada é soma 1 dividido por "num" reduzido em 1
            return (1 / num) + CalcSomaSerie(num -1);
        }
    }
}
