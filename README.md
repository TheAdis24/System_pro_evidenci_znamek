System_pro_evidenci_znamek
Jednoduchý školní systém v Javě implementovaný jako Maven projekt.
Systém umožňuje evidenci studentů, kurzů a známek.

Funkcionalita
Evidence studentů
Evidence kurzů
Přidání známky studentovi v kurzu
Každý student může mít v jednom kurzu pouze jednu známku
Automatické ukládání času vytvoření známky
Uložení učitele, který známku zadal
Technologie
Java 17
Maven
JUnit 5
Struktura projektu
src/main/java – aplikační logika
src/test/java – unit testy
Spuštění testů
Pomocí Mavenu:

mvn test
