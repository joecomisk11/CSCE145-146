/*
 * Created by Joe Comiskey
 */
public class StringHelperTester {

	public static void main(String[] args) {
		System.out.println("Welcome to the String Helper Tester!");
		System.out.println("\nTesting has all unique characters with \"facetiously\"");
		System.out.println(StringHelper.hasAllUniqueCharacters("facetiously"));
		System.out.println("Testing has all unique characters with \"banana\"");
		System.out.println(StringHelper.hasAllUniqueCharacters("banana"));
		System.out.println("\nTesting Mesh Strings with \"harp\" and \"fiddle\"");
		System.out.println(StringHelper.meshString("harp", "fiddle"));
		System.out.println("\nTesting Replace Vowels with Oodle with \"burrito\"");
		System.out.println(StringHelper.replaceVowelswithOodle("burrito"));
		System.out.println("\nTesting weight with \"heavy\"");
		System.out.println(StringHelper.weight("heavy"));
		System.out.println("\nTesting weight with \"light\"");
		System.out.println(StringHelper.weight("light"));

	}

}
