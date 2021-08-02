

object lamdacal extends App {

    def functionName():Int = {

        5 //value  not a HOF
    }
    //curied function
    //lamda functions
    //(parameters) => {expressions}
    //HOF
    //val x:variableType = value
    //val x:function
    //x:(Int , Int) => Int
    val x = (x:Int,y:Int) => {
        x-y
        x + y
    } //NOT a HOF
    val t = x(4,5)
    println(t)

    //y: () => ()
    val y = () => println("HI") //NOT a HOF

    //z: () => String
    val z = () => "Hi" //NOT a HOF
    println( z )

    //r: (Int) => lamdafunction
    //lamdafunction: (String) => String
//    val r = (x:Int) => {
//        (y:String) => x + y
//    }//HOF

    //return is a functions *** //functions behave as variables
    val r = (x:Int) => (y:String) => x + y //HOF

    //x -> array
    // x.sort().reverse()
    //rr = r(6)
    //rr("Farzan")
    //r(6)("Farzan") <- curried function
    //{ r(6) }("Farzan")
    //{ lamdafunction }("Farzan")
    //lamdafunction("Farzan")
    //{6 + y}.("Farzan")
    //curriedFunciton()()()()()()

    //rr: (String) => String
    //rr = 6 + y
    val rr = r(6)

    //tt = 10 + y
    val tt = r(10)

    println(rr("Farzan"))

    println(tt("Rizwan"))

    //(Int , Int) => Int
    val ax = (a: Int , b: Int ) => a + b
    //(Int , Int) => Int
    val bx = (a: Int , b: Int ) => a * b

    //(functiontype , Int , Int) => String
    //functiontype:(Int , Int) => Int
    //() => f(4,5)
    //Function is a parameter *** //functions behave as variables
    val xy = (f:(Int , Int ) => Int , x:Int , y:Int ) => f(x,y) //HOF

    println("Add")
    //() => f(x,y)
    //(ax , 5,4) => f(5,4)
    //(ax , 5,4) => ax(5,4)
    //(bx , 5,4) => f(5,4)
    //(bx , 5,4) => bx(5,4)


    println( xy( ax, 5,4 ) )
    println("Multi")
    println( xy( bx, 5,4 ) )

    //High Order functions , HOF

    //map , filter , reduce

    val array = Array(1,2,3)
    println(array.map(x => x * 10).mkString(" "))
    println(array.filter(x => x%2==0).mkString(" "))
    println(array.reduce((x,y) => x+y))









}
