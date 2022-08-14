class Cliente(_firstName: String, _apelido: String, _idade: Int, _saldo: Int, _conta: Int) {
    val nome = _firstName
    var apelido = _apelido
    var idade = _idade
    var saldo = _saldo
    val conta = _conta

    init {
        detalheConta()
    }

    fun detalheConta() {
        println("-----------STATUS------------------")
        println("Conta Nº: $conta")
        println("Titular: $nome $apelido")
        println("Idade: $idade")
        println("Saldo: $saldo")
        println("-----------------------------------")
        println("==================================")
    }

    fun depositar() {
        print("Montante a Deositar: ")
        var amount = readln().toInt()
        println("Operação bem sucedida")
        saldo += amount
        detalheConta()
    }

    fun levantar() {
        print("Montante a levantar: ")
        var amount = readln().toInt()
        if (amount > saldo) {
            println("Opsss, Não há saldo suficiente")
        }
        else {
            saldo -= amount
            println("Operação bem sucedida")
        }
        detalheConta()
    }

}