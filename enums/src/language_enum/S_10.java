/* This file was generated by SableCC ( http://sablecc.org ). */

package language_enum;

class S_10
    extends TransitionState {

  static final S_10 instance = new S_10();

  private S_10() {
  }

  void setMarker(Lexer lexer) {
  }

  State getTarget(Symbol symbol) {
    switch(symbol) {
    case Symbol_min:
      return S_9.instance;
    case Symbol_9:
      return S_9.instance;
    case Symbol_10:
      return S_9.instance;
    case Symbol_13:
      return S_9.instance;
    case Symbol_32:
      return S_9.instance;
    case Symbol_34:
      return S_5.instance;
    case Symbol_61:
      return S_9.instance;
    case Symbol__d:
      return S_11.instance;
    case Symbol__e:
      return S_5.instance;
    case Symbol__m:
      return S_5.instance;
    case Symbol__n:
      return S_5.instance;
    case Symbol__u:
      return S_12.instance;
    case Symbol_end:
      return S_9.instance;
    default:
      return null;
    }
  }

}