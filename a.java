    BYTES - The number of bytes used to represent an int value (4 bytes).
    TYPE - Represents the Class instance of int.
    MAX_VALUE - The maximum value an int can hold (2^31 - 1).
    MIN_VALUE - The minimum value an int can hold (-2^31).
    SIZE - The number of bits used to represent an int value (32 bits).

Methods:
Mathematical & Bitwise Operations

    bitCount(int i) - Returns the number of 1-bits in the two’s complement binary representation of i.
    getInteger(String nm) - Retrieves an Integer value from system properties.
    highestOneBit(int i) - Returns the highest one-bit value in the given integer.
    lowestOneBit(int i) - Returns the lowest one-bit value in the given integer.
    max(int a, int b) - Returns the larger of two int values.
    min(int a, int b) - Returns the smaller of two int values.
    numberOfLeadingZeros(int i) - Returns the number of leading zeros in the binary representation.
    numberOfTrailingZeros(int i) - Returns the number of trailing zeros in the binary representation.
    parseInt(String s) - Converts a String to an int.
    parseUnsignedInt(String s) - Parses an unsigned int from a string.
    remainderUnsigned(int dividend, int divisor) - Returns the remainder of an unsigned division.
    reverse(int i) - Returns the value obtained by reversing the bits of i.
    reverseBytes(int i) - Returns the value obtained by reversing the bytes of i.
    rotateLeft(int i, int distance) - Rotates the bits of i left by the specified distance.
    rotateRight(int i, int distance) - Rotates the bits of i right by the specified distance.
    signum(int i) - Returns -1, 0, or 1 depending on whether i is negative, zero, or positive.
    sum(int a, int b) - Returns the sum of two int values.
    toBinaryString(int i) - Returns the binary string representation of i.
    toHexString(int i) - Returns the hexadecimal string representation of i.
    toOctalString(int i) - Returns the octal string representation of i.
    toUnsignedLong(int i) - Converts an int to an unsigned long.
    toUnsignedString(int i) - Converts an int to an unsigned decimal string.
    toString(int i) - Converts an int to a string.
    valueOf(int i) - Returns an Integer instance representing i.

Object Methods (Inherited from Object Class)

    byteValue() - Returns the value of this Integer as a byte.
    compareTo(Integer anotherInteger) - Compares two Integer objects numerically.
    doubleValue() - Returns the value as a double.
    equals(Object obj) - Compares this Integer with another object.
    floatValue() - Returns the value as a float.
    getClass() - Returns the Class instance of this object.
    hashCode() - Returns the hash code for this Integer.
    intValue() - Returns the value as an int.
    longValue() - Returns the value as a long.
    shortValue() - Returns the value as a short.




    charAt(int index) - Returns the character at the specified index.
    codePointAt(int index) - Returns the Unicode code point at the specified index.
    codePointBefore(int index) - Returns the Unicode code point before the specified index.
    codePointCount(int beginIndex, int endIndex) - Returns the number of Unicode code points between two indices.

Comparison & Equality:

   1 -1 0 compareTo(String anotherString) - Compares two strings lexicographically.
   1 -1 0 compareToIgnoreCase(String str) - Compares two strings lexicographically, ignoring case differences.
    true false contentEquals(CharSequence cs) - Compares the string with the specified CharSequence for content equality.
   true false equals(Object obj) - Compares this string to another object.
   true false equalsIgnoreCase(String anotherString) - Compares two strings ignoring case differences.

Search Operations:

   -1 indexOf(String str) - Returns the index of the first occurrence of the substring.
   -1 lastIndexOf(String str) - Returns the index of the last occurrence of the substring.
   true false contains(CharSequence s) - Checks if the string contains the specified sequence of characters.
   true false matches(String regex) - Checks if the string matches the given regular expression.
    true false regionMatches(...) - Tests if two string regions are equal.
    true false startsWith(String prefix) - Checks if the string starts with the specified prefix.
    true false endsWith(String suffix) - Checks if the string ends with the specified suffix.

