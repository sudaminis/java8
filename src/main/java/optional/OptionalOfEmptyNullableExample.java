package optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {
    private static Optional<String> getOptionalOfNullable() {
        return Optional.ofNullable("hello");
    }

    private static Optional<String> getOptionalOf() {
        return Optional.of("hello");
    }

    private static Optional<String> getOptionalEmpty() {
        return Optional.empty();
    }
    public static void main(String[] args) {
        System.out.println(getOptionalOfNullable());
        System.out.println(getOptionalOf());
        System.out.println(getOptionalEmpty());

    }
}
