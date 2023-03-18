package com.kakaos.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Which country does this flag belong to?",
            R.drawable.denmark_flag, "Argentina", "Sweden",
            "Denmark", "Finland", "Poland", 3
        )

        val que2 = Question(
            2, "Which country does this flag belong to?",
            R.drawable.italy_flag, "Ireland", "Italy",
            "Vietnam", "China", "Monaco", 2
        )

        val que3 = Question(
            3, "Which country does this flag belong to?",
            R.drawable.liechtenstein_flag, "Luxembourg", "Lithuania",
            "Estonia", "France", "Liechtenstein", 5
        )

        val que4 = Question(
            4, "Which country does this flag belong to?",
            R.drawable.us_flag, "USA", "Canada",
            "Mexico", "Cuba", "Egypt", 1
        )

        val que5 = Question(
            5, "Which country does this flag belong to?",
            R.drawable.uk_flag, "Luxembourg", "Lithuania",
            "Vatican", "UK", "Bulgaria", 4
        )

        val que6 = Question(
            6, "Which country does this flag belong to?",
            R.drawable.poland_flag, "Latvia", "Romania",
            "Poland", "Belarus", "Switzerland", 3
        )

        val que7 = Question(
            7, "Which country does this flag belong to?",
            R.drawable.monaco_flag, "Portugal", "Lithuania",
            "Estonia", "Germany", "Monaco", 5
        )

        val que8 = Question(
            8, "Which country does this flag belong to?",
            R.drawable.ireland_flag, "Ireland", "Italy",
            "South Africa", "Kenya", "Tanzania", 1
        )

        val que9 = Question(
            9, "Which country does this flag belong to?",
            R.drawable.france_flag, "Greece", "France",
            "Armenia", "South Korea", "North Korea", 2
        )

        val que10 = Question(
            10, "Which country does this flag belong to?",
            R.drawable.finland_flag, "USA", "Germany",
            "Denmark", "Finland", "Sweden", 4
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)
        return questionsList
    }
}