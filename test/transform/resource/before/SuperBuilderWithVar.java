import lombok.var;

public class SuperBuilderWithVar {
	@lombok.experimental.SuperBuilder
	public static class Parent {
		int field1;
	}

	public static void test() {
		var shouldBeParent = Parent.builder().field1(5).build();
	}
}
