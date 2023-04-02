public class VarCapture {

    static class Parent {
    }

    static class Child extends Parent {
    }


    static abstract class NoBounds<T> {
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

    public void test() {
        java.lang.Object noBoundsUnbound = NoBounds.asWildcardUnbound().getTypeParam();
        VarCapture.Parent noBoundsExtends = NoBounds.asWildcardExtends().getTypeParam();
        java.lang.Object noBoundsSuper = NoBounds.asWildcardSuper().getTypeParam();
        VarCapture.Parent extendsUnbound = Extends.asWildcardUnbound().getTypeParam();
        VarCapture.Child extendsExtends = Extends.asWildcardExtends().getTypeParam();
        VarCapture.Parent extendsSuper = Extends.asWildcardSuper().getTypeParam();
    }
}
