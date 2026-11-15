package com.example.data

object VocabularyData {
    val allWords: List<WordItem> = listOf(
        // School & Study (શાળા અને અભ્યાસ)
        WordItem("School", "શાળા", "સ્કૂલ", WordCategory.SCHOOL),
        WordItem("Book", "પુસ્તક", "બુક", WordCategory.SCHOOL),
        WordItem("Teacher", "શિક્ષક", "ટીચર", WordCategory.SCHOOL),
        WordItem("Student", "વિદ્યાર્થી", "સ્ટુડન્ટ", WordCategory.SCHOOL),
        WordItem("Classroom", "વર્ગખંડ", "ક્લાસરૂમ", WordCategory.SCHOOL),
        WordItem("Homework", "ગૃહકાર્ય", "હોમવર્ક", WordCategory.SCHOOL),
        WordItem("Examination", "પરીક્ષા", "એક્ઝામિનેશન", WordCategory.SCHOOL),
        WordItem("Dictionary", "શબ્દકોશ", "ડિક્શનરી", WordCategory.SCHOOL),
        WordItem("Library", "પુસ્તકાલય", "લાઇબ્રેરી", WordCategory.SCHOOL),
        WordItem("Science", "વિજ્ઞાન", "સાયન્સ", WordCategory.SCHOOL),
        WordItem("Mathematics", "ગણિત", "મેથેમેટિક્સ", WordCategory.SCHOOL),
        WordItem("Knowledge", "જ્ઞાન", "નોલેજ", WordCategory.SCHOOL),
        WordItem("Question", "પ્રશ્ન", "ક્વેશ્ચન", WordCategory.SCHOOL),
        WordItem("Answer", "જવાબ", "આન્સર", WordCategory.SCHOOL),

        // Daily & Family (રોજિંદા અને કુટુંબ)
        WordItem("Water", "પાણી", "વોટર", WordCategory.DAILY),
        WordItem("Food", "ખોરાક", "ફૂડ", WordCategory.DAILY),
        WordItem("House", "ઘર", "હાઉસ", WordCategory.DAILY),
        WordItem("Friend", "મિત્ર", "ફ્રેન્ડ", WordCategory.DAILY),
        WordItem("Family", "કુટુંબ", "ફેમિલી", WordCategory.DAILY),
        WordItem("Parents", "માતા-પિતા", "પેરેન્ટ્સ", WordCategory.DAILY),
        WordItem("Thank you", "આભાર", "થેન્ક યુ", WordCategory.DAILY),
        WordItem("Please", "કૃપા કરીને", "પ્લીઝ", WordCategory.DAILY),
        WordItem("Respect", "આદર / સન્માન", "રિસ્પેક્ટ", WordCategory.DAILY),
        WordItem("Cleanliness", "સ્વચ્છતા", "ક્લીનલિનેસ", WordCategory.DAILY),
        WordItem("Health", "આરોગ્ય", "હેલ્થ", WordCategory.DAILY),
        WordItem("Discipline", "શિસ્ત", "ડિસિપ્લિન", WordCategory.DAILY),

        // Verbs (ક્રિયાપદો)
        WordItem("Read", "વાંચવું", "રીડ", WordCategory.VERBS),
        WordItem("Write", "લખવું", "રાઇટ", WordCategory.VERBS),
        WordItem("Listen", "ધ્યાનથી સાંભળવું", "લિસન", WordCategory.VERBS),
        WordItem("Speak", "બોલવું", "સ્પીક", WordCategory.VERBS),
        WordItem("Learn", "શીખવું", "લર્ન", WordCategory.VERBS),
        WordItem("Understand", "સમજવું", "અન્ડરસ્ટેન્ડ", WordCategory.VERBS),
        WordItem("Practice", "મહાવરો કરવો", "પ્રેક્ટિસ", WordCategory.VERBS),
        WordItem("Remember", "યાદ રાખવું", "રિમેમ્બર", WordCategory.VERBS),
        WordItem("Help", "મદદ કરવી", "હેલ્પ", WordCategory.VERBS),
        WordItem("Participate", "ભાગ લેવો", "પાર્ટિસિપેટ", WordCategory.VERBS),
        WordItem("Celebrate", "ઉજવણી કરવી", "સેલિબ્રેટ", WordCategory.VERBS),
        WordItem("Protect", "રક્ષણ કરવું", "પ્રોટેક્ટ", WordCategory.VERBS),

        // Adjectives (વિશેષણો)
        WordItem("Beautiful", "સુંદર", "બ્યુટીફુલ", WordCategory.ADJECTIVES),
        WordItem("Happy", "ખુશ", "હેપી", WordCategory.ADJECTIVES),
        WordItem("Honest", "પ્રામાણિક", "ઓનેસ્ટ", WordCategory.ADJECTIVES),
        WordItem("Brave", "બહાદુર", "બ્રેવ", WordCategory.ADJECTIVES),
        WordItem("Clever", "હોશિયાર", "ક્લેવર", WordCategory.ADJECTIVES),
        WordItem("Careful", "સાવચેત", "કેરફુલ", WordCategory.ADJECTIVES),
        WordItem("Important", "મહત્વપૂર્ણ", "ઇમ્પોર્ટન્ટ", WordCategory.ADJECTIVES),
        WordItem("Necessary", "જરૂરી", "નેસેસરી", WordCategory.ADJECTIVES),
        WordItem("Difficult", "અઘરું", "ડિફિકલ્ટ", WordCategory.ADJECTIVES),
        WordItem("Easy", "સરળ", "ઇઝી", WordCategory.ADJECTIVES),

        // Time & Nature (સમય અને પ્રકૃતિ)
        WordItem("Morning", "સવાર", "મોર્નિંગ", WordCategory.NATURE),
        WordItem("Today", "આજે", "ટુડે", WordCategory.NATURE),
        WordItem("Tomorrow", "આવતીકાલે", "ટુમોરો", WordCategory.NATURE),
        WordItem("Yesterday", "ગઈકાલે", "યેસ્ટરડે", WordCategory.NATURE),
        WordItem("Time", "સમય", "ટાઇમ", WordCategory.NATURE),
        WordItem("Environment", "પર્યાવરણ", "એન્વાયરન્મેન્ટ", WordCategory.NATURE),
        WordItem("River", "નદી", "રિવર", WordCategory.NATURE),
        WordItem("Mountain", "પર્વત", "માઉન્ટેન", WordCategory.NATURE),
        WordItem("Monsoon", "ચોમાસું", "મોનસૂન", WordCategory.NATURE),
        WordItem("Planet", "ગ્રહ", "પ્લેનેટ", WordCategory.NATURE)
    )
}
