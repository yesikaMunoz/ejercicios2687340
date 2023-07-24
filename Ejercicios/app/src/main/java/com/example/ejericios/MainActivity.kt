package com.example.ejericios
/*
fun main(){

//calcular el area de un triangulo
   /* println("Calcular área del triángulo")

    println("Ingresa la base: ")

    val base: Int = readLine()!!.toInt()

    println("Ingresa la altura: ")

    val height: Int = readLine()!!.toInt()

    var area = (base * height) / 2

    println("El área es: $area")*/


    //  Ingresar dos números por teclado y sumarlos.

              /*  println("sumas dos numeros")
                println(" ingresa el numero 1: ")
                val n1:Int = readLine()!!.toInt()
                println("ingrese el Numero 2: ")
                val n2:Int = readLine()!!.toInt()
                val sum=n1+n2
              println(" la suma de los dos  numeros el igual a $sum")*/


  //  Ingresar un número y visualizar el número elevado al cuadrado

     /* println("el cuadrado de un numero ")
      println("digite el numero que va a elevar a l cuadrado :")

      val n1:Int = readLine()!!.toInt()
      val r=n1*n1
      println("$n1 elevado a el cuadrado es $r")*/

// . Escribir un algoritmo que convierta de euros a dólares
     /*
     println("conversor de moneda")
     val dol : Double = 1.12
    println("digite la cantidad de euros : ")
     val eu: Int = readLine()!!.toInt()
    val vl=eu*dol
    println(" $eu en dolares es $vl")
    */

//  Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del
//perímetro
    /*
  println("calcula el area de de u cuadrado y el perimetro en base a un lado ")
    println("digite el lado de el cadruadrado de cm : ")
     val l:Int= readLine()!!.toInt()
     val area= l*l
     val perimeter=l*4
    println("el area de el cuadrado es $area \n el perimetro es $perimeter ")*/

   // Escribir un algoritmo que determine el área y el volúmen de un cilindro.
   // v π r² h
   // a  2π r h + 2π r²
/*

    println(" algoritmo que calcula el area y el volumen de un cilindro segun su altura y radio ")
    println("digite la altura de el  cilindro en cm  : ")
    val h: Double = readLine()!!.toDouble()
    println("digite el  radio de el  cilindro en cm  : ")
    val rad:Double= readLine()!!.toDouble()
    val volume = PI*(rad).pow(2)*h
    val area =  2*(PI*rad).pow(2)+ (PI*2*rad*h)
   println("el area de el  cilindro es $area \n el volumen de el cilindro es $volume")*/


    // . Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y
    //el área (pi*r)^2 del círculo inscrito.

/*    println("calcular el la longitud y area de una circuferencia")
    println("Digite el radio de la circuferencia cm³ ")
    val r:Double= readLine()!!.toDouble()
    val  area= PI*(r).pow(2)
    val length= 2* PI*r
    println("el area de la circuferencia es  $area cm³  \n la longitud de la circuferencia es $length cm³")*/

    // Calcular el promedio de tres (3) números ingresados por teclado
    /*  println("Calcular el promedio de 3 numeros ")

    println("digite el 1er numero : ")
    val n1:Int= readLine()!!.toInt()
    println("digite el 2do el numero : ")
    val n2:Int= readLine()!!.toInt()
    println("digite el 3er numero : ")
    val n3:Int= readLine()!!.toInt()

    val sum=n1+n2+n3
    val prom=sum/3
    println("el promedio de los numeros es $prom") */


}*/




