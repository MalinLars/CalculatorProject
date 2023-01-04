# CalculatorProject
Min kalkylator är byggd i två klasser: klassen Calculator och klassen Start. 
I klassen Start finns följande tre metoder: printMenu(), askUserInput() och Main(). Där finns också ett objekt av klassen Calculator för att kunna nå koden i den klassen.

Programmet startas i main-metoden. Koden är inbäddad i en while-loop som upprepas så länge en boolean som heter “repeat” är true. Programmet fortsätter att köra tills dess att användaren väljer att avsluta. 

Programmet börjar med att kalla på metoden printMenu() som är en behållare av menyn där sju val presenteras. Där ombeds användaren välja om den vill beräkna med plus, minus, division eller multiplikation. Utöver de fyra räknesätten finns också valen att visa resultat av tidigare beräkningar, radera minnet av tidigare resultat eller att stänga kalkylatorn. Inuti printMenu() kontrolleras att användarens input är en siffra. Om input är ett annat tecken ombeds användaren att göra om sitt val och att ange ett giltigt värde. Inputen sparas i en int som kallas choice.

När användaren valt i menyn går programmet vidare till en switch. Om användaren valt att göra en beräkning anropas askUserInput() som då hanterar programmets nästa steg - att ange de två nummer som den vill räkna med, firstNumber och secondNumber. Jag har valt att ta in användarens siffror som double för att kunna räkna med decimaler. För att säkerställa att inputen är en siffra används try-catch inuti denna metod. Om input inte är korrekt visas ett meddelande och metoden loopar med hjälp av en do-while loop så att användaren får en ny chans att skriva in korrekt input. 

I switchen anropas objektet som skapats av klassen Calculator och de metoder som finns där. I Calculator finns en constructor, en ArrayList som kallas memoryList och ett antal metoder. För beräkningar finns metoderna addition(), subtraction(), multiplication() och division(). De tar alla in firstNumber och secondNumber, utför beräkningen och returnerar ett resultat (result). Alla resultat är angivna i double för att kunna hantera decimaler och jag har valt att inte göra någon avrundning av decimaler då jag tycker att det inte behövs i just en kalkylator där alla decimaler kan vara viktiga. 

Jag har valt att alla resultat av beräkningarna dessutom skickas till metoden memoryStorage() där de sparas ner i memoryList. Så länge programmet kör och användaren fortsätter att göra beräkningar sparas alla resultat. För att redovisa innehållet i memoryList finns metoden printMemory() som loopar genom memoryList med hjälp av en for-loop och skriver ut alla sessionens gjorda beräkningar. Vill användaren radera innehållet i listan görs detta i clearMemory(). Där används ArrayList.clear() funktionen. Det går endast att radera hela listans innehåll i min kalkylator.

Om användaren väljer att avsluta programmet i menyn blir booleanen i klassen Start false och programmet slutar skriva ut menyn.
