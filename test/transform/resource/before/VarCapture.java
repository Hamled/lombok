import lombok.var;

public class VarCapture {
    static class Parent {}
    static class Child extends Parent {}

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
        var noBoundsUnbound = NoBounds.asWildcardUnbound().getTypeParam();
        var noBoundsExtends = NoBounds.asWildcardExtends().getTypeParam();
        var noBoundsSuper = NoBounds.asWildcardSuper().getTypeParam();

        var extendsUnbound = Extends.asWildcardUnbound().getTypeParam();
        var extendsExtends = Extends.asWildcardExtends().getTypeParam();
        var extendsSuper = Extends.asWildcardSuper().getTypeParam();
    }
}
