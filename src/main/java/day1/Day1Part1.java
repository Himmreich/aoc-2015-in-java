package day1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Day1Part1 {

    public static void main(String[] args) throws URISyntaxException, IOException {
        Path path = Paths.get(Day1Part1.class.getClassLoader().getResource("puzzle1").toURI());
        List<String> lines = Files.readAllLines(path);

        int floor = 0;
        for (int i = 0; i < lines.get(0).length(); i++) {
            char c = lines.get(0).charAt(i);
            if (c == '(') {
                floor++;
            } else if (c == ')') {
                floor--;
            }
        }
        System.out.println("Le Père Noël est sur l'étage " + floor);
    }
}
