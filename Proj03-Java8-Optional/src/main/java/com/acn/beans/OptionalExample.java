package com.acn.beans;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		String msg[] = new String[10];
		/*
		 * String lc = msg[5].toUpperCase(); System.out.println(lc);
		 */

		msg[5] = "JavaOptionalExample";

		/*
		 * if (optionalCheck.isPresent()) { String lc = msg[5].toUpperCase();
		 * System.out.println(lc); } else { System.out.println("String is null"); }
		 */

		Optional<String> optionalCheck1 = Optional.empty();
		// System.out.println(optionalCheck1);
		Optional<String> value = Optional.of(msg[5]);
		System.out.println(value.filter((s) -> s.equals("abc")));
		System.out.println(value.filter((s) -> s.equals("JavaOptionalExample")));
		System.out.println("Getting value: " + value.get());
		System.out.println("Is vaule present: " + value.isPresent());
		System.out.println("Nullable Optional: " + Optional.ofNullable(msg[5]));
		System.out.println("orElse: "+value.orElse("ValusenotPresent"));
		
		if (optionalCheck1.isPresent()) {
			System.out.println(optionalCheck1.get());

		}

	}
}