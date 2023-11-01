class CalculadoraDeArea implements VisitanteFormaGeometrica {
    private double areaTotal = 0;

    @Override
    public void visitar(Circulo circulo) {
        double raio = circulo.getRaio();

        double area = 3.14159265358979323846 * raio * raio;
        areaTotal += area;
    }

    @Override
    public void visitar(Retangulo retangulo) {
        double largura = retangulo.getLargura();
        double altura = retangulo.getAltura();
        double area = largura * altura;
        areaTotal += area;
    }

    public double getAreaTotal() {
        return areaTotal;
    }
}