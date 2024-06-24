public class Classificacao {
    
    public static String determinarClassificacao(String sexo, int idade) {
        if (sexo.equals("masculino") && idade >= 65) {
            return "APOSENTADO";
        } else if (sexo.equals("feminino") && idade >= 60) {
            return "APOSENTADA";
        } else if (idade >= 13 && idade <= 18) {
            return "ADOLESCENTE";
        } else if (idade < 13) {
            return "CRIANÇA";
        } else {
            return "ADULTO";
        }
    }

    public static void main(String[] args) {
        String[][] testes = {
            {"masculino", "74"},
            {"feminino", "4"},
            {"feminino", "13"},
            {"masculino", "60"},
            {"masculino", "19"},
            {"feminino", "60"}
        };

        for (String[] teste : testes) {
            String sexo = teste[0];
            int idade = Integer.parseInt(teste[1]);
            String resultado = determinarClassificacao(sexo, idade);
            System.out.println("Sexo: " + sexo + ", Idade: " + idade + " -> " + resultado);
        }
    }
}
