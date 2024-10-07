enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome:String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    	inscritos.add(usuario)
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
	val usuario1 = Usuario(nome = "Joao")
    val usuario2 = Usuario(nome = "Pedro")
    val usuario3 = Usuario(nome = "Rodrigo")
    
    val conteudoEducacional1 = ConteudoEducacional(nome = "Kotlin Orientado a Objeto")
    val conteudoEducacional2 = ConteudoEducacional(nome = "Kotlin Sintaxe Basico")
    val conteudoEducacional3 = ConteudoEducacional(nome = "Kotlin Funcoes Basico")
    
    val listConteudo = listOf(conteudoEducacional1)
    
    val formacao1 = Formacao(nome = "Kotlin", conteudos = listConteudo)
    formacao1.matricular (usuario1)
    formacao1.matricular (usuario2)
    formacao1.matricular (usuario3)

	println(formacao1.inscritos)

}