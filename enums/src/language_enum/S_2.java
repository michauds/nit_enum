/* This file was generated by SableCC ( http://sablecc.org ). */

package language_enum;

class S_2
    extends FinalState {

  static final S_2 instance = new S_2();

  private S_2() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(0);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new NEolHelper(text, line, pos);
  }
}