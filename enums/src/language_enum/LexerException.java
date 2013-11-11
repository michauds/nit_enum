/* This file was generated by SableCC ( http://sablecc.org ). */

package language_enum;

public class LexerException
    extends Exception {

  private char c;
  private int line;
  private int pos;

  public LexerException(char c, int line, int pos) {
    this.c = c;
    this.line = line;
    this.pos = pos;
  }

  public char getChar() {
    return this.c;
  }

  public int getLine() {
    return this.line;
  }

  public int getPos() {
    return this.pos;
  }

  public String getMessage() {
    return "unrecognized char '" + getChar() + "' on line " + getLine() + ", pos " + getPos();
  }
}