/* This file was generated by SableCC ( http://sablecc.org ). */

package language_enum;

class S_9
    extends FinalState {

  static final S_9 instance = new S_9();

  private S_9() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(1);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new NId(text, line, pos);
  }
}