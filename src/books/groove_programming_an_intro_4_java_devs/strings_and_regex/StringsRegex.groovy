package books.groove_programming_an_intro_4_java_devs.strings_and_regex

class StringsRegex {
    static void main(String[] args) {
        def age = 55
        println 'My age is ${age}'
        println "My age is ${age}"
        println """My age is ${age}"""

        def greeting = 'Hello world'

        println greeting[4] // o - index from start
        println greeting[-1] // d - index from end
        println greeting[1..2] // el - slice with inclusive range (see Chapter 4)3
        println greeting[1..<3] // el - slice with exclusive range
        println greeting[4..2] // oll - backward slice
        println greeting[4..<2] // ol - backward slice
        println greeting[4, 1, 6] // oew - selective slicing by indexes

        def regex = ~'cheese' // ~”regex” expression
        'cheesecake' =~ 'cheese'
        !('cheesecake' =~ 'fromage') // the String operand on the left is matched against the regular expression operand on the right
        'cheesecake' =~ regex

        'cheesecake' ==~ 'cheese' // The stricter operator ==~ requires an exact match
    }



}
