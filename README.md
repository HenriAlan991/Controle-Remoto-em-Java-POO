# 📺 Controle Remoto de TV (Aula 06b)

Um projeto simples em Java que simula o controle remoto de uma TV. Com ele dá pra ligar e desligar a TV, pausar e despausar, aumentar, diminuir e mutar o volume. Cada ação mostra uma mensagem no console avisando o que aconteceu (ou por que não foi possível fazer, como tentar mexer no volume com a TV desligada).

## 🎓 Sobre o projeto

Este projeto foi criado durante a **aula 06b** do **Curso de Java POO** do professor **Gustavo Guanabara**, do canal **Curso em Vídeo**. A aula é sobre **encapsulamento**.

Nele eu pratiquei:

- **Encapsulamento**: acesso aos atributos da classe por meio de métodos *getters* e *setters*.
- **Métodos construtores**: o construtor da classe `ControleRemoto` já deixa a TV pronta para uso (desligada, com volume em 25 e sem estado de pausa).
- **Interface**: a classe `ControleRemoto` implementa a interface `Controles`, que define todas as ações do controle.

## 🗂️ Estrutura

```
src/aula06b/
├── Controles.java        → interface com as ações do controle
├── ControleRemoto.java   → classe que implementa as ações
└── Main.java             → programa principal para testar
```

## ▶️ Como executar

1. Clone ou baixe o projeto.
2. Abra em uma IDE Java (IntelliJ, Eclipse, NetBeans...).
3. Execute a classe `Main`.

Ou, pelo terminal, a partir da pasta `src`:

```bash
javac aula06b/*.java
java aula06b.Main
```

## 💬 Exemplo de saída

```
Sua TV foi ligada!
Volume ajustado para: 45
Sua TV foi despausada!
Sua TV foi desligada.
Sua TV foi ligada!
Volume ajustado para: 5
```

## 🚫 Sobre o uso de IA

**Não foi usada IA no código.** Todo o código deste projeto foi escrito por mim, durante meus estudos.

Somente este arquivo `README.md` foi feito com a ajuda do **Claude AI** (modelo utilizado: **Claude Sonnet 5.5**).

## ✍️ Autor

**Henri Alan Cavejon Sufiatti**

📅 30 de outubro de 2026
