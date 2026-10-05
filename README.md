LOC je izračunat pomoću VSCode Counter ekstenzije. 
Analizirana su dva fajla (calculator.java i Start.java).
Ukupno je izmjereno 148 linija koda, 5 linija komentara i 61 prazna linija, ukupno 214 linija.
LOC = 148

REZULTATI STATICKE ANALIZE fajla Calculator.java
Calculator.java - Ln1 Col1 - Premjestiti ovaj fajl u imenovani paket
Calculator.java - Ln4 Col14 - Potrebno je dodati još jedan kostruktor " private Calculator() { " kako bismo sakrili implicitni javni kostruktor.
Calculator.java - Ln18 Col30 - Potrebno je preimenovati metodu "ToString" kako bismo sprijecili nesporazum sa metodom "toString" koja je definisana u natklasi "java.lang.Object"
Calculator.java - Ln18 Col30 - Potrebno je preimenovati naziv metode kako bi odgovarao regularnom izrazu '^[a-z][a-zA-Z0-9]*$' (treba da počinje malim slovima).
Calculator.java - Ln24 Col26 - Potrebno je preimenovati naziv metode kako bi odgovarao regularnom izrazu '^[a-z][a-zA-Z0-9]*$' (treba da počinje malim slovima).
Calculator.java - Ln70 Col29 - Potrebno je odmah vratiti (return) ovaj izraz umjesto što je dodjeljen privremenoj varijabli "textResult"
Calculator.java - Ln74 Col25 - Potrebno je preimenovati naziv metode kako bi odgovarao regularnom izrazu '^[a-z][a-zA-Z0-9]*$' (treba da počinje malim slovima, tzv camelCase).
Calculator.java - Ln183 Col13 - Potrebno je ukloniti ovu suvišnu naredbu 'return'.

REZULTATI STATICKE ANALIZE fajla Start.java
Start.java - Ln1 Col1 - Premjestiti ovaj fajl u imenovani paket
Start.java - Ln6 Col10 - Potrebno je preimenovati naziv metode kako bi odgovarao regularnom izrazu '^[a-z][a-zA-Z0-9]*$' (tzv.camelCase).
Start.java - Ln8 Col3 - Potrebno je koristenu naredbu "System.out" zamijeniti sa naredbom "logger"
Start.java - Ln19 Col5 - Potrebno je koristenu naredbu "System.out" zamijeniti sa naredbom "logger"




