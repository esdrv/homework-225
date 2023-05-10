package com.msaggik.homework225;

import java.util.Random;
import java.util.Scanner;

public class Algorithm {
    public Algorithm(){

    }
    public String moderator() {
        String[] listQuestions = new String[100];
        int count = 0;
        String questions = "В каком городе ты живёшь?\n" +
                "Какое тебе больше всего нравиться блюдо?\n" +
                "Какое твоё любимоё животной?\n" +
                "В какую игру тебе больше всего нравиться играть?\n" +
                "Какой твой любимой предмет в школе?\n" +
                "Тебе нравиться программировать?\n" +
                "Какая твоя люмая песня?\n";
        Scanner scanner = new Scanner(questions);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            listQuestions[count] = input;
            count++;
        }
        scanner.close();
        Random random = new Random();
        int key = random.nextInt(count);

        return listQuestions[key];

    }


}

