package padroescomportamentais.interpreter;

public class CirculoExpressao implements InterpretadorExpressao{
    private double raio;

    public CirculoExpressao(double raio) {
        this.raio = raio;
    }

    @Override
    public double interpretar() {
        return Math.PI * raio * raio;
    }
}

