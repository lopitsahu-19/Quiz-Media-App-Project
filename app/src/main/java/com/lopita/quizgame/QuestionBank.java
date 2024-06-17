package com.lopita.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private static List<QuestionsList> javaQuestions() {
        final List<QuestionsList> questionLists = new ArrayList<>();

        //Create object of QuestionList class and pass a question along with option and answer
        final QuestionsList question1 = new QuestionsList("Which keyword is used to declare a constant in Java?", " final", "const", "static", "volatile", "final", "");
        final QuestionsList question2 = new QuestionsList("Which of the following statements is used to terminate a loop in Java?", "end", "stop", "exit", "break", "break", "");
        final QuestionsList question3 = new QuestionsList("What is the default value of an integer variable in Java?", "0", "1", "null", "depend on the context", "0", "");
        final QuestionsList question4 = new QuestionsList("Which of the following is a primitive data type in Java?", "string", "integer", "float", "boolean", "boolean", "");
        final QuestionsList question5 = new QuestionsList("What is the purpose of the super keyword in Java?", "To call the superclass constructor", "To access the superclass methods and variables", "To call the subclass constructor", "None of the above", "To call the superclass constructor", "");
        final QuestionsList question6 = new QuestionsList("Which keyword is used to prevent method overriding in Java?", "override", "final", "static", "abstract", "final", "");
        //add all questions to list<QuestionList>
        List<QuestionsList> questionsLists = null;
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> pythonQuestions() {
        final List<QuestionsList> questionLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Which of the following is the correct way to create a function in Python?", "def function_name():", "function function_name()", "create function_name():", "function_name = def():", "def function_name():", "");
        final QuestionsList question2 = new QuestionsList("What does the range() function in Python return?", "A list of numbers", "A tuple of numbers", "An iterator of numbers", "A dictionary of numbers", "An iterator of numbers", "");
        final QuestionsList question3 = new QuestionsList("Which of the following statements is used to exit from a loop in Python?", "exit", "break", "continue", "stop", "break", "");
        final QuestionsList question4 = new QuestionsList("Which of the following data types is mutable in Python?", "tuple", "string", "list", "set", "list", "");
        final QuestionsList question5 = new QuestionsList("What does the import keyword do in Python?", " Exports a module", " Imports a module", " Defines a new function", " Declares a class", "Imports a module", "");
        final QuestionsList question6 = new QuestionsList("What does the len() function do in Python?", " Returns the length of a string", "Returns the length of a list", "Returns the length of a dictionary", "All of the above", "All of the above", "");

        List<QuestionsList> questionsLists;
        questionsLists = null;
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> reasoningQuestions() {
        final List<QuestionsList> questionLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("If today is Sunday, what day will it be in 17 days?", "monday", "tuesday", "wednesday", "thursday", "thursday", "");
        final QuestionsList question2 = new QuestionsList("What is the next number in the sequence: 2, 4, 8, 16, ___?", "24", "32", "64", "18", "64", "");
        final QuestionsList question3 = new QuestionsList("If a triangle has angles measuring 45°, 45°, and 90°, what type of triangle is it ?", "equilateral", "isosceles", "scalene", "right", "right", "");
        final QuestionsList question4 = new QuestionsList("If John is taller than Sam, and Sam is taller than Tom, who is the shortest?", "john", "sam", "tom", "ram", "tom", "");
        final QuestionsList question5 = new QuestionsList("What is the missing number in the sequence: 2, 6, 12, ___, 30?", "16", "18", "22", "24", "24", "");
        final QuestionsList question6 = new QuestionsList("If all squares are rectangles, which of the following statements is true?", "All rectangles are squares", "Some rectangles are squares", "All squares are circles", "Some squares are rectangles", "Some squares are rectangles", "");


        List<QuestionsList> questionsLists;
        questionsLists = null;
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> androidQuestions() {
        final List<QuestionsList> questionLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is the primary programming language used for Android app development?", "java", "python", "c++", "swift", "java", "");
        final QuestionsList question2 = new QuestionsList("Which file defines the user interface of an Android application?", ".java file", ".xml file", ".gradle file", ".apk file", ".xml file", "");
        final QuestionsList question3 = new QuestionsList("Which component is responsible for managing the lifecycle of an Android application?", "activity", "intent", "service", "BraodcastReceiver", "activity", "");
        final QuestionsList question4 = new QuestionsList("Which of the following is NOT a valid layout type in Android?", "LinearLayout", "frameLayout", "Table Layout", "Relative Layout", "Table Layout", "");
        final QuestionsList question5 = new QuestionsList("Which component is used to perform background tasks in Android independently of the UI?", "activity", "service", "braodcastReceiver", "intent", "service", "");
        final QuestionsList question6 = new QuestionsList("Which method is called when an activity is first created in Android?", "onCreate()", "onStart()", "onResume()", "onPause", "onCreate", "");


        List<QuestionsList> questionsLists;
        questionsLists = null;
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }
    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "java":
                return javaQuestions();
            case "python":
                return pythonQuestions();
            case  "reasoning":
                return reasoningQuestions();
            case "android":
                return androidQuestions();
        }
        return null;
    }
}