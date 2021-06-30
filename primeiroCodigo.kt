import java.util.Scanner
fun main() {
     println("Eu sei codar em Kotlin!")
     println("Olha essa calculadora de inteiros:")
     val ler = Scanner(System.`in`)
     println("Que operação você deseja fazer?")
     println("1-soma 2-subtração 3-multiplicação 4-divisão 5-sair")
     var escolha = ler.nextInt()


     when(escolha){
          1 -> {println("Digite o primeiro número")
               var a = ler.nextInt()
               println("Digite o segundo número")
               var b = ler.nextInt()
               var s = soma(a,b)
               println("$a + $b = $s")}
          2 -> {println("Digite o primeiro número")
               var a = ler.nextInt()
               println("Digite o segundo número")
               var b = ler.nextInt()
               var s = subt(a,b)
               println("$a - $b = $s")}
          3 -> {println("Digite o primeiro número")
               var a = ler.nextInt()
               println("Digite o segundo número")
               var b = ler.nextInt()
               var m=mult(a,b)
               println("$a * $b = $m")}
          4 -> {println("Digite o primeiro número")
               var a = ler.nextInt()
               println("Digite o segundo número")
               var b = ler.nextInt()
               var c = div(a,b)
               var r = resto(a,b)
               println("$a / $b = $c e sobram $r")}
          5 -> println("Obrigada pela atenção")
     }
     
    }

fun soma(a: Int, b: Int) = a + b
fun subt(a: Int, b: Int) = a - b
fun mult(a: Int, b: Int) = a * b
fun div(a: Int, b: Int) = a / b
fun resto(a: Int, b: Int) = a % b