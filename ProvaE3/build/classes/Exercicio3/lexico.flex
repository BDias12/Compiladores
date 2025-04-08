package Exercicio3;
import java_cup.runtime.*;

%%
%cup
%public
%class Lexer
%line
%column

DIGITO = [0-9]
INTEIRO = {DIGITO}+
IGNORE = [\n|\s|\t\r]

%%
<YYINITIAL> {

    {INTEIRO} {int aux = Integer.parseInt(yytext());
                return new Symbol (Sym.INTEIRO, yyline, yycolumn, new Integer(aux));
                }
     "+"    {return  new Symbol(Sym.MAIS);}
     ";"    {return new Symbol(Sym.PTV);}
     "*"    {return new Symbol(Sym.MULT);}
     "/"    {return new Symbol(Sym.DIV);}
     {IGNORE} {}

}
<<EOF>> {return new Symbol( Sym.EOF ); }
