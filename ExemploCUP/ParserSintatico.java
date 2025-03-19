
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Mar 19 10:05:00 BRT 2025
//----------------------------------------------------

package ExemploCUP;

import java_cup.runtime.*;
import java.util.*;
import java.io.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Mar 19 10:05:00 BRT 2025
  */
public class ParserSintatico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserSintatico() {super();}

  /** Constructor which sets the default scanner. */
  public ParserSintatico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserSintatico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\005\000\002\002\004\000\002\002\004\000\002\003" +
    "\003\000\002\003\005\000\002\003\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\012\000\004\007\006\001\002\000\004\002\014\001" +
    "\002\000\004\004\013\001\002\000\010\004\uffff\005\007" +
    "\006\010\001\002\000\004\007\006\001\002\000\004\007" +
    "\006\001\002\000\004\004\ufffd\001\002\000\004\004\ufffe" +
    "\001\002\000\004\002\001\001\002\000\004\002\000\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\012\000\006\002\003\003\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\003\011" +
    "\001\001\000\004\003\010\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserSintatico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserSintatico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserSintatico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserSintatico$actions {
  private final ParserSintatico parser;

  /** Constructor */
  CUP$ParserSintatico$actions(ParserSintatico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserSintatico$do_action(
    int                        CUP$ParserSintatico$act_num,
    java_cup.runtime.lr_parser CUP$ParserSintatico$parser,
    java.util.Stack            CUP$ParserSintatico$stack,
    int                        CUP$ParserSintatico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserSintatico$result;

      /* select the action based on the action number */
      switch (CUP$ParserSintatico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= INTEIRO MENOS expr 
            {
              Object RESULT =null;

              CUP$ParserSintatico$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$ParserSintatico$stack.elementAt(CUP$ParserSintatico$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSintatico$stack.peek()), RESULT);
            }
          return CUP$ParserSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= INTEIRO MAIS expr 
            {
              Object RESULT =null;

              CUP$ParserSintatico$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$ParserSintatico$stack.elementAt(CUP$ParserSintatico$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSintatico$stack.peek()), RESULT);
            }
          return CUP$ParserSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr ::= INTEIRO 
            {
              Object RESULT =null;

              CUP$ParserSintatico$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$ParserSintatico$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSintatico$stack.peek()), RESULT);
            }
          return CUP$ParserSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr_ptv EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserSintatico$stack.elementAt(CUP$ParserSintatico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserSintatico$stack.elementAt(CUP$ParserSintatico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserSintatico$stack.elementAt(CUP$ParserSintatico$top-1)).value;
		RESULT = start_val;
              CUP$ParserSintatico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserSintatico$stack.elementAt(CUP$ParserSintatico$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSintatico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserSintatico$parser.done_parsing();
          return CUP$ParserSintatico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr_ptv ::= expr PTVIRG 
            {
              Object RESULT =null;

              CUP$ParserSintatico$result = parser.getSymbolFactory().newSymbol("expr_ptv",0, ((java_cup.runtime.Symbol)CUP$ParserSintatico$stack.elementAt(CUP$ParserSintatico$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSintatico$stack.peek()), RESULT);
            }
          return CUP$ParserSintatico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

