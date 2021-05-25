import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task1 {
    public static List<String> filterStrings(List<String> strings, Predicate<String> predicate) {
        return strings.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "As the asteroid hurtled toward earth, Becky was upset her dentist appointment had been canceled.",
                "Malls are great places to shop; I can find everything I need under one roof.",
                "The blue parrot drove by the hitchhiking mongoose.",
                "It was a really good Monday for being a Saturday.",
                "The sudden rainstorm washed crocodiles into the ocean."
        );

        // Filtrar a lista, e obter apenas as string que começam por 'A'
        System.out.println(filterStrings(strings, s -> s.startsWith("A")));
        System.out.println(filterStrings(strings, string -> string.length() > 10));
        System.out.println(filterStrings(strings, string -> string.split(" ").length > 8));

        //- i) Strings com todas as palavras com 3 ou mais letras;
        // Lista de frases, cuja lista de palavras com tamanho menor que 3 letras é vazia.
        System.out.println(
                filterStrings(strings,
                        s -> filterStrings(Arrays.asList(s.split(" ")),w -> w.length() < 3).isEmpty()));

        // Lista de frases, cuja lista de palavras com tamanho maior ou igual a 3 é igual é lista total de palavras da frase.
        System.out.println(
                filterStrings(strings,
                        s -> filterStrings(Arrays.asList(s.split(" ")),w -> w.length() >= 3).size() == s.split(" ").length));

        //- ii) *Strings* com um número par de letras `w` minúsculas.
        // (s.length() - s.replace("w","").length()) = número de 'w' na string.
        System.out.println(filterStrings(strings,
                s -> (s.length() - s.replace("w","").length()) != 0 &&
                        (s.length() - s.replace("w","").length()) % 2 == 0));
    }
}
