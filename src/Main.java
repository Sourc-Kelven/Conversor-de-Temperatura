public class Main {
    public static void main(String[] args) {
        Temperatura converter = new Temperatura("celsius", 30.0);
        Temperatura convertido = new Temperatura("kelvin", 0.00);
        Temperatura resultado = new Temperatura(null, 0.00);

        ConversorTemperatura convertendo = new ConversorTemperatura();

        resultado = convertendo.Conversor(converter, convertido);

        ImprimirTemp.imprimirTemp(resultado);
    }
}