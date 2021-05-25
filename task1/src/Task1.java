import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class StartsWithA implements Predicate<String> {
    @Override
    public boolean test(final String s) {
        return s.startsWith("A");
    }
}

public class Task1 {
    public static List<String> filterStrings(List<String> strings, Predicate<String> predicate) {
        List<String> result = new ArrayList<>();
        for(String s : strings){
            if(predicate.test(s)) {
                result.add(s);
            }
        }
        return result;
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
        Predicate<String> predicate = new StartsWithA();
        List<String> filtered = filterStrings(strings, predicate);
        System.out.println(filtered);
    }
}