String Modification & Formatting:

    concat(String str) - Concatenates the specified string to the end of this string.
    replace(CharSequence target, CharSequence replacement) - Replaces all occurrences of the target sequence with the replacement.
    replaceAll(String regex, String replacement) - Replaces each substring matching the given regex with the specified replacement.
    replaceFirst(String regex, String replacement) - Replaces the first substring matching the given regex with the specified replacement.
    substring(int beginIndex) - Returns a substring starting from the given index.
    subSequence(int beginIndex, int endIndex) - Returns a character sequence between the given indices.
    repeat(int count) - Returns a string repeated the specified number of times.
    indent(int n) - Adjusts the indentation of each line in the string.
    strip() - Removes leading and trailing whitespace.
    stripLeading() - Removes leading whitespace.
    stripTrailing() - Removes trailing whitespace.
    stripIndent() - Removes common leading whitespace from all lines.
    translateEscapes() - Converts escape sequences into their character representations.

Case Conversion:

    toUpperCase() - Converts the string to uppercase.
    toLowerCase() - Converts the string to lowercase.

Whitespace & Trimming:

    trim() - Removes leading and trailing spaces.
    isBlank() - Returns true if the string is empty or contains only white spaces.
    isEmpty() - Returns true if the string is empty.

Splitting & Joining:

    split(String regex) - Splits the string using the given regex.
    splitWithDelimiters(String regex) - A variant of split that includes delimiters in the result.
    lines() - Returns a stream of lines from the string.

Character Conversion & Extraction:

    getBytes() - Converts the string to a byte array.
    getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) - Copies characters from the string into the provided array.
    toCharArray() - Converts the string to a character array.

Object & Utility Methods:

    intern() - Returns the canonical representation of the string from the string pool.
    hashCode() - Returns the hash code for the string.
    getClass() - Returns the runtime class of the object.
    describeConstable() - Returns an optional ConstantDesc representation.
    resolveConstantDesc(MethodHandles.Lookup lookup) - Resolves the constant description of this instance.
    transform(Function<String, R> function) - Applies a transformation function to the string.


 Arrays:-
1.  Sorting Methods

    sort(int[] a) - Sorts the array in ascending order.
    sort(int[] a, int fromIndex, int toIndex) - Sorts the specified range of the array.
    sort(Object[] a) - Sorts an array of objects based on their Comparable implementation.
    sort(Object[] a, Comparator<? super T> c) - Sorts an array of objects using a custom comparator.
    parallelSort(int[] a) - Sorts an array in parallel for better performance.
    parallelSort(int[] a, int fromIndex, int toIndex) - Parallel sorts a specified range of the array.

2. Searching Methods

    binarySearch(int[] a, int key) - Searches for a key in a sorted array using binary search.
    binarySearch(int[] a, int fromIndex, int toIndex, int key) - Searches a key in a sorted sub-array using binary search.
    binarySearch(Object[] a, T key, Comparator<? super T> c) - Searches an object in a sorted array using a custom comparator.

3. Filling Methods

    fill(int[] a, int value) - Fills the entire array with a specified value.
    fill(int[] a, int fromIndex, int toIndex, int value) - Fills a specific range in the array with a specified value.

4. Copying & Resizing Methods

    copyOf(int[] original, int newLength) - Creates a new array by copying the original array up to the specified length.
    copyOfRange(int[] original, int from, int to) - Copies a range from the original array into a new array.

5. Converting Arrays to String & List

    toString(int[] a) - Converts the array into a string representation.
    deepToString(Object[] a) - Converts a multidimensional array into a string.
    asList(T... a) - Converts an array into a List<T>, which is backed by the array.

6. Checking Equality & Hashing

    equals(int[] a, int[] b) - Compares two arrays for equality.
    deepEquals(Object[] a, Object[] b) - Compares two multidimensional arrays for deep equality.
    hashCode(int[] a) - Returns the hash code of an array.
    deepHashCode(Object[] a) - Returns the deep hash code of a multidimensional array
