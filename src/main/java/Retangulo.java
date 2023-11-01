class Retangulo implements FormaGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public void aceitar(VisitanteFormaGeometrica visitante) {
        visitante.visitar(this);
    }
}