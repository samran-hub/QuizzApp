package com.example.quizapp;

public class Question {
    public String mQuestions[] ={
      " Pakistan is located in the",
            "K-2 is located Along the border of Pakistan",
            "In urdu Pakiatan name means",
            "National animal of Pakistan",
            "Pakistan eastablished in",
    };

    public String mChoices [][] = {
            {"East Asia", "West Asia", "South Asia", "Central Asia"},
            {"India", "Afghanistan", "Iran", "China"},
            {"Pure Land", "Truthful Land", "Land of the Pure", "Land of truthfulness"},
            {"Tiger", "Lion", "Fish", "Markhor"},
            {"1947", "1948", "1951", "1900"},
    };

    public String mCorrectAnswers [] = { "South Asia", "China", "Land of the Pure", "Markhor", "1947",};

    public String getQuestion (int a){
        String Question = mQuestions[a];
        return Question;
    }

    public String getChoice1 (int a){
        String Choices = mChoices[a][0];
        return Choices;
    }

    public String getChoice2 (int a){
        String Choices = mChoices[a][1];
        return Choices;
    }

    public String getChoice3 (int a){
        String Choices = mChoices[a][2];
        return Choices;
    }

    public String getChoice4 (int a){
        String Choices = mChoices[a][3];
        return Choices;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
