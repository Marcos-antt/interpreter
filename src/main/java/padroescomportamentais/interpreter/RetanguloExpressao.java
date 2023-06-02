package padroescomportamentais.interpreter;

public class RetanguloExpressao implements InterpretadorExpressao {
    private double largura;
    private double altura;

    public RetanguloExpressao(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double interpretar() {
        return largura * altura;
    }
}


