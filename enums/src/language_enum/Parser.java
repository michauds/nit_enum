/* This file was generated by SableCC ( http://sablecc.org ). */

package language_enum;

import java.io.*;
import java.util.*;

public class Parser {

  private final Lexer lexer;
  private final ParseStack stack = new ParseStack();

  public Parser(Reader reader) {
    this.lexer = new Lexer(reader);
  }

  public Node parse()
      throws ParserException, LexerException, IOException {

    Node tree = null;
    while(tree == null) {
      tree = stack.getState().apply(this);
    }

    return tree;
  }

  ParseStack getStack() {
    return this.stack;
  }

  private LinkedList<Token> lookList = new LinkedList<Token>();

  Token look(int distance)
      throws LexerException, IOException {
    while(lookList.size() < distance) {
      lookList.addLast(lexer.next());
    }
    return lookList.get(distance - 1);
  }

  void shift()
      throws ParserException, LexerException, IOException {
    Token token;
    if(lookList.size() > 0) {
      token = lookList.removeFirst();
    }
    else {
      token = lexer.next();
    }
    stack.push(token, stack.getState().getTarget(token));
  }
}

class ParseStack {
  private ParseStackEntry stack = new ParseStackEntry(null, null, L_0.instance);
  private ParseStackEntry freeList;

  void push(Node node, LRState state) {
    ParseStackEntry entry;
    if(freeList != null) {
      entry = freeList;
      freeList = freeList.previous;
      entry.set(stack, node, state);
    }
    else {
      entry = new ParseStackEntry(stack, node, state);
    }
    stack = entry;
  }

  LRState getState() {
    return stack.state;
  }

  Node pop() {
    Node node = stack.node;
    ParseStackEntry entry = stack;
    stack = stack.previous;
    entry.set(freeList, null, null);
    freeList = entry;
    return node;
  }

  private static class ParseStackEntry {
    ParseStackEntry previous;
    Node node;
    LRState state;

    ParseStackEntry(
        ParseStackEntry previous,
        Node node,
        LRState state) {
     this.previous = previous;
     this.node = node;
     this.state = state;
    }

    void set(
        ParseStackEntry previous,
        Node node,
        LRState state) {
     this.previous = previous;
     this.node = node;
     this.state = state;
   }
  }
}

abstract class LRState {

  abstract Node apply(Parser parser)
      throws ParserException, LexerException, IOException;
  abstract LRState getTarget(Node node)
      throws ParserException, LexerException, IOException;
}

