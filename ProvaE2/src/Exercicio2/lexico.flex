package Exercicio2;
import java_cup.runtime.*;

%%
%cup
%public
%class Lexer
%line
%column

%{
    private Symbol symbol (int type) {return new Symbol(type, yyline, yycolumn);}
    private Symbol symbol (int type, Object value) {return new Symbol (type, yyline, yycolumn, value);}
%}

DIGITO = [0-9]
LETRA = [a-zA-Z_]
INTEIRO = {DIGITO}+
IGNORE = [\n|\s|\t\r]
VARIAVEL = {LETRA}+
FLOAT = {INTEIRO}"."{INTEIRO} 

%%
<YYINITIAL> {
    "programa" {return new Symbol(Sym.PROGRAMA);}
    "inicio" {return new Symbol(Sym.INICIO);}
    "fim" {return new Symbol(Sym.FIM);}
    "int" {return new Symbol(Sym.TIPO_INT);}
    "if" {return new Symbol(Sym.IF);}
    "=" {return new Symbol(Sym.ATRIBUI);}
    "float" {return new Symbol(Sym.TIPO_FLOAT);}
    "(" {return new Symbol(Sym.ABRE_PAREN);}
    ")" {return new Symbol(Sym.FECHA_PAREN);}
    "*" {return new Symbol(Sym.MULTIPLICA);}
    ">" {return new Symbol(Sym.MAIOR);}
    ";" {return new Symbol(Sym.PTV);}
    {INTEIRO} {return new Symbol(Sym.INTEIRO);}
    {VARIAVEL} {return new Symbol(Sym.VARIAVEL);}
    {FLOAT} {return new Symbol(Sym.FLOAT);}
    {IGNORE} { }

}

<<EOF>> {return new Symbol(Sym.EOF);}
[^] { throw new Error("Caractere invalido: " + yytext() + " na linha " + (yyline + 1) + " coluna " + (yycolumn + 1)); }