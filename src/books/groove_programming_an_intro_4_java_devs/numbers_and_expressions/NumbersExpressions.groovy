package books.groove_programming_an_intro_4_java_devs.numbers_and_expressions

class NumbersExpressions {
    static void main(String[] args) {
        println 1.doubleValue() // 1.0
        // classes
        NumbersExpressions nums = new NumbersExpressions()
        Integer age = new Integer(25)
        println age  // 25
        println nums.getAge()  // 25
        println nums.isYounger
        println (++age) // 26
        println (--age) // 25
        println (age++) // 25

        println 5 <=> 3 // 5.compareTo(3)
        println Integer.getInteger("1") // Determines the integer value of the system property with the specified name.
        println Integer.digits  // 0123456789abcdefghijklmnopqrstuvwxyz

    }


    def age = 25  // is equivalent to: Integer age = new Integer(25)
    def age2 = 55
    def isYounger = age < age2
    boolean isYoungerExplicitly = age < age2

}