class L_0
    extends LRState {

  static final L_0 instance = new L_0();

  private L_0() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      parser.shift();
      return null;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    case T_Enum:
      return L_14.instance;
    default:
      switch(node.getInternalType()) {
        case T_$0:
          return L_1.instance;
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}

class L_1
    extends LRState {

  static final L_1 instance = new L_1();

  private L_1() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      parser.shift();
      return null;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    default:
      switch(node.getInternalType()) {
        case T_$1:
          return L_2.instance;
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}

class L_2
    extends LRState {

  static final L_2 instance = new L_2();

  private L_2() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      parser.shift();
      return null;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    default:
      switch(node.getInternalType()) {
        case T_Id:
          return L_3.instance;
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}

class L_3
    extends LRState {

  static final L_3 instance = new L_3();

  private L_3() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      parser.shift();
      return null;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    default:
      switch(node.getInternalType()) {
        case T_EolHelper:
          return L_4.instance;
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}

class L_4
    extends LRState {

  static final L_4 instance = new L_4();

  private L_4() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      parser.shift();
      return null;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    case T_Values:
      return L_10.instance;
    case T_Value:
      return L_13.instance;
    default:
      switch(node.getInternalType()) {
        case T_Id:
          return L_5.instance;
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}

class L_5
    extends LRState {

  static final L_5 instance = new L_5();

  private L_5() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      parser.shift();
      return null;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    default:
      switch(node.getInternalType()) {
        case T_$3:
          return L_6.instance;
        case T_EolHelper:
          return L_9.instance;
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}

class L_6
    extends LRState {

  static final L_6 instance = new L_6();

  private L_6() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      parser.shift();
      return null;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    default:
      switch(node.getInternalType()) {
        case T_Id:
          return L_7.instance;
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}

class L_7
    extends LRState {

  static final L_7 instance = new L_7();

  private L_7() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      parser.shift();
      return null;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    default:
      switch(node.getInternalType()) {
        case T_EolHelper:
          return L_8.instance;
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}

class L_8
    extends LRState {

  static final L_8 instance = new L_8();

  private L_8() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      ParseStack stack = parser.getStack();

      NEolHelper lEolHelper = (NEolHelper) stack.pop();
      NId lId$2 = (NId) stack.pop();
      N$3 l$3 = (N$3) stack.pop();
      NId lId$1 = (NId) stack.pop();

      NValue_With lValue_With = new NValue_With(-1, -1, lId$1, l$3, lId$2, lEolHelper);
      stack.push(lValue_With, stack.getState().getTarget(lValue_With));
      return null;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    default:
      switch(node.getInternalType()) {
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}

class L_9
    extends LRState {

  static final L_9 instance = new L_9();

  private L_9() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      ParseStack stack = parser.getStack();

      NEolHelper lEolHelper = (NEolHelper) stack.pop();
      NId lId = (NId) stack.pop();

      NValue_Without lValue_Without = new NValue_Without(-1, -1, lId, lEolHelper);
      stack.push(lValue_Without, stack.getState().getTarget(lValue_Without));
      return null;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    default:
      switch(node.getInternalType()) {
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}

class L_10
    extends LRState {

  static final L_10 instance = new L_10();

  private L_10() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      parser.shift();
      return null;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    case T_Value:
      return L_12.instance;
    default:
      switch(node.getInternalType()) {
        case T_$2:
          return L_11.instance;
        case T_Id:
          return L_5.instance;
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}

class L_11
    extends LRState {

  static final L_11 instance = new L_11();

  private L_11() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      ParseStack stack = parser.getStack();

      N$2 l$2 = (N$2) stack.pop();
      NValues lValues = (NValues) stack.pop();
      NEolHelper lEolHelper = (NEolHelper) stack.pop();
      NId lId = (NId) stack.pop();
      N$1 l$1 = (N$1) stack.pop();
      N$0 l$0 = (N$0) stack.pop();

      NEnum_Enum lEnum_Enum = new NEnum_Enum(-1, -1, l$0, l$1, lId, lEolHelper, lValues, l$2);
      stack.push(lEnum_Enum, stack.getState().getTarget(lEnum_Enum));
      return null;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    default:
      switch(node.getInternalType()) {
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}

class L_12
    extends LRState {

  static final L_12 instance = new L_12();

  private L_12() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      ParseStack stack = parser.getStack();

      NValue lValue = (NValue) stack.pop();
      NValues lValues = (NValues) stack.pop();

      NValues_Many lValues_Many = new NValues_Many(-1, -1, lValues, lValue);
      stack.push(lValues_Many, stack.getState().getTarget(lValues_Many));
      return null;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    default:
      switch(node.getInternalType()) {
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}

class L_13
    extends LRState {

  static final L_13 instance = new L_13();

  private L_13() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      ParseStack stack = parser.getStack();

      NValue lValue = (NValue) stack.pop();

      NValues_One lValues_One = new NValues_One(-1, -1, lValue);
      stack.push(lValues_One, stack.getState().getTarget(lValues_One));
      return null;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    default:
      switch(node.getInternalType()) {
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}

class L_14
    extends LRState {

  static final L_14 instance = new L_14();

  private L_14() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      parser.shift();
      return null;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    default:
      switch(node.getInternalType()) {
        case TEnd:
          return L_15.instance;
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}

class L_15
    extends LRState {

  static final L_15 instance = new L_15();

  private L_15() {
  }

  @Override
  Node apply(Parser parser)
      throws ParserException, LexerException, IOException {

    // LR(0) decisions
    {
      ParseStack stack = parser.getStack();

      End l$end = (End) stack.pop();
      NEnum l$1 = (NEnum) stack.pop();

      return l$1;
    }
  }

  @Override
  LRState getTarget(Node node)
      throws ParserException, LexerException, IOException {

    switch(node.getProductionType()) {
    default:
      switch(node.getInternalType()) {
        default:
          throw new ParserException((Token) node);
      }
    }
  }
}
