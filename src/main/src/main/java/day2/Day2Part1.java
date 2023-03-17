package day2;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Day2Part1 {

    public static void main(String[] args) throws URISyntaxException, IOException {
        Path path = Paths.get(Day2Part1.class.getClassLoader().getResource("puzzle2").toURI());
        List<String> lines = Files.readAllLines(path);

        int totalWrappingPaper = 0;

        for (String line : lines) {
            int[] dimensions = new int[]{Integer.valueOf(line.split("x")[0]), Integer.valueOf(line.split("x")[1]), Integer.valueOf(line.split("x")[2])};
            // Calcul de la surface de la boîte en pieds carrés
            int surfaceArea = 2 * (dimensions[0] * dimensions[1] + dimensions[1] * dimensions[2] + dimensions[2] * dimensions[0]);
            // Calcul de la surface du plus petit côté en pieds carrés
            int smallestSideArea = Math.min(Math.min(dimensions[0] * dimensions[1], dimensions[1] * dimensions[2]), dimensions[2] * dimensions[0]);
            // Ajout de la surface totale nécessaire pour ce cadeau
            totalWrappingPaper += surfaceArea + smallestSideArea;
        }
        System.out.println("Les elfes doivent commander " + totalWrappingPaper + " metres carrés de papier d'emballage.");
    }
}
