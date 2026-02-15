# Fundamentos de Java

## Índice
1. [Introdução](#introdução)
2. [Ambiente de Desenvolvimento](#ambiente-de-desenvolvimento)
3. [Estrutura Básica](#estrutura-básica)
4. [Tipos de Dados](#tipos-de-dados)
5. [Variáveis](#variáveis)
6. [Operadores](#operadores)
7. [Estruturas de Controle](#estruturas-de-controle)
8. [Métodos/Funções](#métodosfunções)
9. [Programação Orientada a Objetos](#programação-orientada-a-objetos)
10. [Packages e Imports](#packages-e-imports)

---

## Introdução

Java é uma linguagem de programação orientada a objetos, com tipagem forte e compilada. Foi criada em 1995 pela Sun Microsystems (atualmente Oracle) com o objetivo de ser multiplataforma - "Write Once, Run Anywhere" (WORA).

### Principais Características:
- **Orientada a Objetos**: Tudo em Java é um objeto (exceto tipos primitivos)
- **Compilada e Interpretada**: Código compilado para bytecode que é executado na JVM
- **Multiplataforma**: Executa em qualquer sistema que tenha a JVM instalada
- **Gerenciamento de Memória**: Garbage Collector automático
- **Segurança**: Tipagem forte, gerenciamento de exceções robusto
- **Comunidade Ativa**: Vasto ecossistema de bibliotecas e frameworks

---

## Ambiente de Desenvolvimento

### Requisitos:
- **JDK (Java Development Kit)**: Necessário para compilar código Java
- **IDE**: IntelliJ IDEA, Eclipse, VS Code, etc.
- **Maven**: Gerenciador de dependências e build (neste projeto)

### Versões Java:
- Java 8 (LTS) - Amplamente usado
- Java 11 (LTS) - Versão utilizada neste projeto
- Java 17 (LTS) - Versão LTS mais recente
- Java 21 (LTS) - Versão LTS atual

---

## Estrutura Básica

### Programa Simples:

```java
package br.com.maven.fundamento.java.dio;

public class App {
    public static void main(String[] args) {
        System.out.println("Olá, Java!");
    }
}
```

### Componentes:

1. **Package**: Namespace para organizar classes
   ```java
   package br.com.maven.fundamento.java.dio;
   ```

2. **Imports**: Importam classes de outros packages
   ```java
   import java.time.LocalDate;
   ```

3. **Classe**: Define um tipo de dado
   ```java
   public class App {
       // corpo da classe
   }
   ```

4. **Método Principal**: Ponto de entrada da aplicação
   ```java
   public static void main(String[] args) {
       // executar código
   }
   ```

---

## Tipos de Dados

### Tipos Primitivos:

| Tipo | Tamanho | Intervalo | Exemplo |
|------|---------|-----------|---------|
| `byte` | 1 byte | -128 a 127 | `byte b = 10;` |
| `short` | 2 bytes | -32,768 a 32,767 | `short s = 100;` |
| `int` | 4 bytes | -2³¹ a 2³¹-1 | `int i = 1000;` |
| `long` | 8 bytes | -2⁶³ a 2⁶³-1 | `long l = 100000L;` |
| `float` | 4 bytes | 32-bit IEEE 754 | `float f = 3.14f;` |
| `double` | 8 bytes | 64-bit IEEE 754 | `double d = 3.14159;` |
| `boolean` | 1 bit | true / false | `boolean b = true;` |
| `char` | 2 bytes | 0 a 65,535 | `char c = 'A';` |

### Tipos de Referência (Objetos):

```java
// String
String texto = "Olá Java";

// LocalDate (usado neste projeto)
import java.time.LocalDate;
LocalDate data = LocalDate.now();

// Arrays
int[] numeros = {1, 2, 3, 4, 5};
String[] nomes = new String[3];

// Objetos
UserMODEL usuario = new UserMODEL();
```

---

## Variáveis

### Declaração e Inicialização:

```java
// Tipo explícito
int idade = 25;
String nome = "João";
LocalDate nascimento = LocalDate.of(1999, 5, 15);

// Tipo inferido (Java 10+)
var mensagem = "Tipo inferido";  // String
var ano = LocalDate.now().getYear();  // int
```

### Escopos:

1. **Variáveis de Instância**: Pertencem ao objeto
   ```java
   public class UserMODEL {
       private int code;  // variável de instância
   }
   ```

2. **Variáveis de Classe (Static)**: Pertencem à classe
   ```java
   public class Constantes {
       public static final String VERSAO = "1.0";
   }
   ```

3. **Variáveis Locais**: Declaradas dentro de métodos
   ```java
   public void processar() {
       String info = "local";  // variável local
   }
   ```

### Modificadores de Acesso:

| Modificador | Descrição |
|-------------|-----------|
| `public` | Acessível de qualquer lugar |
| `private` | Acessível apenas dentro da classe |
| `protected` | Acessível na classe e em subclasses |
| (padrão) | Acessível no mesmo package |

---

## Operadores

### Operadores Aritméticos:

```java
int a = 10, b = 3;

int soma = a + b;           // 13
int subtracao = a - b;      // 7
int multiplicacao = a * b;  // 30
int divisao = a / b;        // 3
int resto = a % b;          // 1
```

### Operadores de Comparação:

```java
int x = 5, y = 10;

boolean igual = (x == y);        // false
boolean diferente = (x != y);    // true
boolean maior = (x > y);         // false
boolean menorIgual = (x <= y);   // true
```

### Operadores Lógicos:

```java
boolean condicao1 = true;
boolean condicao2 = false;

boolean e = condicao1 && condicao2;   // false
boolean ou = condicao1 || condicao2;  // true
boolean nao = !condicao1;              // false
```

### Operadores de Atribuição:

```java
int valor = 10;

valor += 5;   // valor = valor + 5;  (15)
valor -= 3;   // valor = valor - 3;  (12)
valor *= 2;   // valor = valor * 2;  (24)
valor /= 4;   // valor = valor / 4;  (6)
```

---

## Estruturas de Controle

### Condicional if-else:

```java
int idade = 18;

if (idade < 18) {
    System.out.println("Menor de idade");
} else if (idade == 18) {
    System.out.println("Exatamente 18 anos");
} else {
    System.out.println("Maior de idade");
}
```

### Condicional switch:

```java
int diaSemana = 3;

switch (diaSemana) {
    case 1:
        System.out.println("Segunda");
        break;
    case 2:
        System.out.println("Terça");
        break;
    case 3:
        System.out.println("Quarta");
        break;
    default:
        System.out.println("Dia inválido");
}
```

### Loops:

#### for simples:
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);  // 0, 1, 2, 3, 4
}
```

#### for-each:
```java
String[] nomes = {"Ana", "Bruno", "Carlos"};

for (String nome : nomes) {
    System.out.println(nome);
}
```

#### while:
```java
int contador = 0;

while (contador < 3) {
    System.out.println(contador);
    contador++;
}
```

#### do-while:
```java
int numero = 1;

do {
    System.out.println(numero);
    numero++;
} while (numero <= 3);
```

---

## Métodos/Funções

### Declaração Básica:

```java
public class Calculadora {
    
    // Método sem retorno
    public void saudar(String nome) {
        System.out.println("Olá, " + nome);
    }
    
    // Método com retorno
    public int somar(int a, int b) {
        return a + b;
    }
    
    // Método static
    public static int multiplicar(int x, int y) {
        return x * y;
    }
}
```

### Componentes de um Método:

1. **Modificador de Acesso**: `public`, `private`, etc.
2. **Modificador static**: Opcional, define comportamento
3. **Tipo de Retorno**: `void` (sem retorno) ou um tipo (`int`, `String`, etc.)
4. **Nome**: Identificador do método
5. **Parâmetros**: Lista de argumentos
6. **Corpo**: Implementação

### Sobrecarga de Métodos:

```java
public class Conversor {
    
    // Overload: mesmo nome, diferentes parâmetros
    public String converterParaTexto(int numero) {
        return String.valueOf(numero);
    }
    
    public String converterParaTexto(double numero) {
        return String.valueOf(numero);
    }
    
    public String converterParaTexto(boolean valor) {
        return String.valueOf(valor);
    }
}
```

---

## Programação Orientada a Objetos

### Conceitos Fundamentais:

#### 1. Classe e Objeto:

```java
public class UserMODEL {
    // Atributos
    private int code;
    private String userName;
    private LocalDate birthDay;
    
    // Construtor
    public UserMODEL() {
    }
    
    // Getters e Setters
    public int getCode() {
        return code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
}

// Instanciação
UserMODEL usuario = new UserMODEL();
usuario.setCode(1);
usuario.setUserName("James");
```

#### 2. Encapsulamento:

```java
public class Conta {
    private double saldo;  // Protegido (private)
    
    // Acesso controlado via métodos públicos
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
}
```

#### 3. Herança:

```java
// Classe pai
public class Animal {
    public void fazer_som() {
        System.out.println("Som genérico");
    }
}

// Classe filha
public class Cachorro extends Animal {
    @Override
    public void fazer_som() {
        System.out.println("Au au!");
    }
}
```

#### 4. Polimorfismo:

```java
// Interface
public interface IAnimal {
    void fazer_som();
}

// Implementadores
public class Gato implements IAnimal {
    @Override
    public void fazer_som() {
        System.out.println("Miau");
    }
}

public class Passaro implements IAnimal {
    @Override
    public void fazer_som() {
        System.out.println("Piu piu");
    }
}

// Uso polimórfico
IAnimal animal1 = new Gato();
IAnimal animal2 = new Passaro();

animal1.fazer_som();  // Miau
animal2.fazer_som();  // Piu piu
```

#### 5. Abstração:

```java
public abstract class Veiculo {
    abstract void acelerar();
    abstract void frear();
    
    public void ligar() {
        System.out.println("Veículo ligado");
    }
}

public class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }
    
    @Override
    public void frear() {
        System.out.println("Carro frenando");
    }
}
```

---

## Packages e Imports

### Nomeação de Packages:

Por convenção, usa-se o domínio reverso:

```
com.empresa.projeto
br.com.company.modulo
org.framework.util
```

### Exemplos deste Projeto:

```java
// Package principal
package br.com.maven.fundamento.java.dio;

// Imports
import br.com.maven.fundamento.java.dio.dto.UserDTO;
import br.com.maven.fundamento.java.dio.model.UserMODEL;
import java.time.LocalDate;
import org.mapstruct.Mapper;
```

### Estrutura de Diretórios:

```
src/main/java/br/com/maven/fundamento/java/dio/
├── App.java                    (públic)
├── dto/
│   └── UserDTO.java            (Data Transfer Object)
├── model/
│   └── UserMODEL.java          (Modelo de dados)
└── mapper/
    └── IUserMAPPER.java        (Mapeador de dados)
```

### Import Wildcard:

```java
// Import todos os membros públicos do package
import java.util.*;

// Equivalente a:
// import java.util.List;
// import java.util.ArrayList;
// import java.util.Map;
// ... (todos os membros)
```

---

## Boas Práticas

1. **Nomenclatura**:
   - Classes: `PascalCase` (ex: `UserMODEL`, `CalculadoraImposto`)
   - Métodos/Variáveis: `camelCase` (ex: `userName`, `calcularTotal`)
   - Constantes: `UPPER_SNAKE_CASE` (ex: `MAX_TENTATIVAS`, `URL_API`)

2. **Comentários**:
   ```java
   // Comentário de linha única
   
   /* Comentário
      multi-linha */
   
   /**
    * Comentário de documentação (JavaDoc)
    * @param nome Nome do usuário
    * @return String de saudação
    */
   public String saudar(String nome) {
       return "Olá, " + nome;
   }
   ```

3. **Organização de Código**:
   - Atributos no início da classe
   - Construtores após atributos
   - Métodos públicos
   - Métodos privados
   - Métodos override

---

## Conclusão

Os fundamentos de Java formam a base para desenvolver aplicações robustas e escaláveis. Compreender bien estes conceitos é essencial para dominar a linguagem e trabalhar com frameworks e bibliotecas mais avançadas.

