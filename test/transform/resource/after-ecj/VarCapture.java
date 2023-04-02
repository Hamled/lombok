import lombok.var;
public class VarCapture {
  static class Parent {
    Parent() {
      super();
    }
  }
  static class Child extends Parent {
    Child() {
      super();
    }
  }
  static abstract class NoBounds<T> {
    NoBounds() {
      super();
    }
    static NoBounds<?> asWildcardUnbound() {
      return null;
    }
    static NoBounds<? extends Parent> asWildcardExtends() {
      return null;
    }
    static NoBounds<? super Child> asWildcardSuper() {
      return null;
    }
    abstract T getTypeParam();
  }
  static abstract class Extends<T extends Parent> {
    Extends() {
      super();
    }
    static Extends<?> asWildcardUnbound() {
      return null;
    }
    static Extends<? extends Child> asWildcardExtends() {
      return null;
    }
    static Extends<? super Child> asWildcardSuper() {
      return null;
    }
    abstract T getTypeParam();
  }
  public VarCapture() {
    super();
  }
  public void test() {
    @var java.lang.Object noBoundsUnbound = NoBounds.asWildcardUnbound().getTypeParam();
    @var VarCapture.Parent noBoundsExtends = NoBounds.asWildcardExtends().getTypeParam();
    @var java.lang.Object noBoundsSuper = NoBounds.asWildcardSuper().getTypeParam();
    @var VarCapture.Parent extendsUnbound = Extends.asWildcardUnbound().getTypeParam();
    @var VarCapture.Child extendsExtends = Extends.asWildcardExtends().getTypeParam();
    @var VarCapture.Parent extendsSuper = Extends.asWildcardSuper().getTypeParam();
  }
}
