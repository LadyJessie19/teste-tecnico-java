# Teste Técnico Java - Jessie Moura

Olá\! Este projeto é a minha solução para o teste prático de programação em Java. Foi uma jornada incrível de aprendizado e depuração, focada em entregar um código não apenas funcional, mas também limpo, organizado e seguindo as melhores práticas.

## ✨ Tecnologias e Ferramentas

- **Java 17**: A linguagem de programação que molda o projeto.
- **Java Streams**: Utilizado para manipular coleções de forma eficiente e concisa.
- **BigDecimal**: Essencial para garantir a precisão de valores monetários.
- **java.time**: A API moderna de datas, evitando as complexidades das versões legadas.
- **Scripts de Automação (`.bat` e `.sh`)**: Criados para facilitar a compilação e execução do projeto, garantindo uma experiência de teste perfeita, independentemente do sistema operacional.
- **Docker**: Uma opção de empacotamento para garantir que a aplicação rode em qualquer ambiente.

## 📂 Estrutura e Arquitetura do Projeto

O projeto segue um design de software com **separação de responsabilidades** 🧠, o que o torna mais fácil de manter e escalar:

- `Pessoa.java` & `Funcionario.java`: Nossas classes de **modelo**, que representam as entidades do negócio. `Funcionario` herda de `Pessoa`, um exemplo claro de herança em POO.
- `FuncionarioService.java`: Uma classe de **serviço**, responsável por toda a lógica de negócio (adicionar, remover, atualizar salários, etc.).
- `Utils.java`: Uma classe de **utilidade**, que centraliza funcionalidades auxiliares (como limpar o terminal e esperar a entrada do usuário), tornando a classe `Principal` mais limpa e focada no fluxo do programa.
- `Principal.java`: A classe principal, atuando como um **coordenador**. Ela orquestra as chamadas para os métodos do `FuncionarioService` e `Utils` para seguir a ordem dos requisitos do teste.

📝 **Nota sobre a Arquitetura**:

Inicialmente, planejei usar o _Maven_ e a biblioteca _Lombok_ para gerenciar as dependências e reduzir o código clichê (boilerplate). No entanto, para garantir que o projeto seja leve e não exija configurações adicionais (como a instalação do Maven), optei por uma abordagem em Java puro. Isso torna o projeto mais acessível e fácil de rodar em qualquer ambiente.

## 🚀 Como Rodar o Projeto

Você tem duas opções para executar o projeto. Escolha a que for mais conveniente para você\!

### Opção 1: Via Scripts de Automação (Recomendado se tiver Java instalado)

Esta opção é ideal para rodar o projeto diretamente no seu ambiente.

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/seu-usuario/teste-tecnico-java.git
    cd teste-tecnico-java
    ```
2.  **Execute o script no seu terminal:**
    - **Windows:** Digite `run.bat`
    - **Linux/macOS:** Digite `bash run.sh`

**O que acontece?** O script cuida de tudo: ele compila os arquivos Java, define a codificação de caracteres correta e executa o programa, mostrando a saída passo a passo.

### Opção 2: Via Docker (Recomendado se não tiver Java instalado)

Esta opção é a forma mais moderna e garantida de rodar o projeto, pois o Docker se encarrega de fornecer o ambiente completo (incluindo o Java). Certifique-se de ter o Docker instalado em sua máquina.

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/seu-usuario/teste-tecnico-java.git
    cd teste-tecnico-java
    ```
2.  **Construa a imagem Docker a partir do `Dockerfile`:**
    ```bash
    docker build -t iniflex-app .
    ```
3.  **Execute o contêiner:**
    ```bash
    docker run -it --rm iniflex-app
    ```
    O comando `--rm` garante que o contêiner seja removido automaticamente após a execução, mantendo seu sistema limpo.

**O que acontece?** O Docker constrói a imagem e executa o contêiner. O programa então roda em um ambiente isolado, e a saída é exibida diretamente no seu terminal.

Essa abordagem com scripts e Docker foi escolhida para garantir uma experiência de teste fluida e direta, sem a necessidade de comandos manuais. O programa executa cada requisito do teste um a um, com pausas e limpeza de tela entre cada questão, tornando a visualização da solução clara e organizada.

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
