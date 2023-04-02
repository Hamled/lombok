import lombok.var;
public class SuperBuilderWithVar {
  public static @lombok.experimental.SuperBuilder class Parent {
    public static abstract @java.lang.SuppressWarnings("all") class ParentBuilder<C extends SuperBuilderWithVar.Parent, B extends SuperBuilderWithVar.Parent.ParentBuilder<C, B>> {
      private @java.lang.SuppressWarnings("all") int field1;
      public ParentBuilder() {
        super();
      }
      /**
       * @return {@code this}.
       */
      public @java.lang.SuppressWarnings("all") B field1(final int field1) {
        this.field1 = field1;
        return self();
      }
      protected abstract @java.lang.SuppressWarnings("all") B self();
      public abstract @java.lang.SuppressWarnings("all") C build();
      public @java.lang.Override @java.lang.SuppressWarnings("all") java.lang.String toString() {
        return (("SuperBuilderWithVar.Parent.ParentBuilder(field1=" + this.field1) + ")");
      }
    }
    private static final @java.lang.SuppressWarnings("all") class ParentBuilderImpl extends SuperBuilderWithVar.Parent.ParentBuilder<SuperBuilderWithVar.Parent, SuperBuilderWithVar.Parent.ParentBuilderImpl> {
      private ParentBuilderImpl() {
        super();
      }
      protected @java.lang.Override @java.lang.SuppressWarnings("all") SuperBuilderWithVar.Parent.ParentBuilderImpl self() {
        return this;
      }
      public @java.lang.Override @java.lang.SuppressWarnings("all") SuperBuilderWithVar.Parent build() {
        return new SuperBuilderWithVar.Parent(this);
      }
    }
    int field1;
    protected @java.lang.SuppressWarnings("all") Parent(final SuperBuilderWithVar.Parent.ParentBuilder<?, ?> b) {
      super();
      this.field1 = b.field1;
    }
    public static @java.lang.SuppressWarnings("all") SuperBuilderWithVar.Parent.ParentBuilder<?, ?> builder() {
      return new SuperBuilderWithVar.Parent.ParentBuilderImpl();
    }
  }
  public SuperBuilderWithVar() {
    super();
  }
  public static void test() {
    @var SuperBuilderWithVar.Parent shouldBeParent = Parent.builder().field1(5).build();
  }
}
