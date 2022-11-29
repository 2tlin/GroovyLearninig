package lists_maps_ranges

class ListsMapsRanges {
    static void main(String[] args) {
        def numbers = [11, 12, 13, 14]  // list with four items
        println numbers [0]  // 11
        println numbers [3]  // 14

        println numbers [-1] // 14
        println numbers [-2] // 13

        println ([11, 12, 13, 14][2])  // 13
        println numbers [0..2] // [11, 12, 13]
        println numbers [1..<3] // [12, 13]

        println numbers [1] = 22 // [11, 22, 13, 14]
        println numbers [1] = [33, 44] // [11, [33, 44], 13, 14]
        println numbers // [11, [33, 44], 13, 14]

        // List methods
        [11, 12, 13, 14].add(15) // [11, 12, 13, 14, 15]
        [11, 12, 13, 14].add(2, 15) // [11, 12, 15, 13, 14]
        [11, 12, 13, 14].add([15, 16]) // [11, 12, 13, 14, 15, 16]
        [11, 12, 13, 14].get(1) // 12
        [11, 12, 13, 14].isEmpty() // false
        [14, 13, 12, 11].size() // 4
        [11, 12, [13, 14]].flatten() // [11, 12, 13, 14]
        [11, 12, 13, 14].getAt(1) // 12
        [11, 12, 13, 14].getAt(1..2) // [12, 13]
        [11, 12, 13, 14].getAt([2, 3]) // [13, 14]
        [11, 12, 13, 14].intersect([13, 14, 15]) // [13, 14]
        [11, 12, 13, 14].pop() // 14
        [11, 12, 13, 14].reverse() // [14, 13, 12, 11]
        [14, 13, 12, 11].sort() // [11, 12, 13, 14]

        // 4.3 maps

        def myData = ["Name": "Dmitry", "Age": 55 ]
        println myData["Age"] // 55

        def x = 1
        def y = 2
        def m = [x : y, y : x]

        // Observe that if the key in a Map literal is a variable name, then it is interpreted as a String value. In the example:
        println m  // m = [‘x’ : 2, ‘y’ : 1]

        // 4.4 map methods

        def mp = ['Ken' : 2745, 'John' : 2746, 'Sally' : 2742]
        mp.put('Bob', 2713)  // [Bob:2713, Ken:2745, Sally:2742, John:2746]
        mp.containsKey('Ken')  // true
        mp.get('David', 9999)  // 9999
        mp.get('Sally')  // 2742
        mp.get('Billy')  // null
        mp.keySet()  // [David, Bob, Ken, Sally, John]
        mp.size()  // 4
        mp['Ken']  // 2745


        1900..1999 // twentieth century (inclusive Range)
        2000..<2100 // twenty-ﬁrst century (exclusive Range)
        'A'..'D' // A, B, C, and D
        10..1 // 10, 9, ..., 1
        'Z'..'X' // Z, Y, and X











    }


}
