class CalculadoraDeArea implements VisitanteFormaGeometrica {
    private double areaTotal = 0;

    @Override
    public void visitar(Circulo circulo) {
        double area = Math.PI * Math.pow(circulo.getRaio(), 2);
        areaTotal += area;
    }

    @Override
    public void visitar(Retangulo retangulo) {
        double area = retangulo.getLargura() * retangulo.getAltura();
        areaTotal += area;
    }

    public double getAreaTotal() {
        return areaTotal;
    }
}
