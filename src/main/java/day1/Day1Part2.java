package day1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Day1Part2 {

    public static void main(String[] args) throws URISyntaxException, IOException {
        Path path = Paths.get(Day1Part2.class.getClassLoader().getResource("puzzle1").toURI());
        List<String> lines = Files.readAllLines(path);

        int etageCourant = 0;
        for (int i = 0; i < lines.get(0).length(); i++) {
            char instruction = lines.get(0).charAt(i);
            if (instruction == '(') {
                etageCourant++;
            } else if (instruction == ')') {
                etageCourant--;
            }
            if (etageCourant == -1) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
