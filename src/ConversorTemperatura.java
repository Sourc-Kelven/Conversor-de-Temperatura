public class ConversorTemperatura {


    public Temperatura Conversor(Temperatura atual, Temperatura convertida) {

        if (atual.unidadeTemp == "celsius" && convertida.unidadeTemp == "fahrenheit") {
            convertida.valor = atual.valor * 1.8 + 30;
            return convertida;
        }

        if (atual.unidadeTemp == "celsius" && convertida.unidadeTemp == "kelvin") {
            convertida.valor = atual.valor + 273;
            return convertida;
        }

        if (atual.unidadeTemp == "fahrenheit" && convertida.unidadeTemp == "celsius") {
            convertida.valor = (atual.valor -32) / 1.8;
            return convertida;
        }

        if (atual.unidadeTemp == "fahrenheit" && convertida.unidadeTemp == "kelvin") {
            convertida.valor = ((atual.valor - 32) / 1.8) + 273.15;
            return convertida;
        }

        if (atual.unidadeTemp == "kelvin" && convertida.unidadeTemp == "celsius") {
            convertida.valor = atual.valor - 273;
            return convertida;
        }

        if (atual.unidadeTemp == "kelvin" && convertida.unidadeTemp == "fahrenheit") {
            convertida.valor = ((atual.valor - 273.15) * 1.8) + 32;
            return convertida;
        }
        else {
            throw new RuntimeException();
        }
    }
}

