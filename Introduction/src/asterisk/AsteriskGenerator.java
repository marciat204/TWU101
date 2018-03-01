package asterisk;

public class AsteriskGenerator {

    public String generate() {
        return "*";
    }

    public String generateHorizontal(int repetitions) {
        String asterisks = "";
        for (int i = 0; i < repetitions; i++) {
            asterisks = asterisks.concat("*");
        }
        return asterisks;
    }
}