/*fun main(){

//    1. Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo.

    println("digite un numero")
    val n : Int= readLine()!!.toInt()
    if (n >0) {
        println("el numero es positivo")
    }
    else if (n<0) {
        println("el numero es negativo")
    }
    else if (n.equals(0)){
        println("el numero es cero ")
    }*/
    // 2 Escribir un algoritmo que reciba dos números por teclado y diga cuál es el mayor y cuál el menor.

    /*  println(" digite el  Primer numero : ")
     val  n1:Int = readLine()!!.toInt()
     println(" digite el  Segundo numero 2 : ")
      val n2:Int = readLine()!!.toInt()

     if (n1 > n2) {
     println("el numero mayor es el primero $n1")
     }
     else if (n1 < n2) {
         println("el numero mayor es el segundo  $n2")
     }
   else {
       println("los numeros son iguales ")
   }
 */


    // 3 Escriba un programa que lea tres números enteros positivos y que calcule e imprima en  pantalla el menor y el mayor de ellos
    /*
        println("digite el primer numero : ")
         val n1 :Int= readLine()!!.toInt()
        println("digite el  segundo  numero : ")
        val n2 :Int= readLine()!!.toInt()
        println("digite el tercer  numero : ")
        val n3 :Int= readLine()!!.toInt()

         var  nums = arrayOf(n1,n2,n3)
          var nm = nums.max()
         var  nmen=nums.min()
        println("el numero mayor es $nm  \n el numero menor es $nmen ")
        */

    // 2 Dados dos números A y B, sumarlos si A es menor que B o sino restarlos

    /*  println(" Digite el numero A " )
      val a: Int = readLine()!!.toInt()
      println(" Digite el numero B " )
     val  b:Int = readLine()!!.toInt()
    if(a<b){
        val sum = a+b
        println(" la sumade $a + $b es $sum")
    }
      else{
           val res=a-b
        println(" la resta de $a + $b es $res")

    } */

    // 5. Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero
    //no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es
    //posible.

    /*
        println(" digite el numero A : ")
        val a : Int = readLine()!!.toInt()
        println(" digite el numero b : ")
        val b : Int = readLine()!!.toInt()

        if( a >0 && b>0 ) {
            val result = a / b
            println(" el resultado de la division entre $a y $b es $result")
        }
        else{
            println("la division entre 0 no esta definida ")
        }
    */

    // 6  Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario
    //multiplicarlos

    /* println("Digite el numero A ")
     val  A :Int = readLine()!!.toInt()
     println("Digite el numero B ")
     val  B :Int = readLine()!!.toInt()
     if(A<0 || B<0 ){
          val sum = A+B
         println("la suma entre $A + $B es $sum ")
     }
   else{
       val multiply = A*B
          println("la multiplicacion entre $A*$B es $multiply")

   }


    // 8  Escribir un algoritmo que determine si un año es bisiesto o no
    println("escriba el año el cual desea consultar si es bisiesto o no  ")
    val year:Int = readLine()!!.toInt()
    if ( year%4 == 0 ){
        println("el año $year es biciesto ")
    }
    else{
        println(" el año no es biciesto ")
    }


}*/
//imprimir todos los múltiplos de 3 que hay entre 1 y 100.
/*fun main() {
    // Iterar desde 1 hasta 100
    for (i in 1..100) {
        // Verificar si el número es múltiplo de 3
        if (i % 3 == 0) {
            println(i) // Imprimir el número si es múltiplo de 3
        }
    }
}*/

//Imprimir los números impares entre 0 y 100.
/*fun main() {
    // Iterar desde 1 hasta 100
    for (i in 1..100) {
        // Verificar si el número es impar
        if (i % 2 != 0) {
            println(i) // Imprimir el número si es impar
        }
    }
}*/
// Imprimir los números pares del 1 al 100.
/*fun main() {
    // Iterar desde 1 hasta 100
    for (i in 1..100) {
        // Verificar si el número es par
        if (i % 2 == 0) {
            println(i) // Imprimir el número si es par
        }
    }
}*/

// Escribir un programa que imprima por pantalla los cuadrados de los números del 1 al 30.
/*fun main() {
    // Iterar desde 1 hasta 30
    for (i in 1..30) {
        // Calcular el cuadrado de cada número
        val cuadrado = i * i
        println(cuadrado) // Imprimir el cuadrado de cada número
    }
}*/

//Escribir un programa que sume los cuadrados de los cien primeros números naturales,
//mostrando el resultado en pantalla
/*fun main() {
    var sumaCuadrados = 0

    // Iterar desde 1 hasta 100
    for (i in 1..100) {
        // Calcular el cuadrado de cada número y sumarlo a la variable sumaCuadrados
        sumaCuadrados += i * i
    }

    // Mostrar el resultado en pantalla
    println("La suma de los cuadrados de los cien primeros números naturales es: $sumaCuadrados")
}*/

//Dados dos números naturales, el primero menor que el segundo, generar y mostrar todos los
//números comprendidos entre ellos en secuencia ascendente.
/*fun main() {
    val numeroInicial = 1
    val numeroFinal = 10

    // Verificar que el primer número sea menor que el segundo
    if (numeroInicial < numeroFinal) {
        // Iterar desde el número inicial hasta el número final (ambos inclusive)
        for (i in numeroInicial..numeroFinal) {
            println(i) // Mostrar el número actual en pantalla
        }
    } else {
        println("El primer número debe ser menor que el segundo.")
    }
}*/
//Sumar todos los números que se digitan por teclado mientras no sea cero.
/*fun main() {
    var suma = 0
    var numero: Int

    do {
        println("Ingresa un número (Ingresa 0 para terminar): ")
        numero = readLine()?.toIntOrNull() ?: 0

        if (numero != 0) {
            suma += numero
        }
    } while (numero != 0)

    println("La suma de los números ingresados es: $suma")
}*/