fun main() {
    println("Bem-vindo ao hora de codar 3! Escolha um exercício")

    println("Exercício 1")
    println("Exercício 2")
    println("Exercício 3")
    println("Exercício 4")
    println("Exercício 4")
    println("Exercício 5")
    println("Exercício 6")
    println("Exercício 7")
    println("Exercício 8")
    println("Exercício 9")
    println("Exercício 10")
    println("Exercício 11")

    var exercicio = readln().toInt()

    when(exercicio) {
        1 -> exercicio_1()
        2 -> exercício_2()
        3 -> exercicio_3()
        4 -> exercicio_4()
        5 -> exercicio_5()
        6 -> exercicio_6()
        7 -> exercicio_7()
        8 -> exercicio_8()
        9 -> exercicio_9()
        10 -> exercicio_10()
        11 -> exercicio_11()
    }

}

fun exercicio_1(){
    var contador = 30
    var limite = 0

    println("Contagem regressiva!")

    while (contador > limite)
        println(contador--)
    println("BOOOOMMM!")
}

fun exercício_2(){
    print("Digite o primeiro valor: ")
    val numero_1 = readLine()!!.toDouble()

    var numero_2: Double
    do {
        print("Digite o segundo valor (maior que 0): ")
        numero_2 = readLine()!!.toDouble()
    } while (numero_2 <= 0)

    val resultado = numero_1 / numero_2
    println("Resultado da divisão: $resultado")



}

fun exercicio_3(){
    var contador = 10
    var limite = 0

    while (contador > limite){
        println(contador--)
    }
}

fun exercicio_4(){
    var soma = 0
    var contador = 0

    for (i in 15..100){
        soma += i
        contador++
    }

    var media = soma.toDouble() / contador
    println("A média dos números de 15 até 100 é $media")
}

fun exercicio_5(){
    println("Digite o primeiro número: ")
    var num_1 = readln().toInt()

    println("Digite o segundo número: ")
    var num_2 = readln().toInt()

    var soma = 0
    var contador = 0

    for (i in num_1..num_2){
        soma += i
        contador++
    }

    val media = soma.toDouble() / contador
    println("A média dos números entre primeiro e o segundo número é: $media")
}

fun exercicio_6(){
    var quantidade_alunos_aprovados = 0
    var continuar: String

    do {
        println("Digite a primeira nota: ")
        var nota_1 = readln()!!.toDouble()

        println("Digite a segunda nota: ")
        var nota_2 = readln()!!.toDouble()

        var media_aluno = (nota_1 + nota_2) /2
        println("A média do aluno é: $media_aluno")

        if (media_aluno >= 9.5) {
            println("Parabéns! Aluno aprovado")
            quantidade_alunos_aprovados++
        }else{
            println("Que pena, aluno reprovado")
        }

        println("Deseja calcular a média de outro aluno ? (S/N)")
        continuar = readln()!!.uppercase()


    }while (continuar == "S")

    println("Qauntidades de alunos aprovados: $quantidade_alunos_aprovados")
}

fun exercicio_7(){
    var soma = 0.0
    var nota: Double

    for (i in 1..6) {
        print("Digite a nota $i (0 a 10): ")
        nota = readLine()!!.toDouble()

        while (nota < 0 || nota > 10) {
            print("Nota inválida! Digite novamente: ")
            nota = readLine()!!.toDouble()
        }

        soma += nota
    }

    val media = soma / 6
    println("A média do aluno é: $media")
}

fun exercicio_8(){
    println("Digite um número N (o número precisa ser maior que zero)")
    var N = readln().toInt()

    for (i in 1..N){
        println(i)
    }
}

fun exercicio_9(){
    for (i in 101..110){
        println(i)
    }
}

fun exercicio_10() {
    var valor: Int
    var dentro = 0
    var fora = 0

    for (i in 1..10) {
        print("Digite o ${i}º valor: ")
        valor = readLine()!!.toInt()

        if (valor in 24..42) {
            dentro++
        } else {
            fora++
        }
    }

    println("Valores entre 24 e 42: $dentro")
    println("Valores fora do intervalo: $fora")
}

fun exercicio_11(){
    print("Digite o valor de N: ")
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        println("\nTabuada do $i:")
        for (j in 1..10) {
            println("$i x $j = ${i * j}")
        }
    }
}

