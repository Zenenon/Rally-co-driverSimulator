lexer grammar RallyComLexer;

LEWY              : 'lewy' | 'L';
PRAWY             : 'prawy' | 'P';
NAWROT            : 'nawrot' | 'nawrót' | 'nazad';
SZCZYT            : 'szczyt' | '^';
PROSTO            : 'prosto' | 'PR';

JEDEN             : 'jeden' | '1';
DWA               : 'dwa' | '2';
TRZY              : 'trzy' | '3';
CZTERY            : 'cztery' | '4';
PIEC              : 'pięć' | '5';
MAKS              : 'maks' | 'MAX';

HALF              : 'pół' | 'pol';
DNEM              : 'dnem' | '_';
PLUS              : 'plus' | '+';

HAMUJ             : 'hamuj';
PRZYHAMUJ         : 'przyhamuj';
PELNE_HAMOWANIE   : 'pełne hamowanie';
ZDUS              : 'zduś';

DO_LEWEJ          : 'do lewej';
DO_PRAWEJ         : 'do prawej';
Z_DROGI           : 'z drogi' | 'poboczem' | 'szutrem';

CIAC              : 'ciąć';
NIE_CIAC          : 'nie ciąć';
POZNO             : 'późno';
WCZESNIE          : 'wcześnie';
SMIALO            : 'śmiało';
CELUJ             : 'celuj';
ZACISK            : 'zacisk';
PRZEZ             : 'przez';

DO                : 'do';
PRZED             : 'przed';
NA                : 'na';

COMMA             : ',';

X                 : 'x';
LBRACK            : '[';
RBRACK            : ']';

NEWLINE           : [\r\n]+ -> channel(HIDDEN);

WS                : [ \t]+ -> channel(HIDDEN);

INT               : [0-9]+;