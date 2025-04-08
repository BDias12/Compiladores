package Prova;
import static Prova.Token.*;

%%

%{
  private void imprimir(String token, String lexema) {
    System.out.println(lexema + " -> Classificacao Lexica: " + token);
  }
%}

%class Lexer
%type Token

digito = [0-9]
inteiro = {digito}+
branco = [\n|\t|\r| ]+
carac = [a-zA-Z]

reservadas = ("main" | "return" | "if" | "while" | "cout" | "cin" | "for")
tipo = ("void" | "int" | "float" | "char")
comparador = ("<" | ">")
simbolos = ("<<" | ">>" | "++")
atribuicao = ("=")
identificador = {carac}({carac} | {digito})*
simbolos_especiais = ("(" | ")" | ";" | "{" | "}")

%%

{ branco } { return BRANCO; }
{ reservadas } {imprimir("RESERVADAS", yytext()); return RESERVADAS;}
{ inteiro } {imprimir("INTEIRO", yytext()); return INTEIRO;}
{ tipo } {imprimir("TIPO", yytext()); return TIPO; }
{ comparador } {imprimir("COMPARADOR", yytext()); return COMPARADOR;}
{ simbolos } {imprimir("SIMBOLOS", yytext()); return SIMBOLOS;}
{ atribuicao } {imprimir("ATRIBUICAO", yytext()); return ATRIBUICAO;}
{ identificador } {imprimir("IDENTIFICADOR", yytext()); return IDENTIFICADOR;}
{ simbolos_especiais } {imprimir("SIMBOLOS ESPECIAIS", yytext()); return SIMBOLOSESPECIAIS;}
. {imprimir("<<CARACTER INVALIDO>>", yytext()); return ERROR;}

<<EOF>> {return null; }

