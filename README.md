# Teste Técnico Java - Jessie Moura

Olá\! Este projeto é a minha solução para o teste prático de programação em Java. Foi uma jornada incrível de aprendizado e depuração, focada em entregar um código não apenas funcional, mas também limpo, organizado e seguindo as melhores práticas.

## ✨ Tecnologias e Ferramentas

- **Java 17**: A linguagem de programação que molda o projeto.
- **Java Streams**: Utilizado para manipular coleções de forma eficiente e concisa.
- **BigDecimal**: Essencial para garantir a precisão de valores monetários.
- **java.time**: A API moderna de datas, evitando as complexidades das versões legadas.
- **Scripts de Automação (`.bat` e `.sh`)**: Criados para facilitar a compilação e execução do projeto, garantindo uma experiência de teste perfeita, independentemente do sistema operacional.

## 📂 Estrutura e Arquitetura do Projeto

O projeto segue um design de software com **separação de responsabilidades** 🧠, o que o torna mais fácil de manter e escalar:

- `Pessoa.java` & `Funcionario.java`: Nossas classes de **modelo**, que representam as entidades do negócio. `Funcionario` herda de `Pessoa`, um exemplo claro de herança em POO.
- `FuncionarioService.java`: Uma classe de **serviço**, responsável por toda a lógica de negócio (adicionar, remover, atualizar salários, etc.).
- `Utils.java`: Uma classe de **utilidade**, que centraliza funcionalidades auxiliares (como limpar o terminal e esperar a entrada do usuário), tornando a classe `Principal` mais limpa e focada no fluxo do programa.
- `Principal.java`: A classe principal, atuando como um **coordenador**. Ela orquestra as chamadas para os métodos do `FuncionarioService` e `Utils` para seguir a ordem dos requisitos do teste.

📝 **Nota sobre a Arquitetura**:

Inicialmente, planejei usar o _Maven_ e a biblioteca _Lombok_ para gerenciar as dependências e reduzir o código clichê (boilerplate). No entanto, para garantir que o projeto seja leve e não exija configurações adicionais (como a instalação do Maven), optei por uma abordagem em Java puro. Isso torna o projeto mais acessível e fácil de rodar em qualquer ambiente.

## 🚀 Como Rodar o Projeto

Para rodar este projeto, você só precisa clonar o repositório e executar o script de automação correspondente ao seu sistema operacional. Simples assim\! 😉

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/LadyJessie19/teste-tecnico-java.git
    cd teste-tecnico-java
    ```
2.  **Execute o script no seu terminal:**
    - **Windows:** Digite `run.bat`
    - **Linux/macOS:** Digite `bash run.sh`

O script cuidará de tudo para você: ele compilará os arquivos Java, definirá a codificação de caracteres correta (para evitar problemas com acentos) e executará o programa.

## 🏆 Execução do Programa

Ao executar o script `run.bat` ou `bash run.sh`, uma sequência de comandos é executada automaticamente para você no terminal do Windows/MacOS/Linux:

1.  Primeiro, o comando `javac` compila todos os seus arquivos `.java` (`Pessoa.java`, `Funcionario.java`, `Principal.java`, etc.), transformando-os em arquivos executáveis (`.class`). A flag `-encoding UTF-8` garante que todos os caracteres especiais (como acentos) sejam compilados corretamente.

2.  Em seguida, o comando `java` executa a classe principal do seu projeto. A flag `-Dfile.encoding=UTF-8` garante que a saída no console seja exibida corretamente, sem problemas de acentuação.

3.  O programa inicia, e a classe `Utils` entra em ação, limpando a tela do terminal e apresentando uma breve introdução.

4.  O programa executa cada requisito do teste um a um, com pausas e limpeza de tela entre cada etapa, graças às chamadas para os métodos da classe `Utils`. Isso torna a visualização da solução clara e organizada.

5.  Ao final, o programa exibe uma mensagem de encerramento, e o script é finalizado.

Essa abordagem foi optada para garantir uma experiência fluida e direta ao testar a solução, evitando a necessidade de comandos manuais.

## 🎯 Requisitos do Teste

Todos os 12 requisitos do teste foram implementados e podem ser observados na saída do console, com a ajuda dos nossos scripts de automação.

- **3.1 & 3.2**: Inserção e remoção de funcionários.
- **3.3**: Impressão com formatação de data e valor.
- **3.4**: Aumento de 10% nos salários (e a confirmação visual desse aumento).
- **3.5 & 3.6**: Agrupamento por função.
- **3.8**: Impressão de aniversariantes.
- **3.9**: Funcionário com a maior idade.
- **3.10**: Lista em ordem alfabética.
- **3.11**: Total dos salários.
- **3.12**: Salários mínimos por funcionário.

---

Feito com ❤️ por **Jessie Moura** | Dev Fullstack
