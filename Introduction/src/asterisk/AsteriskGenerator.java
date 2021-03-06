package asterisk;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

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

    public String generateVertical(int repetitions) {
        String asterisks = "";
        for (int i = 0; i < repetitions; i++) {
            asterisks = asterisks.concat("*\n");
        }
        asterisks = asterisks.trim();
        return asterisks;
    }

    public String generateRightTriangle(int levels) {
        String triangle = "";
        for (int i = 1; i <= levels; i++) {
            triangle = triangle.concat(generateHorizontal(i) + "\n");
        }
        triangle = triangle.trim();
        return triangle;
    }

    public String generatePyramid(int levels) {
        List<String> pyramidLines = generatePyramidLines(levels);
        String pyramid = String.join("\n", pyramidLines);
        return pyramid;
    }

    public String generatePyramid(int levels, int type){
        List<String> pyramidLines = generatePyramidLines(levels);
        Collections.reverse(pyramidLines);
        String pyramid = String.join("\n", pyramidLines);
        return pyramid;
    }

    private List<String> generatePyramidLines(int levels) {
        List<String> pyramidLines = new LinkedList<>();
        for (int i = 1; i <= levels; i++) {
            pyramidLines.add(generateWhiteSpaces(levels-i) + generateHorizontal(2*i - 1));
        }
        return pyramidLines;
    }

    private String generateWhiteSpaces(int repetitions) {
        String whiteSpaces = "";
        for (int i = 0; i < repetitions; i++) {
            whiteSpaces += " ";
        }
        return whiteSpaces;
    }

    public String generateDiamond(int levels) {
        List<String> diamondLines = generateDiamondLines(levels);
        if (levels > 0){
            diamondLines.add(levels-1, generateHorizontal(2*levels-1));
        }

        String diamond = String.join("\n", diamondLines);
        return diamond;
    }

    private List<String> generateDiamondLines(int levels){
        List<String> diamondLines = new LinkedList<>();
        List<String> upsidePyramid = generatePyramidLines(levels);
        if (upsidePyramid.size() > 0) {
            upsidePyramid.remove(upsidePyramid.size() - 1);
        }
        List<String> bottomPyramid = new LinkedList<>(upsidePyramid);
        Collections.reverse(bottomPyramid);

        diamondLines.addAll(upsidePyramid);
        diamondLines.addAll(bottomPyramid);
        return diamondLines;
    }

    public String generateDiamond(int levels, String name) {
        List<String> diamondLines = generateDiamondLines(levels);
        if (levels > 0){
            diamondLines.add(levels-1, name);
        }

        String diamond = String.join("\n", diamondLines);
        return diamond;
    }
}
