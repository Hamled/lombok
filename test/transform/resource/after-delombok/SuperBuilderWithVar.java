import lombok.var;

public class SuperBuilderWithVar {
	public static class Parent {
		int field1;
		@java.lang.SuppressWarnings("all")
		public static abstract class ParentBuilder<C extends SuperBuilderWithVar.Parent, B extends SuperBuilderWithVar.Parent.ParentBuilder<C, B>> {
			@java.lang.SuppressWarnings("all")
			private int field1;
			/**
			 * @return {@code this}.
			 */
			@java.lang.SuppressWarnings("all")
			public B field1(final int field1) {
				this.field1 = field1;
				return self();
			}
			@java.lang.SuppressWarnings("all")
			protected abstract B self();
			@java.lang.SuppressWarnings("all")
			public abstract C build();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public java.lang.String toString() {
				return "SuperBuilderWithVar.Parent.ParentBuilder(field1=" + this.field1 + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		private static final class ParentBuilderImpl extends SuperBuilderWithVar.Parent.ParentBuilder<SuperBuilderWithVar.Parent, SuperBuilderWithVar.Parent.ParentBuilderImpl> {
			@java.lang.SuppressWarnings("all")
			private ParentBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected SuperBuilderWithVar.Parent.ParentBuilderImpl self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public SuperBuilderWithVar.Parent build() {
				return new SuperBuilderWithVar.Parent(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		protected Parent(final SuperBuilderWithVar.Parent.ParentBuilder<?, ?> b) {
			this.field1 = b.field1;
		}
		@java.lang.SuppressWarnings("all")
		public static SuperBuilderWithVar.Parent.ParentBuilder<?, ?> builder() {
			return new SuperBuilderWithVar.Parent.ParentBuilderImpl();
		}
	}
	public static void test() {
		@var Parent shouldBeParent = Parent.builder().field1(5).build();
	}
}
