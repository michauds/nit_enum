/* This file was generated by SableCC ( http://sablecc.org ). */

package language_enum;

public class NValue_With
    extends NValue {

  private final int line;
  private final int pos;
  private final NId eId$1;
  private final N$3 e$3;
  private final NId eId$2;
  private final NEolHelper eEolHelper;

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
    walker.inValue_With(this);
    walker.caseValue_With(this);
    walker.outValue_With(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eId$1.apply(walker);
    this.e$3.apply(walker);
    this.eId$2.apply(walker);
    this.eEolHelper.apply(walker);
  }

  NValue_With(int line, int pos, NId pId$1, N$3 p$3, NId pId$2, NEolHelper pEolHelper) {
    this.line = line;
    this.pos = pos;
    this.eId$1 = pId$1;
    this.e$3 = p$3;
    this.eId$2 = pId$2;
    this.eEolHelper = pEolHelper;
  }

  @Override
  public Type getType() {
    return Type.T_Value_With;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Value;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Value_With;
  }

  public NEolHelper get_EolHelper() {
    return this.eEolHelper;
  }

  public NId internalGetId$1() {
    return this.eId$1;
  }

  N$3 internalGet$3() {
    return this.e$3;
  }

  public NId internalGetId$2() {
    return this.eId$2;
  }

  NEolHelper internalGetEolHelper() {
    return this.eEolHelper;
  }
}