class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio inválido");
        }
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
