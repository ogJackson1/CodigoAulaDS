public class ConversaodeTipos {
    public static void main(String[] args){

        String s1 = "10";// declara uma variavel do tipo String chamada s1 e inicia com valor 10

        int v = Integer.parseInt(s1); // converte a String s1 para um numero inteiro  e armazena o resultado na variavel v

        float x = Float.parseFloat(s1); // converte a String s1 para um de ponto float e armazena o resultado na variavel x

        double y = Double.parseDouble(s1); // converte a String s1 para um de ponto float de double e armazena o resultado na variavel y

        int w = (int) x; //converte o valor  de ponto float x para um inteiro e armazena o resultado na variavel w

        int z = (int) y;//converte o valor  de ponto flutuante x para um inteiro e armazena o resultado na variavel z

        String s2 = String.valueOf(v);

        System.out.println(s2 + w + z);


    }
}
