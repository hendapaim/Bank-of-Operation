var cliente: Cliente? = null
fun criarConta(_firstName: String, _apelido: String, _idade: Int, _saldo: Int, _conta: Int) {
    cliente = Cliente(_firstName, _apelido, _idade, _saldo, _conta)
}

fun telaInicial() {
    println("             Bem-Vindo             ")
    println(" 1. Criar conta nova ")
    println(" 2. Consultar Dados")
    println(" 3. Depositar ")
    println(" 4. Levantar ")
    println(" 5. Terminar operadoções")
}

fun main() {
    println("======= Bank of Operation ========")

    var istrue = true;
    while (istrue) {
        telaInicial()
        print("Escolha uma opção: ")
        var op = readln().toInt();

        when (op) {
            1 -> criarConta("Henda ", "Paim", 25, 5_000, 1);
            2 -> cliente?.detalheConta()
            3 -> cliente?.depositar()
            4 -> cliente?.levantar()
            5 -> istrue = false
            else -> "Escolha uma opção"
        }
    }

}
