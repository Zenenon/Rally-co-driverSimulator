parser grammar RallyComParser;
options { tokenVocab=RallyComLexer;}

program:
    pacenote (','pacenote)* EOF
    ;

pacenote:
    repeatPhrase    #loopPhrase
    | sequence      #normalPhrase
    ;

repeatPhrase:
    count=anyNumber X LBRACK pacenote (',' pacenote)* RBRACK
    ;

sequence:
    element (connect=(DO|PRZED|NA) element)*
    ;

element:
    action=(HAMUJ | PRZYHAMUJ | PELNE_HAMOWANIE) element? #actionPhrase
    | direct=(LEWY|PRAWY) turnSpec? modifier* #turnPhrase
    | dist=INT PROSTO? #distancePhrase
    | SZCZYT modifier* #crestPhrase
    | (DO_LEWEJ|DO_PRAWEJ|Z_DROGI) #positioningPhrase
    ;

anyNumber:
    INT | JEDEN | DWA | TRZY | CZTERY | PIEC
    ;

turnSpec:
    degree=(JEDEN|DWA|TRZY|CZTERY|PIEC|MAKS)
    | NAWROT degree=(JEDEN|DWA|TRZY|CZTERY|PIEC|MAKS)?
    ;

modifier:
    HALF
    | DNEM
    | PLUS
    | CIAC
    | NIE_CIAC
    | POZNO
    | WCZESNIE
    | SMIALO
    | CELUJ
    | ZACISK
    | PRZEZ
    | ZDUS
    ;