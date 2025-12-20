package quiz;
/*
Created by: Dany
Created on 11/01/2023 : 13:48
This is program to
*/

import java.util.ArrayList;

public class DATA {
//variables
    private static ArrayList<String> examples = new ArrayList<String>();
    public static ArrayList<String> answers = new ArrayList<String>();

//completes the ArrayList with thr questions I asked and clears the list when round finished
    public static String examples(int number, int count, boolean clear) {
        if (clear) {
            examples.clear();
            answers.clear();
            return null;
        } else {
            examples.add(questions[0][number]);
            answers.add(questions[1][number]);
            return examples.get(count);
        }
    }

//data
    private static String questions[][] = {
        {
            "What is the capital of France?",
            "What is the square root of 144?",
            "What is the first element in an array in Java?",
            "What is the keyword used to create a class in Java?",
            "What is the largest planet in our solar system?",
            "What is the chemical symbol for gold?",
            "Who wrote the novel \"Pride and Prejudice\"?",
            "What year was the USA's Declaration of Independence signed?",
            "What is the sum of 2 + 2?",
            "What is the full form of RAM?",
            "Who wrote the novel \"To Kill a Mockingbird\"?",
            "Who is the current president of the United States?",
            "Who painted the famous artwork \"The Mona Lisa\"?",
            "Who won the 2020 Olympic gold medal in the men's 100m sprint?",
            "What is the capital of Australia?",
            "Who composed the opera \"The Barber of Seville\"?",
            "Who is the CEO of Google?"
        }, {
            "Paris",
            "12",
            "0",
            "class",
            "Jupiter",
            "Au",
            "Jane Austen",
            "1776",
            "4",
            "Random Access Memory",
            "Harper Lee",
            "Joe Biden",
            "Leonardo da Vinci",
            "Justin Gatlin",
            "Canberra",
            "Gioachino Rossini",
            "Sundar Pichai"
        }
    };
}
