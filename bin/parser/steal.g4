grammar steal;


exp 
     : 
     val|
     '(' exp comma op exp ')'|			// spaces are mandatory !! CHECK
     'not (' exp ')'|
     'tx(' integerz ').'FIELD|
     'txlen'|
     'txid(' integerz ')'|
     'txpos'|
     'arg(' integerz  ')'|
     'arglen'|
     'H(' exp ')'|
     'versig(' exp comma exp comma exp ')'      //TO BE CHECKED - versig expects 64 64 32 bytes 
     	       	       	       	   	// we could have specific val beyond BYTE and INT
					// and versig(B64, B64, B32)
     ;


val					// if wrong val is used in wrong place contract will fail
     : 
     'byte base64 ' BYTE|	
     'int ' BYTE|			// a BYTE is a mix of numbers and letters and by assumption 
     'addr ' BYTE 		 	// starts with a letter - it seems that a key goes as addr k - (32bytes)
     ;


integerz
     : 
     DIGIT+
     ;

     
BYTE 
     : 
     ALPHANUM+
     ;

op   
     : ' + ' |  ' − ' | ' < ' | ' ≤ ' | ' = ' | ' ≥ ' | ' > ' | ' ∗ ' | ' / ' | ' % ' | ' and ' | ' or '
     ;

FIELD
     : 'snd' |			//TO BE CHECKED 
       'rcv' |  
       'crcv' | 
       'val' |  
       'fv' | 
       'lv' | 
       'lx' |  
       'type' |  
       'asst' |  
       'asstval' |  
       'asstsnd' |  
       'asstrcv' |  
       'casstrcv' |  
       'fee' |  
       'note' 
     ;

comma				// comma - just for parsing commodity 
     :
     ;

DIGIT
     : '0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9'
     ;

ALPHANUM
     :  '0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9'|'a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|'m'|'n'|'o'|'p'|'q'|'r'|'s'|'t'|'u'|'v'|'w'|'x'|'y'|'z'|'A'|'B'|'C'|'D'|'E'|'F'|'G'|'H'|'I'|'J'|'K'|'L'|'M'|'N'|'O'|'P'|'Q'|'R'|'S'|'T'|'U'|'V'|'W'|'X'|'Y'|'Z' 
     ;

//---------------------  End of File


/*	ORACLE EXAMPLE (with a,b,o, rmax actual numerical values) 

<<< Hope that /* works as in Java for large comments !!


> a = Addr("6ZHGHH5Z5CTPCF5WCESXMGRSVK7QJETR63M3NY5FJCUYDHO57VTCMJOBGY")
> b = Addr("FP2UC5HN4TJ7AIK6OY5RAS52XA6GYCOQUK3HTR55UOACPZM6RCUKAP5VAM")
> o = Addr("7J6SHHBCIFAGBBQMJOXAKV2LCFU5CLXADWCMOJFDKM4MCDHSDYY3XV57QI")
> timeout = 3000



STEAL:

(
 (tx(0).type = int close) 
 and 
 (
  ( (tx(0).fv > int rmax) and (tx(0).crcv = addr a) )
  or 
  (
   ( (arg(0) = byte base64 0) 
     and 
     ( versig(arg(0), arg(1), addr o) and (tx(0).crcv = addr a) )
   ) 
   or 
   ( (arg(0) =  byte base64 1) 
     and 
     ( versig(arg(0), arg(1), o) and (tx(0).crcv = addr b) )􏰃
   )
  )
 )
)


E.g. derivation for second row is: 

E -> (E and E) -> ((E > E) and (E = E)) -> ((tx(0).fv > val) and (tx(0).rcv = val)) ->   ((tx(0).fv > int rmax) and (tx(0).rcv = addr a)
 


Input to my tool:			ORACLE  <<<


['and', 
              ['=', ['tx', '0', 'type'], ['int', 'close']],
              ['or',  ['and', ['>',   ['tx', '0', 'fv'], 
                                      ['int', 'rmax']
                              ], 
                              ['=',   ['tx', '0', 'crcv'], 
                                      ['addr', 'a']
                              ]
                      ], 
                      ['or',  ['and', ['=', ['arg', '0'], ['byte base64', '0']], 
                                      ['and', ['versig', ['arg', '0'], ['arg', '1'], ['addr', 'o']], 
                                              ['=', ['tx', '0', 'crcv'], ['addr', 'a']]
                                      ]
                              ],
                              ['and', ['=', ['arg', '0'], ['byte base64', '1']], 
                                      ['and', ['versig', ['arg', '0'], ['arg', '1'], ['addr', 'o']], 
                                              ['=', ['tx', '0', 'crcv'], ['addr', 'b']]
                                      ]
                              ]
                      ]
              ]
             ]


Translated to TEAL by my tool:		ORACLE                  <<<


#pragma version 2
gtxn 0 Type
int close
==
gtxn 0 FirstValid
int rmax
>
gtxn 0 CloseReminderTo
addr a
==
&&
arg 0
byte base64 0
==
arg 0
arg 1
addr o
ed25519verify
gtxn 0 CloseReminderTo
addr a
==
&&
&&
arg 0
byte base64 1
==
arg 0
arg 1
addr o
ed25519verify
gtxn 0 CloseReminderTo
addr b
==
&&
&&
||
||
&&




*/