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
        List<String> filtered = filterStrings(strings, s -> s.startsWith("A"));
        System.out.println(filtered);
    }
}
