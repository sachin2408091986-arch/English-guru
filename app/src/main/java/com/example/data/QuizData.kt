package com.example.data

object QuizData {
    val allQuestions: List<QuizQuestion> = listOf(
        // --- ધોરણ 1–3 ---
        QuizQuestion(
            id = "q_water",
            level = LessonLevel.STD_1_3,
            question = "'પાણી' નો અંગ્રેજી શબ્દ કયો છે?",
            options = listOf("Food", "Water", "Book", "House"),
            answer = "Water",
            meaning = "પાણી = Water"
        ),
        QuizQuestion(
            id = "q_thank_you",
            level = LessonLevel.STD_1_3,
            question = "'આભાર' માટે કયો શબ્દ વપરાય છે?",
            options = listOf("Sorry", "Hello", "Thank you", "Good night"),
            answer = "Thank you",
            meaning = "આભાર = Thank you"
        ),
        QuizQuestion(
            id = "q_house",
            level = LessonLevel.STD_1_3,
            question = "'ઘર' નો અંગ્રેજી શબ્દ કયો છે?",
            options = listOf("School", "House", "Friend", "Today"),
            answer = "House",
            meaning = "ઘર = House"
        ),
        QuizQuestion(
            id = "q_sunday",
            level = LessonLevel.STD_1_3,
            question = "'રવિવાર' ને અંગ્રેજીમાં શું કહેવાય?",
            options = listOf("Saturday", "Monday", "Sunday", "Friday"),
            answer = "Sunday",
            meaning = "રવિવાર = Sunday"
        ),
        QuizQuestion(
            id = "q_vowels",
            level = LessonLevel.STD_1_3,
            question = "અંગ્રેજીમાં કુલ કેટલા સ્વર (Vowels) છે?",
            options = listOf("3", "5", "7", "21"),
            answer = "5",
            meaning = "A, E, I, O, U એમ કુલ 5 સ્વર છે."
        ),
        QuizQuestion(
            id = "q_book",
            level = LessonLevel.STD_1_3,
            question = "'પુસ્તક' માટે કયો અંગ્રેજી શબ્દ સાચો છે?",
            options = listOf("Book", "School", "Morning", "Water"),
            answer = "Book",
            meaning = "પુસ્તક = Book"
        ),

        // --- ધોરણ 4–6 ---
        QuizQuestion(
            id = "q_how_are_you",
            level = LessonLevel.STD_4_6,
            question = "'તમે કેમ છો?' નું અંગ્રેજી શું થાય?",
            options = listOf("How are you?", "Who are you?", "Good night", "I am fine"),
            answer = "How are you?",
            meaning = "તમે કેમ છો? = How are you?"
        ),
        QuizQuestion(
            id = "q_article_honest",
            level = LessonLevel.STD_4_6,
            question = "ખાલી જગ્યા પૂરો: Ravi is ___ honest boy.",
            options = listOf("a", "an", "the", "many"),
            answer = "an",
            meaning = "'honest' નો ઉચ્ચાર 'ઓ' (સ્વર) થી થતો હોવાથી 'an' વપરાય છે."
        ),
        QuizQuestion(
            id = "q_article_sun",
            level = LessonLevel.STD_4_6,
            question = "ખાલી જગ્યા પૂરો: ___ Sun rises in the east.",
            options = listOf("A", "An", "The", "One"),
            answer = "The",
            meaning = "સૂર્ય અદ્વિતીય હોવાથી 'The Sun' વપરાય છે."
        ),
        QuizQuestion(
            id = "q_plural_child",
            level = LessonLevel.STD_4_6,
            question = "'Child' નું બહુવચન (Plural) શું થાય?",
            options = listOf("Childs", "Childes", "Children", "Childrens"),
            answer = "Children",
            meaning = "Child એકવચન છે અને Children તેનું અનિયમિત બહુવચન છે."
        ),
        QuizQuestion(
            id = "q_preposition_between",
            level = LessonLevel.STD_4_6,
            question = "બે વસ્તુની વચ્ચે સ્થાન દર્શાવવા કયો Preposition વપરાય?",
            options = listOf("under", "between", "behind", "on"),
            answer = "between",
            meaning = "બેની વચ્ચે = between (દા.ત. between Diya and Kavya)."
        ),
        QuizQuestion(
            id = "q_simple_present",
            level = LessonLevel.STD_4_6,
            question = "સાચું વાક્ય પસંદ કરો: She ___ neatly every day.",
            options = listOf("write", "writes", "writing", "wrote"),
            answer = "writes",
            meaning = "સાદા વર્તમાનકાળમાં 'She' સાથે ક્રિયાપદને '-s' લાગે છે."
        ),

        // --- ધોરણ 7–8 ---
        QuizQuestion(
            id = "q_present_perfect",
            level = LessonLevel.STD_7_8,
            question = "ખાલી જગ્યા પૂરો: I have ___ my science project.",
            options = listOf("finish", "finishing", "finished", "finishes"),
            answer = "finished",
            meaning = "પૂર્ણ વર્તમાનકાળમાં have/has સાથે V3 (finished) વપરાય છે."
        ),
        QuizQuestion(
            id = "q_superlative",
            level = LessonLevel.STD_7_8,
            question = "સાચો વિકલ્પ પસંદ કરો: The Narmada is the ___ river in Gujarat.",
            options = listOf("long", "longer", "longest", "more long"),
            answer = "longest",
            meaning = "Superlative Degree માં 'the + -est' (the longest) વપરાય છે."
        ),
        QuizQuestion(
            id = "q_modal_should",
            level = LessonLevel.STD_7_8,
            question = "નૈતિક ફરજ કે સલાહ દર્શાવવા શું વપરાય: We ___ respect our teachers.",
            options = listOf("should", "did", "was", "are"),
            answer = "should",
            meaning = "'Should' સલાહ અથવા નૈતિક ફરજ ('કરવું જોઈએ') દર્શાવે છે."
        ),
        QuizQuestion(
            id = "q_wh_where",
            level = LessonLevel.STD_7_8,
            question = "'તમને આ શબ્દકોશ ક્યાંથી મળ્યો?' માટે કયો Wh-word વપરાય?",
            options = listOf("Why", "When", "Where", "Who"),
            answer = "Where",
            meaning = "સ્થળ પૂછવા માટે 'Where' (ક્યાં) વપરાય છે."
        ),
        QuizQuestion(
            id = "q_passive_voice",
            level = LessonLevel.STD_7_8,
            question = "સાચું Passive Voice પસંદ કરો: The teacher praised the student.",
            options = listOf(
                "The student is praise by the teacher.",
                "The student was praised by the teacher.",
                "The student praised the teacher.",
                "The teacher was praised by student."
            ),
            answer = "The student was praised by the teacher.",
            meaning = "સાદા ભૂતકાળના Passive માં 'was/were + V3 + by' રચના વપરાય છે."
        ),
        QuizQuestion(
            id = "q_good_degree",
            level = LessonLevel.STD_7_8,
            question = "'Good' નું Comparative અને Superlative રૂપ કયું છે?",
            options = listOf(
                "gooder, goodest",
                "more good, most good",
                "better, best",
                "well, best"
            ),
            answer = "better, best",
            meaning = "Good (Positive) -> Better (Comparative) -> Best (Superlative)."
        )
    )
}
