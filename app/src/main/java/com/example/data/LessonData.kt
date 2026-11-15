package com.example.data

object LessonData {
    val allLessons: List<Lesson> = listOf(
        // --- ધોરણ 1–3: પાયાનું જ્ઞાન ---
        Lesson(
            id = "alphabet",
            title = "સંપૂર્ણ અંગ્રેજી અક્ષરો (A–Z)",
            subtitle = "દરેક અક્ષરનો ધ્વનિ અને ઉદાહરણ શબ્દ",
            level = LessonLevel.STD_1_3,
            grammarNote = "અંગ્રેજીમાં કુલ 26 મૂળાક્ષરો છે: 5 સ્વર (A, E, I, O, U) અને 21 વ્યંજન.",
            examples = listOf(
                LessonExample("A - Apple", "એ - સફરજન", "અ / એ"),
                LessonExample("B - Ball", "બી - દડો", "બ"),
                LessonExample("C - Cat", "સી - બિલાડી", "ક / સ"),
                LessonExample("D - Dog", "ડી - કૂતરો", "ડ"),
                LessonExample("E - Elephant", "ઈ - હાથી", "એ / ઈ"),
                LessonExample("F - Fish", "એફ - માછલી", "ફ"),
                LessonExample("G - Goat", "જી - બકરી", "ગ / જ"),
                LessonExample("H - House", "એચ - ઘર", "હ"),
                LessonExample("I - Ink", "આઈ - શાહી", "ઇ / આઈ"),
                LessonExample("J - Jug", "જે - જગ", "જ"),
                LessonExample("K - Kite", "કે - પતંગ", "ક"),
                LessonExample("L - Lion", "એલ - સિંહ", "લ"),
                LessonExample("M - Mango", "એમ - કેરી", "મ"),
                LessonExample("N - Nest", "એન - માળો", "ન"),
                LessonExample("O - Orange", "ઓ - નારંગી", "ઓ / અ"),
                LessonExample("P - Pen", "પી - પેન", "પ"),
                LessonExample("Q - Queen", "ક્યુ - રાણી", "ક્વ"),
                LessonExample("R - Rabbit", "આર - સસલું", "ર"),
                LessonExample("S - Sun", "એસ - સૂર્ય", "સ"),
                LessonExample("T - Tiger", "ટી - વાઘ", "ટ"),
                LessonExample("U - Umbrella", "યુ - છત્રી", "અ / યુ"),
                LessonExample("V - Van", "વી - વાન", "વ"),
                LessonExample("W - Watch", "ડબલ્યુ - ઘડિયાળ", "વ"),
                LessonExample("X - Xylophone", "એક્સ - વાદ્ય", "ઝ / એક્સ"),
                LessonExample("Y - Yak", "વાય - યાક", "ય"),
                LessonExample("Z - Zebra", "ઝેડ - ઝીબ્રા", "ઝ")
            )
        ),
        Lesson(
            id = "numbers_colors_days",
            title = "સંખ્યા, રંગો અને દિવસો",
            subtitle = "રોજિંદા ગણિત, રંગ અને અઠવાડિયાના નામ",
            level = LessonLevel.STD_1_3,
            grammarNote = "અઠવાડિયાના દિવસો (Monday, Tuesday...) અને મહિનાઓના નામ હંમેશા Capital અક્ષરથી લખાય છે.",
            examples = listOf(
                LessonExample("One, Two, Three, Four, Five", "એક, બે, ત્રણ, چار, પાંચ".replace("چار", "ચાર"), "1 થી 5"),
                LessonExample("Ten, Twenty, Fifty, Hundred", "દસ, વીસ, પચાસ, સો", "દશક અને સો"),
                LessonExample("Red, Blue, Green, Yellow", "લાલ, વાદળી, લીલો, પીળો", "મુખ્ય રંગો"),
                LessonExample("Monday, Tuesday, Wednesday", "સોમવાર, મંગળવાર, બુધવાર", "દિવસો 1–3"),
                LessonExample("Thursday, Friday, Saturday, Sunday", "ગુરુવાર, શુક્રવાર, શનિવાર, રવિવાર", "દિવસો 4–7"),
                LessonExample("January, February, March", "જાન્યુઆરી, ફેબ્રુઆરી, માર્ચ", "મહિનાની શરૂઆત")
            )
        ),
        Lesson(
            id = "greetings",
            title = "અભિવાદન અને પરિચય",
            subtitle = "મળતી વખતે અને પોતાની ઓળખ માટે",
            level = LessonLevel.STD_1_3,
            grammarNote = "સવારે 'Good morning', બપોરે 'Good afternoon' અને સાંજે 'Good evening' બોલાય છે.",
            examples = listOf(
                LessonExample("Hello! Good morning.", "નમસ્તે! સુપ્રભાત.", "સવારનું અભિવાદન"),
                LessonExample("Good afternoon, teacher.", "શુભ બપોર, શિક્ષકજી.", "બપોરનું અભિવાદન"),
                LessonExample("Good night, sweet dreams.", "શુભ રાત્રિ, મીઠા સપના.", "સૂતી વખતે"),
                LessonExample("My name is Aarav.", "મારું નામ આરવ છે.", "પરિચય"),
                LessonExample("I study in Standard 8.", "હું ધોરણ 8 માં ભણું છું.", "ધોરણ જણાવવા"),
                LessonExample("Thank you very much.", "ખૂબ ખૂબ આભાર.", "આભાર માનવા")
            )
        ),
        Lesson(
            id = "school_family",
            title = "શાળા અને કુટુંબના વાક્યો",
            subtitle = "વર્ગખંડ અને ઘરની સામાન્ય વાતચીત",
            level = LessonLevel.STD_1_3,
            grammarNote = "વડીલો અને શિક્ષકો સાથે વાત કરતી વખતે 'Please' અને 'Excuse me' નો ઉપયોગ કરો.",
            examples = listOf(
                LessonExample("This is my school.", "આ મારી શાળા છે.", "નજીકની વસ્તુ માટે This"),
                LessonExample("That is our playground.", "પેલું અમારું રમતનું મેદાન છે.", "દૂરની વસ્તુ માટે That"),
                LessonExample("My father is a farmer.", "મારા પિતા ખેડૂત છે.", "કુટુંબ પરિચય"),
                LessonExample("My mother helps me study.", "મારી માતા મને ભણવામાં મદદ કરે છે.", "કુટુંબ"),
                LessonExample("Open your English textbook.", "તમારું અંગ્રેજી પાઠ્યપુસ્તક ખોલો.", "વર્ગખંડ સૂચના"),
                LessonExample("Keep your classroom clean.", "તમારો વર્ગખંડ સ્વચ્છ રાખો.", "સારી આદત")
            )
        ),

        // --- ધોરણ 4–6: માધ્યમિક પાયો ---
        Lesson(
            id = "daily_sentences",
            title = "વર્ગખંડ અને રોજિંદા વાક્યો",
            subtitle = "પરવાનગી, વિનંતી અને વાતચીત",
            level = LessonLevel.STD_4_6,
            grammarNote = "નમ્ર વિનંતી અથવા પરવાનગી માંગવા માટે 'May I...?' અને 'Could you please...?' ખૂબ ઉપયોગી છે.",
            examples = listOf(
                LessonExample("May I come in, sir?", "શું હું અંદર આવી શકું, સાહેબ?", "પરવાનગી"),
                LessonExample("May I drink water, please?", "કૃપા કરીને હું પાણી પી શકું?", "નમ્ર પરવાનગી"),
                LessonExample("Could you please repeat that?", "શું તમે તે ફરીથી સમજાવી શકશો?", "વર્ગમાં પૂછવા"),
                LessonExample("How are you today?", "આજે તમે કેમ છો?", "ખબર-અંતર"),
                LessonExample("I am fine, thank you.", "હું મજામાં છું, આભાર.", "જવાબ"),
                LessonExample("I have completed my homework.", "મેં મારું ગૃહકાર્ય પૂર્ણ કર્યું છે.", "શાળાનું વાક્ય")
            )
        ),
        Lesson(
            id = "articles_nouns",
            title = "Articles (A, An, The) અને વચન",
            subtitle = "એકવચન-બહુવચન અને આર્ટિકલના નિયમો",
            level = LessonLevel.STD_4_6,
            grammarNote = "સ્વર ધ્વનિ (a, e, i, o, u નો ઉચ્ચાર) પહેલાં 'An' આવે છે (જેમ કે an honest man, an apple); વ્યંજન ધ્વનિ પહેલાં 'A' અને ખાસ કે એકમાત્ર વસ્તુ માટે 'The' આવે છે.",
            examples = listOf(
                LessonExample("a book, a university, a one-rupee coin", "પુસ્તક, યુનિવર્સિટી, એક રૂપિયાનો સિક્કો", "વ્યંજન ધ્વનિ -> A"),
                LessonExample("an apple, an umbrella, an honest boy", "સફરજન, છત્રી, પ્રામાણિક છોકરો", "સ્વર ધ્વનિ -> An"),
                LessonExample("the Sun, the Ganga, the Himalayas", "સૂર્ય, ગંગા નદી, હિમાલય", "અદ્વિતીય નામ -> The"),
                LessonExample("book -> books, box -> boxes", "પુસ્તક -> પુસ્તકો, પેટી -> પેટીઓ", "બહુવચન (-s / -es)"),
                LessonExample("child -> children, tooth -> teeth", "બાળક -> બાળકો, દાંત -> દાંત", "અનિયમિત બહુવચન"),
                LessonExample("leaf -> leaves, city -> cities", "પાંદડું -> પાંદડાં, શહેર -> શહેરો", "-f/-y બહુવચન નિયમ")
            )
        ),
        Lesson(
            id = "prepositions",
            title = "Prepositions (સ્થાનદર્શક શબ્દો)",
            subtitle = "in, on, under, near, behind, between",
            level = LessonLevel.STD_4_6,
            grammarNote = "Preposition વસ્તુનું સ્થાન કે સમય દર્શાવે છે: in (અંદર), on (ઉપર અડીને), under (નીચે), between (બેની વચ્ચે), among (ઘણાની વચ્ચે).",
            examples = listOf(
                LessonExample("The books are in the bag.", "પુસ્તકો બેગની અંદર છે.", "in = અંદર"),
                LessonExample("The pen is on the table.", "પેન ટેબલની ઉપર છે.", "on = ઉપર"),
                LessonExample("The cat is sleeping under the chair.", "બિલાડી ખુરશી નીચે સૂઈ રહી છે.", "under = નીચે"),
                LessonExample("Our school is near the library.", "અમારી શાળા પુસ્તકાલયની નજીક છે.", "near = નજીક"),
                LessonExample("Riya sits between Diya and Kavya.", "રિયા દિયા અને કાવ્યાની વચ્ચે બેસે છે.", "between = બે વચ્ચે"),
                LessonExample("The garden is behind our house.", "બગીચો અમારા ઘરની પાછળ છે.", "behind = પાછળ")
            )
        ),
        Lesson(
            id = "simple_tenses",
            title = "સાદા કાળ (Simple Tenses)",
            subtitle = "સાદો વર્તમાન, ભૂતકાળ અને ભવિષ્યકાળ",
            level = LessonLevel.STD_4_6,
            grammarNote = "સાદા વર્તમાનમાં He/She/It સાથે ક્રિયાપદને -s/-es લાગે છે. સાદા ભૂતકાળમાં V2 (went, played) અને ભવિષ્યમાં will + V1 વપરાય છે.",
            examples = listOf(
                LessonExample("I read English every day.", "હું દરરોજ અંગ્રેજી વાંચું છું.", "સાદો વર્તમાનકાળ"),
                LessonExample("She writes neatly in her notebook.", "તે પોતાની નોટબુકમાં સ્વચ્છ લખે છે.", "He/She + writes"),
                LessonExample("We visited the science fair yesterday.", "ગઈકાલે અમે વિજ્ઞાન મેળાની મુલાકાત લીધી.", "સાદો ભૂતકાળ (V2)"),
                LessonExample("He did not miss the school bus.", "તેણે સ્કૂલ બસ ચૂકી નહીં.", "ભૂતકાળ નકાર (did not + V1)"),
                LessonExample("They will participate in the competition.", "તેઓ સ્પર્ધામાં ભાગ લેશે.", "સાદો ભવિષ્યકાળ"),
                LessonExample("Will you help me with mathematics?", "શું તમે મને ગણિતમાં મદદ કરશો?", "ભવિષ્ય પ્રશ્ન")
            )
        ),

        // --- ધોરણ 7–8: ઉચ્ચ પ્રાથમિક ---
        Lesson(
            id = "continuous_perfect_tenses",
            title = "ચાલુ અને પૂર્ણ કાળ (Continuous & Perfect)",
            subtitle = "ધોરણ 7–8 માટે મુખ્ય કાળનો ઉપયોગ",
            level = LessonLevel.STD_7_8,
            grammarNote = "ચાલુ કાળમાં is/am/are + V-ing (વર્તમાન) અને was/were + V-ing (ભૂતકાળ). પૂર્ણ વર્તમાનમાં have/has + V3 (Past Participle) વપરાય છે.",
            examples = listOf(
                LessonExample("The students are performing an experiment.", "વિદ્યાર્થીઓ એક પ્રયોગ કરી રહ્યા છે.", "ચાલુ વર્તમાનકાળ"),
                LessonExample("It was raining heavily last night.", "ગઈ રાત્રે ભારે વરસાદ પડી રહ્યો હતો.", "ચાલુ ભૂતકાળ"),
                LessonExample("I have finished my science project.", "મેં મારો વિજ્ઞાન પ્રોજેક્ટ પૂર્ણ કરી દીધો છે.", "પૂર્ણ વર્તમાનકાળ"),
                LessonExample("She has won the first prize.", "તેણીએ પ્રથમ ઇનામ જીત્યું છે.", "has + V3 (won)"),
                LessonExample("Have you ever visited Sardar Sarovar?", "શું તમે ક્યારેય સરદાર સરોવરની મુલાકાત લીધી છે?", "અનુભવ માટે Have you + V3"),
                LessonExample("We had reached the station before the train arrived.", "ટ્રેન આવી તે પહેલાં અમે સ્ટેશન પહોંચી ગયા હતા.", "પૂર્ણ ભૂતકાળ")
            )
        ),
        Lesson(
            id = "degrees_comparison",
            title = "વિશેષણ અને તુલના (Degrees of Comparison)",
            subtitle = "Positive, Comparative અને Superlative",
            level = LessonLevel.STD_7_8,
            grammarNote = "બે વ્યક્તિ/વસ્તુની તુલનામાં Comparative (-er + than અથવા more + adj + than) અને સૌથી શ્રેષ્ઠ દર્શાવવા Superlative (the + -est અથવા the most + adj) વપરાય છે.",
            examples = listOf(
                LessonExample("Neha is as tall as Priya.", "નેહા પ્રિયા જેટલી જ ઊંચી છે.", "Positive Degree"),
                LessonExample("Mount Girnar is higher than Pavagadh.", "ગિરનાર પર્વત પાવાગઢ કરતાં ઊંચો છે.", "Comparative (-er than)"),
                LessonExample("The Narmada is the longest river in Gujarat.", "નર્મદા ગુજરાતની સૌથી લાંબી નદી છે.", "Superlative (the -est)"),
                LessonExample("This chapter is more interesting than the previous one.", "આ પ્રકરણ અગાઉના કરતાં વધુ રસપ્રદ છે.", "more + adjective"),
                LessonExample("Health is the most valuable wealth.", "આરોગ્ય સૌથી મૂલ્યવાન સંપત્તિ છે.", "the most + adjective"),
                LessonExample("Good -> Better -> Best", "સારું -> વધુ સારું -> શ્રેષ્ઠ", "અનિયમિત તુલના")
            )
        ),
        Lesson(
            id = "modals_wh_questions",
            title = "Modals અને Wh-Questions",
            subtitle = "can, should, must અને પ્રશ્નવાચક શબ્દો",
            level = LessonLevel.STD_7_8,
            grammarNote = "Can = ક્ષમતા, Should = સલાહ/ફરજ, Must = અનિવાર્ય નિયમ. બધા Modals પછી હંમેશા ક્રિયાપદનું મૂળ રૂપ (V1) આવે છે.",
            examples = listOf(
                LessonExample("I can solve this puzzle easily.", "હું આ કોયડો સરળતાથી ઉકેલી શકું છું.", "Can = ક્ષમતા"),
                LessonExample("We should respect our elders and teachers.", "આપણે વડીલો અને શિક્ષકોનો આદર કરવો જોઈએ.", "Should = સલાહ"),
                LessonExample("Students must follow traffic rules.", "વિદ્યાર્થીઓએ ટ્રાફિકના નિયમોનું પાલન કરવું જ જોઈએ.", "Must = ફરજિયાત"),
                LessonExample("Why do we celebrate Science Day?", "આપણે વિજ્ઞાન દિવસ કેમ ઉજવીએ છીએ?", "Why = શા માટે"),
                LessonExample("Where did you find this dictionary?", "તમને આ શબ્દકોશ ક્યાંથી મળ્યો?", "Where = ક્યાં"),
                LessonExample("How many planets are there in our solar system?", "આપણા સૌરમંડળમાં કેટલા ગ્રહો છે?", "How many = કેટલા")
            )
        ),
        Lesson(
            id = "active_passive_writing",
            title = "Active–Passive અને નિબંધ/પત્ર વાક્યો",
            subtitle = "ધોરણ 8 પરીક્ષા અને લેખન કૌશલ્ય માટે",
            level = LessonLevel.STD_7_8,
            grammarNote = "Passive Voice માં કર્મ (Object) મુખ્ય બને છે અને 'be + V3 + by + Subject' રચના વપરાય છે. પત્ર અને નિબંધમાં સરળ, સ્પષ્ટ વાક્યો લખો.",
            examples = listOf(
                LessonExample("Active: The teacher praised the student.", "શિક્ષકે વિદ્યાર્થીની પ્રશંસા કરી.", "કર્તરી પ્રયોગ"),
                LessonExample("Passive: The student was praised by the teacher.", "વિદ્યાર્થીની શિક્ષક દ્વારા પ્રશંસા કરવામાં આવી.", "કર્મણિ પ્રયોગ"),
                LessonExample("Active: We plant trees during monsoon.", "અમે ચોમાસામાં વૃક્ષો વાવીએ છીએ.", "વર્તમાન કર્તરી"),
                LessonExample("Passive: Trees are planted by us during monsoon.", "ચોમાસામાં અમારા દ્વારા વૃક્ષો વાવવામાં આવે છે.", "વર્તમાન કર્મણિ"),
                LessonExample("Respected Sir, kindly grant me leave for two days.", "આદરણીય સાહેબ, કૃપા કરીને મને બે દિવસની રજા આપો.", "રજા અરજી માટે"),
                LessonExample("Cleanliness and discipline make a nation strong.", "સ્વચ્છતા અને શિસ્ત રાષ્ટ્રને મજબૂત બનાવે છે.", "નિબંધ માટે શ્રેષ્ઠ વાક્ય")
            )
        )
    )
}
