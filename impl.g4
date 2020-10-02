grammar impl;

/* A small imperative language */

start   :  cs+=command* EOF ;

program : c=command                      # SingleCommand
	| '{' cs+=command* '}'           # MultipleCommands
	;
	
command : x=ID '=' e=expr ';'	         # Assignment
	| 'output' e=expr ';'            # Output
        | 'while' '('c=condition')' p=program  # WhileLoop
	;
	
expr	: e1=expr '+' e2=expr # Addition
    | e1=expr '-' e2=expr # Subtraction
	| e1=expr '*' e2=expr # Multiplication
	| e1=expr '/' e2=expr # Devision
	| c=FLOAT     	      # Constant
	| x=ID		      # Variable
	| '(' e=expr ')'      # Parenthesis
	;

condition : e1=expr '!=' e2=expr # Unequal
      | e1=expr '==' e2=expr #Equal
      | e1=expr '<' e2=expr #LessThan
      | e1=expr '>' e2=expr #MoreThan
	  | c1=condition '&&' c2=condition # And
	  ;  

ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : '-'? NUM+ ('.' NUM+)? ;

ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
