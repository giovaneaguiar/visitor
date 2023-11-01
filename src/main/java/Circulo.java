class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public void aceitar(VisitanteFormaGeometrica visitante) {
        visitante.visitar(this);
    }
}