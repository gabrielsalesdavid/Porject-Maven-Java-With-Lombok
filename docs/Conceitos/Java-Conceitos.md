# Conceitos Avançados de Java

## Índice
1. [Maven](#maven)
2. [Lombok](#lombok)
3. [MapStruct](#mapstruct)
4. [Data Transfer Object (DTO)](#data-transfer-object-dto)
5. [Padrão Mapper](#padrão-mapper)
6. [Annotations](#annotations)
7. [Genéricos](#genéricos)
8. [Interfaces Funcionais](#interfaces-funcionais)
9. [Collections API](#collections-api)
10. [Tratamento de Exceções](#tratamento-de-exceções)

---

## Maven

### O que é Maven?

Maven é uma ferramenta de automação de build e gerenciamento de dependências para projetos Java. Segue o conceito de **Convention over Configuration** - segue convenções pré-definidas reduzindo a necessidade de configuração.

### Estrutura de um Projeto Maven:

```
projeto/
├── pom.xml                  # Arquivo de configuração principal
├── src/
│   ├── main/
│   │   ├── java/           # Código-fonte
│   │   └── resources/      # Recursos (configs, arquivos)
│   └── test/
│       ├── java/           # Testes unitários
│       └── resources/      # Recursos de teste
├── target/                 # Diretório de build
└── docs/                   # Documentação
```

### Arquivo pom.xml:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0">
  <modelVersion>4.0.0</modelVersion>

  <!-- Identificação do Projeto -->
  <groupId>br.com.maven.fundamento.java.dio</groupId>
  <artifactId>maven</artifactId>
  <version>1.0</version>

  <!-- Propriedades -->
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
    <org.projectlombok.version>1.18.30</org.projectlombok.version>
  </properties>

  <!-- Dependências -->
  <dependencies>
    <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <version>${org.projectlombok.version}</version>
      <scope>provided</scope>
    </dependency>
  </dependencies>

  <!-- Plugins de Build -->
  <build>
    <plugins>
      <plugin>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.1</version>
      </plugin>
    </plugins>
  </build>
</project>
```

### Componentes Principais:

1. **groupId**: Identificador único do grupo (domínio reverso)
2. **artifactId**: Nome único do projeto
3. **version**: Versão do projeto
4. **dependencies**: Lista de bibliotecas utilizadas
5. **build**: Configuração do processo de build

### Escopos de Dependência:

| Escopo | Descrição | Quando Usar |
|--------|-----------|------------|
| `compile` | Necessária em tempo de compilação e execução | Dependências principais |
| `runtime` | Necessária apenas em tempo de execução | Drivers, conectores |
| `test` | Necessária apenas para testes | JUnit, Mockito |
| `provided` | Fornecida pelo container/JDK | Lombok, Servlet API |
| `optional` | Opcional para dependentes | Funcionalidades extras |

### Comandos Maven Comuns:

```bash
# Compilar
mvn compile

# Executar testes
mvn test

# Criar pacote (JAR/WAR)
mvn package

# Instalar no repositório local
mvn install

# Limpar build anterior
mvn clean

# Limpar e compilar
mvn clean compile

# Limpar, compilar, testar e empacotar
mvn clean package
```

---

## Lombok

### O que é Lombok?

Lombok é uma biblioteca que utiliza **annotations** para gerar automaticamente código boilerplate, como getters, setters, construtores, equals, hashCode e toString.

### Benefícios:

- Reduz significativamente a quantidade de código
- Melhora legibilidade
- Reduz erros de digitação
- Facilita manutenção

### Annotations Principais:

#### 1. @Getter e @Setter:

```java
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
    private int id;
    private String nome;
    private String email;
}

// Gera automaticamente:
// public int getId() { return id; }
// public void setId(int id) { this.id = id; }
// ... (para todos os atributos)
```

#### 2. @NoArgsConstructor:

```java
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Produto {
    private String descricao;
    private double preco;
}

// Gera: public Produto() {}
```

#### 3. @AllArgsConstructor:

```java
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Pedido {
    private int numero;
    private LocalDate data;
    private double total;
}

// Gera: public Pedido(int numero, LocalDate data, double total) {...}
```

#### 4. @ToString:

```java
import lombok.ToString;

@ToString
public class Pessoa {
    private String nome;
    private int idade;
}

// Sobrescreve toString()
// Output: Pessoa(nome=João, idade=30)
```

#### 5. @EqualsAndHashCode:

```java
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Conta {
    private String numero;
    private double saldo;
}

// Gera equals() e hashCode() baseados nos atributos
```

#### 6. @Data:

```java
import lombok.Data;

@Data
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
}

// Equivalente a: @Getter @Setter @ToString @EqualsAndHashCode @NoArgsConstructor
```

### Exemplo Completo (neste projeto):

```java
// Sem Lombok (muito código)
public class UserMODEL {
    private int code;
    private String userName;
    private LocalDate birthDay;
    
    public UserMODEL() {}
    
    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }
    
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    
    public LocalDate getBirthDay() { return birthDay; }
    public void setBirthDay(LocalDate birthDay) { this.birthDay = birthDay; }
    
    @Override
    public String toString() {
        return "UserMODEL{" +
            "code=" + code +
            ", userName='" + userName + '\'' +
            ", birthDay=" + birthDay +
            '}';
    }
}

// Com Lombok (código limpo)
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserMODEL {
    private int code;
    private String userName;
    private LocalDate birthDay;
}
```

---

## MapStruct

### O que é MapStruct?

MapStruct é um processador de anotações que gera mapeadores tipados automaticamente, convertendo entre diferentes tipos de objetos (especialmente útil para DTO ↔ Model).

### Benefícios:

- Segurança de tipos (compile-time)
- Alto desempenho (sem reflexão)
- Mapeamento automático de propriedades
- Suporte a conversões customizadas

### Mapeadores em Ação:

#### Interface Mapeadora:

```java
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface IUserMAPPER {
    
    // Mapeia UserDTO → UserMODEL
    @Mapping(target = "code", source = "id")      // id → code
    @Mapping(target = "userName", source = "name") // name → userName
    UserMODEL toModel(UserDTO dto);
    
    // Mapeia UserMODEL → UserDTO
    @Mapping(target = "id", source = "code")       // code → id
    @Mapping(target = "name", source = "userName") // userName → name
    UserDTO toDTO(UserMODEL model);
}
```

#### Uso:

```java
// Instanciar o mapeador gerado
IUserMAPPER mapper = Mappers.getMapper(IUserMAPPER.class);

// Converter DTO para Model
UserDTO dto = new UserDTO();
dto.setId(1);
dto.setName("Maria");
UserMODEL model = mapper.toDTO(dto);  // Automaticamente mapeado

// Converter Model para DTO
UserMODEL userModel = new UserMODEL();
userModel.setCode(2);
userModel.setUserName("João");
UserDTO novoDto = mapper.toDTO(userModel);  // Automaticamente mapeado
```

### Recursos Avançados:

#### 1. Mapeamento com Expressões:

```java
@Mapper
public interface PessoaMapper {
    
    @Mapping(target = "nomeCompleto", expression = "java(dto.getNome() + \" \" + dto.getSobrenome())")
    Pessoa toModel(PessoaDTO dto);
}
```

#### 2. Mapeadores Customizados:

```java
@Mapper
public interface ContaMapper {
    
    @Mapping(target = "dataCriacao", dateFormat = "dd-MM-yyyy")
    Conta toModel(ContaDTO dto);
}
```

#### 3. Listas de Mapeamento:

```java
@Mapper
public interface UsuarioMapper {
    
    List<UsuarioDTO> toDTO(List<Usuario> usuarios);
    List<Usuario> toModel(List<UsuarioDTO> dtos);
}
```

---

## Data Transfer Object (DTO)

### O que é DTO?

DTO (Data Transfer Object) é um padrão que encapsula dados para transferência entre camadas da aplicação, separando a representação interna (Model) da representação externa (DTO).

### Benefícios:

1. **Segurança**: Não expõe a estrutura interna
2. **Flexibilidade**: Pode ter estrutura diferente do Model
3. **Performance**: Transmite apenas dados necessários
4. **Evolução**: Mudanças no Model não afetam clientes

### Exemplo neste Projeto:

```java
// MODEL (Representação Interna)
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserMODEL {
    private int code;           // Identificação interna
    private String userName;    // Nome de usuário
    private LocalDate birthDay; // Data de nascimento
}

// DTO (Representação Externa)
public class UserDTO {
    private int id;           // Id para cliente
    private String name;      // Nome legível
    private LocalDate birthDay; // Mesma data
}
```

### Fluxo de Dados:

```
Cliente → UserDTO → Mapper → UserMODEL → Banco de Dados
Banco de Dados → UserMODEL → Mapper → UserDTO → Cliente
```

### Quando Usar DTOs:

- APIs REST/SOAP
- Microsserviços
- Separação entre camadas
- Aplicações com múltiplos clientes
- Proteção de dados sensíveis

---

## Padrão Mapper

### O que é Mapper?

Mapper é um padrão que define a transformação entre dois objetos de diferentes tipos, mantendo a lógica de conversão centralizada e testável.

### Componentes:

```java
// Interface (contrato)
@Mapper
public interface IUserMAPPER {
    UserMODEL toModel(UserDTO dto);
    UserDTO toDTO(UserMODEL model);
}

// Uso
public class App {
    private static final IUserMAPPER mapper = Mappers.getMapper(IUserMAPPER.class);
    
    public static void main(String[] args) {
        UserMODEL userModel = new UserMODEL();
        userModel.setCode(1);
        userModel.setUserName("James");
        
        // Usar mapper
        UserDTO dto = mapper.toDTO(userModel);
        System.out.println(dto);
    }
}
```

### Vantagens:

- Manutenibilidade: Lógica centralizada
- Testabilidade: Fácil mockar
- Reutilização: Mapper pode ser usado em vários lugares
- Separação de Responsabilidades

---

## Annotations

### O que são Annotations?

Annotations são um mecanismo de metadados que não afetam diretamente a operação do código, mas fornecem informações para processamento em tempo de compilação ou execução.

### Sintaxe:

```java
@NomeAnnotation
@NomeAnnotation(parametro = "valor")
```

### Annotations Comuns em Java:

#### 1. @Override:

```java
public class Gato extends Animal {
    @Override
    public void fazer_som() {
        System.out.println("Miau");
    }
}
```

#### 2. @Deprecated:

```java
@Deprecated
public void metodoAntigo() {
    // Este método não deve mais ser usado
}

@Deprecated(since = "2.0", forRemoval = true)
public void metodoDoBas() {
    // Removido na versão 2.0
}
```

#### 3. @SuppressWarnings:

```java
@SuppressWarnings("unchecked")
public List getLista() {
    return (List) new ArrayList();
}
```

#### 4. @FunctionalInterface:

```java
@FunctionalInterface
public interface Operacao {
    int executar(int a, int b);
}
```

### Annotations Customizadas:

```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MinhaAnotacao {
    String valor() default "padrão";
    int versao() default 1;
}

// Uso
public class MinhaClasse {
    @MinhaAnotacao(valor = "teste", versao = 2)
    public void meuMetodo() {
        // implementação
    }
}
```

---

## Genéricos

### O que são Genéricos?

Genéricos permitem definir classes, interfaces e métodos com tipos parametrizáveis, fornecendo type safety em tempo de compilação.

### Sintaxe Básica:

```java
// Classe Genérica
public class Caixa<T> {
    private T conteudo;
    
    public void adicionar(T item) {
        this.conteudo = item;
    }
    
    public T remover() {
        return conteudo;
    }
}

// Usar
Caixa<String> caixaTexto = new Caixa<>();
caixaTexto.adicionar("Olá");
String texto = caixaTexto.remover();

Caixa<Integer> caixaNumero = new Caixa<>();
caixaNumero.adicionar(42);
int numero = caixaNumero.remover();
```

### Genéricos com Múltiplos Tipos:

```java
public class Mapa<K, V> {
    private K chave;
    private V valor;
    
    public Mapa(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }
}

// Usar
Mapa<String, Integer> mapa = new Mapa<>("idade", 30);
```

### Bounded Type Parameters:

```java
// T deve estender Number
public <T extends Number> void processar(T numero) {
    System.out.println(numero.doubleValue());
}

// Uso
processar(42);        // Integer (extends Number)
processar(3.14);      // Double (extends Number)
// processar("texto"); // Erro de compilação
```

### Wildcard:

```java
// Aceita List de qualquer tipo
public void imprimirLista(List<?> lista) {
    for (Object item : lista) {
        System.out.println(item);
    }
}

// Aceita List de tipos que estendem Animal
public void alimentarAnimais(List<? extends Animal> animais) {
    for (Animal animal : animais) {
        animal.comer();
    }
}

// Aceita List que é supercla-se de Animal
public void adicionarAnimais(List<? super Animal> lista) {
    lista.add(new Cachorro());
}
```

---

## Interfaces Funcionais

### O que é uma Interface Funcional?

Interface Funcional é uma interface com exatamente um método abstrato. Permite usar **Lambda Expressions** e **Method References**.

### Conceito:

```java
@FunctionalInterface
public interface Operacao {
    int executar(int a, int b);
}

// Implementação tradicional
Operacao soma = new Operacao() {
    @Override
    public int executar(int a, int b) {
        return a + b;
    }
};

// Implementação com Lambda (muito mais concisa!)
Operacao soma = (a, b) -> a + b;
Operacao subtracao = (a, b) -> a - b;
Operacao multiplicacao = (a, b) -> a * b;

// Uso
System.out.println(soma.executar(10, 5));  // 15
System.out.println(subtracao.executar(10, 5));  // 5
```

### Interfaces Funcionais Nativas do Java:

| Interface | Método | Uso |
|-----------|--------|-----|
| `Predicate<T>` | `boolean test(T t)` | Testes/Filtros |
| `Function<T, R>` | `R apply(T t)` | Transformações |
| `Consumer<T>` | `void accept(T t)` | Processamento |
| `Supplier<T>` | `T get()` | Fornece valores |

### Exemplos:

```java
// Predicate: testa condição
Predicate<Integer> ehPar = n -> n % 2 == 0;
System.out.println(ehPar.test(10));  // true

// Function: transforma
Function<String, Integer> contarCaracteres = s -> s.length();
System.out.println(contarCaracteres.apply("Java"));  // 4

// Consumer: consome
Consumer<String> imprimir = System.out::println;
imprimir.accept("Olá, Lambda!");

// Supplier: fornece
Supplier<Double> randomNumero = Math::random;
System.out.println(randomNumero.get());
```

---

## Collections API

### O que são Collections?

Collections são estruturas de dados que armazenam múltiplos elementos e fornecem operações para manipulá-los.

### Hierarquia:

```
Collection (interface)
├── List (ordenada, permite duplicatas)
│   ├── ArrayList (dinâmica, baseada em array)
│   ├── LinkedList (dinâmica, baseada em linked list)
│   └── Vector (sincronizada, legacy)
├── Set (sem duplicatas)
│   ├── HashSet
│   ├── LinkedHashSet
│   └── TreeSet
└── Queue (fila)
    ├── LinkedList
    └── PriorityQueue

Map (interface separada)
├── HashMap
├── LinkedHashMap
├── TreeMap
└── Hashtable (legacy)
```

### Exemplos:

#### List:

```java
List<String> nomes = new ArrayList<>();
nomes.add("Ana");
nomes.add("Bruno");
nomes.add("Carlos");

System.out.println(nomes.get(0));  // Ana
System.out.println(nomes.size());  // 3

for (String nome : nomes) {
    System.out.println(nome);
}
```

#### Set:

```java
Set<Integer> numeros = new HashSet<>();
numeros.add(1);
numeros.add(2);
numeros.add(2);  // Duplicata, não é adicionado

System.out.println(numeros.size());  // 2
```

#### Map:

```java
Map<String, Integer> idade = new HashMap<>();
idade.put("João", 30);
idade.put("Maria", 25);

System.out.println(idade.get("João"));  // 30
```

### Stream API (Java 8+):

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

// Filtrar pares
numeros.stream()
    .filter(n -> n % 2 == 0)
    .forEach(System.out::println);  // 2, 4

// Mapear (dobrar valores)
numeros.stream()
    .map(n -> n * 2)
    .forEach(System.out::println);  // 2, 4, 6, 8, 10

// Coletar em lista
List<Integer> dobrados = numeros.stream()
    .map(n -> n * 2)
    .collect(Collectors.toList());
```

---

## Tratamento de Exceções

### O que são Exceções?

Exceções representam eventos anormais durante a execução do programa. Java usa o mecanismo try-catch para tratá-las.

### Hierarquia:

```
Throwable
├── Exception (verificadas)
│   ├── IOException
│   ├── SQLException
│   └── ... (múltiplas exceções)
└── RuntimeException (não verificadas)
    ├── NullPointerException
    ├── ArrayIndexOutOfBoundsException
    └── ... (múltiplas exceções)
```

### try-catch-finally:

```java
try {
    // Código que pode lançar exceção
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    // Captura exceção específica
    System.out.println("Erro: Divisão por zero!");
    e.printStackTrace();
} catch (Exception e) {
    // Captura exceção genérica
    System.out.println("Erro geral: " + e.getMessage());
} finally {
    // Sempre executado (mesmo com exceção)
    System.out.println("Limpeza de recursos");
}
```

### Lançar Exceções:

```java
public void verificarIdade(int idade) throws IllegalArgumentException {
    if (idade < 0) {
        throw new IllegalArgumentException("Idade não pode ser negativa");
    }
}

// Chamar
try {
    verificarIdade(-5);
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}
```

### try-with-resources:

```java
try (BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"))) {
    String linha;
    while ((linha = br.readLine()) != null) {
        System.out.println(linha);
    }
} catch (IOException e) {
    e.printStackTrace();
}
// Recurso (BufferedReader) é automaticamente fechado
```

---

## Conclusão

Os conceitos avançados de Java, incluindo Maven, Lombok, MapStruct e outros, são fundamentais para desenvolver aplicações profissionais, escaláveis e fáceis de manter. Este projeto demonstra o uso prático de várias dessas tecnologias.

