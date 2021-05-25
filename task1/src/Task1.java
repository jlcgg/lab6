import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static List<String> filter(List<String> strings){
        List<String> result = new ArrayList<>();
        for(String s : strings){
            if(s.startsWith("A")) {
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
        List<String> filtered = filter(strings);
        System.out.println(filtered);
    }
}
