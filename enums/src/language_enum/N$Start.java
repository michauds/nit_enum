/* This file was generated by SableCC ( http://sablecc.org ). */

package language_enum;

class N$Start
    extends Node {

  private final int line;
  private final int pos;
  private final NEnum e$1;
  private final End e$end;

  @Override
  public int getLine() {
    return this.line;
  }

  @Override
  public int getPos() {
    return this.pos;
  }

  @Override
  public String getText() {
    return null;
  }

  @Override
  public void apply(Walker walker) {
    walker.defaultIn(this);
    walker.defaultCase(this);
    walker.defaultOut(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.e$1.apply(walker);
    this.e$end.apply(walker);
  }

  N$Start(int line, int pos, NEnum p$1, End p$end) {
    this.line = line;
    this.pos = pos;
    this.e$1 = p$1;
    this.e$end = p$end;
  }

  @Override
  public Type getType() {
    return Type.TAnonymous;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_$Start;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_$Start;
  }

  NEnum internalGet$1() {
    return this.e$1;
  }

  End internalGet$end() {
    return this.e$end;
  }
}
