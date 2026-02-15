# 📘 PROJECT MAVEN JAVA WITH LOMBOK

**Formação Java - DIO.me** | Projeto Completo com Documentação

---

## 📋 Índice

1. [Visão Geral](#visão-geral)
2. [Tecnologias Utilizadas](#tecnologias-utilizadas)
3. [Arquivos Gerados](#arquivos-gerados)
4. [Estrutura do Projeto](#estrutura-do-projeto)
5. [Como Usar](#como-usar)
6. [Documentação](#documentação)
7. [Exemplos Práticos](#exemplos-práticos)
8. [Dependências](#dependências)
9. [Comandos Maven](#comandos-maven)
10. [Contribuições](#contribuições)

---

## 🎯 Visão Geral

Este é um projeto educacional que demonstra os **fundamentos e conceitos avançados de Java**, utilizando as melhores práticas modernas com:

- **Maven**: Automação de build e gerenciamento de dependências
- **Lombok**: Redução de código boilerplate através de annotations
- **MapStruct**: Mapeamento tipado e seguro entre objetos (DTO ↔ Model)
- **JUnit**: Framework para testes unitários

### Objetivo

Aprender e praticar:
- Estrutura de projetos Java com Maven
- Uso de annotations e processadores de annotations
- Padrão DTO (Data Transfer Object)
- Padrão Mapper para transformação de dados
- Boas práticas de codificação em Java

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão | Propósito | Status |
|---|---|---|---|
| **Java** | 11 | Linguagem principal | ✅ Ativo |
| **Maven** | 3.8.1+ | Build e dependências | ✅ Configurado |
| **Lombok** | 1.18.30 | Redução de boilerplate | ✅ Integrado |
| **MapStruct** | 1.5.5.Final | Mapeamento de objetos | ✅ Integrado |
| **JUnit** | 4.13.2 | Testes unitários | ✅ Configurado |

### Versões LTS de Java Suportadas

- Java 11 (LTS) - **Versão Atual do Projeto**
- Java 17 (LTS) - Compatível
- Java 21 (LTS) - Compatível

---

## 📁 Arquivos Gerados

### Total: 11 Arquivos Novos Criados

#### 1. **Arquivos de Configuração**

- **`.gitignore`** - Arquivo de controle de versão
  - Ignora compilados, JARs, logs
  - Padrão Maven/Java

- **`pom.xml`** - Arquivo de configuração Maven
  - Define dependências
  - Configura plugins do compilador
  - Define processadores de annotations

#### 2. **Documentação** (4 Arquivos)

- **`docs/Fundamentos/Java-Fundamentos.md`** - Guia Completo de Fundamentos
  - 570 linhas de documentação
  - Cobre conceitos básicos de Java
  - Inclui exemplos práticos

- **`docs/Conceitos/Java-Conceitos.md`** - Guia de Conceitos Avançados
  - 861 linhas de documentação
  - Maven, Lombok, MapStruct
  - Annotations, Genéricos, Collections
  - Interfaces Funcionais e Tratamento de Exceções

#### 3. **Código-Fonte Principal** (4 Arquivos)

- **`src/main/java/br/com/maven/fundamento/java/dio/App.java`**
  - Classe principal com método main
  - Demonstra uso de Mapper e conversão DTO ↔ Model
  - 30 linhas de código

- **`src/main/java/br/com/maven/fundamento/java/dio/model/UserMODEL.java`**
  - Modelo de dados com Lombok annotations
  - @NoArgsConstructor, @Getter, @Setter, @ToString
  - 19 linhas de código

- **`src/main/java/br/com/maven/fundamento/java/dio/dto/UserDTO.java`**
  - Data Transfer Object para usuário
  - Padrão DTO para transferência entre camadas
  - 10 linhas de código

- **`src/main/java/br/com/maven/fundamento/java/dio/mapper/IUserMAPPER.java`**
  - Interface Mapper com MapStruct
  - Converte entre DTO e Model
  - 19 linhas de código

#### 4. **Testes** (1 Arquivo)

- **`src/test/java/br/com/maven/fundamento/java/dio/AppTest.java`**
  - Teste unitário de exemplo com JUnit
  - 20 linhas de código

#### 5. **Build Output** (2 Arquivos)

- **`target/maven-status/.../createdFiles.lst`**
- **`target/maven-status/.../inputFiles.lst`**

---

## 📂 Estrutura do Projeto

```
PROJECT-MAVEN-JAVA-WITH-LOMBOK/
│
├── 📄 README.md                          ← Este arquivo
├── 📄 pom.xml                            ← Configuração Maven
├── 📄 .gitignore                         ← Controle Git
│
├── 📁 docs/                              ← Documentação
│   ├── 📁 Fundamentos/
│   │   ├── Java-Fundamentos.md           (570 linhas)
│   │   └── README.md
│   ├── 📁 Conceitos/
│   │   ├── Java-Conceitos.md             (861 linhas)
│   │   └── README.md
│   └── README.md
│
├── 📁 src/
│   ├── 📁 main/
│   │   └── 📁 java/br/com/maven/fundamento/java/dio/
│   │       ├── 📄 App.java                       (Classe Principal)
│   │       ├── 📁 model/
│   │       │   └── UserMODEL.java                (Modelo com Lombok)
│   │       ├── 📁 dto/
│   │       │   └── UserDTO.java                  (DTO)
│   │       └── 📁 mapper/
│   │           └── IUserMAPPER.java              (Mapper com MapStruct)
│   │
│   └── 📁 test/
│       └── 📁 java/br/com/maven/fundamento/java/dio/
│           └── 📄 AppTest.java                   (Teste com JUnit)
│
├── 📁 target/                            ← Build Output
│   ├── 📁 classes/
│   ├── 📁 generated-sources/annotations/
│   ├── 📁 generated-test-sources/test-annotations/
│   └── 📁 maven-status/
│
└── .git/                                 ← Repositório Git
```

---

## 🚀 Como Usar

### Pré-requisitos

Antes de começar, certifique-se de ter instalado:

```bash
# Verificar Java
java -version
# Saída esperada: openjdk version "11..."

# Verificar Maven
mvn -version
# Saída esperada: Apache Maven 3.8.1 or later
```

### Instalação

1. **Clone o repositório**
   ```bash
   git clone https://github.com/gabrielsalesdavid/PROJECT-MAVEN-JAVA-WITH-LOMBOK
   cd PROJECT-MAVEN-JAVA-WITH-LOMBOK
   ```

2. **Compile o projeto**
   ```bash
   mvn clean compile
   ```

3. **Execute os testes**
   ```bash
   mvn test
   ```

4. **Gere o pacote JAR**
   ```bash
   mvn clean package
   ```

### Executar a Aplicação

```bash
# Usar Maven para executar
mvn exec:java -Dexec.mainClass="br.com.maven.fundamento.java.dio.App"

# Ou compilar e executar com Java
mvn compile
java -cp target/classes br.com.maven.fundamento.java.dio.App
```

**Saída Esperada:**
```
UserDTO(id=1, name=James, birthDay=2004-02-15)
UserMODEL(code=2, userName=Maria, birthDay=1994-02-15)
```

---

## 📚 Documentação

Este projeto inclui **1.431 linhas de documentação profissional e detalhada**.

### Documentos Disponíveis

#### 📖 [Fundamentos de Java](docs/Fundamentos/Java-Fundamentos.md)
Guia completo para iniciantes cobrindo:

- Introdução e características do Java
- Ambiente de desenvolvimento
- Tipos de dados (primitivos e referência)
- Variáveis e modificadores de acesso
- Operadores (aritméticos, lógicos, comparação)
- Estruturas de controle (if/else, switch, loops)
- Métodos e funções
- Programação Orientada a Objetos
- Packages e imports
- Boas práticas de codificação

**Tempo de leitura:** 2-4 horas | **Nível:** Iniciante

---

#### 🎓 [Conceitos Avançados de Java](docs/Conceitos/Java-Conceitos.md)
Referência sobre tecnologias e padrões avançados:

1. **Maven** (45 linhas)
   - Estrutura de projetos
   - Arquivo pom.xml
   - Escopos de dependência
   - Comandos comuns

2. **Lombok** (95 linhas)
   - Annotations principais
   - @Getter, @Setter, @NoArgsConstructor
   - @ToString, @EqualsAndHashCode, @Data
   - Exemplos práticos

3. **MapStruct** (75 linhas)
   - Mapeadores tipados
   - Interface Mapeadora
   - Mapeamento com @Mapping
   - Recursos avançados

4. **Data Transfer Object (DTO)** (45 linhas)
   - Conceito e benefícios
   - Separação de responsabilidades
   - Exemplo neste projeto
   - Quando usar

5. **Padrão Mapper** (45 linhas)
   - Transformação entre objetos
   - Vantagens
   - Aplicação em projetos

6. **Annotations** (85 linhas)
   - O que são annotations
   - Annotations nativas do Java
   - Customização

7. **Genéricos** (95 linhas)
   - Tipos parametrizáveis
   - Bounded Type Parameters
   - Wildcards

8. **Interfaces Funcionais** (80 linhas)
   - Lambda Expressions
   - Predicate, Function, Consumer
   - Method References

9. **Collections API** (95 linhas)
   - List, Set, Map
   - Stream API
   - Operações comuns

10. **Tratamento de Exceções** (75 linhas)
    - Try-catch-finally
    - Lançamento de exceções
    - Try-with-resources

**Tempo de leitura:** 3-5 horas | **Nível:** Intermediário/Avançado

---

## 💡 Exemplos Práticos

### 1. Usando Lombok para Reduzir Código

**Sem Lombok (muito código):**
```java
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
            ", birthDay=" + birthDay + '}';
    }
}
```

**Com Lombok (código limpo):**
```java
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

**Redução: 27 linhas → 8 linhas** ✅

---

### 2. Usando MapStruct para Mapeamento Tipado

```java
// Interface Mapper
@Mapper
public interface IUserMAPPER {
    @Mapping(target = "code", source = "id")
    @Mapping(target = "userName", source = "name")
    UserMODEL toModel(UserDTO dto);
    
    @Mapping(target = "id", source = "code")
    @Mapping(target = "name", source = "userName")
    UserDTO toDTO(UserMODEL model);
}

// Uso
public class App {
    private static final IUserMAPPER mapper = Mappers.getMapper(IUserMAPPER.class);
    
    public static void main(String[] args) {
        UserMODEL userModel = new UserMODEL();
        userModel.setCode(1);
        userModel.setUserName("James");
        userModel.setBirthDay(LocalDate.now().minusYears(20));
        
        // Converter Model para DTO
        UserDTO dto = mapper.toDTO(userModel);
        System.out.println(dto);  // UserDTO(id=1, name=James, birthDay=2004-02-15)
    }
}
```

---

### 3. Padrão DTO em Ação

```
Cliente → HTTP Request
  ↓
UserDTO (Transferência)
  ↓
Mapper (MapStruct)
  ↓
UserMODEL (Banco de Dados)
  ↓
Database
```

**Benefícios:**
- ✅ Segurança: Não expõe estrutura interna
- ✅ Flexibilidade: Estrutura diferente do Model
- ✅ Performance: Transfere apenas dados necessários
- ✅ Evolução: Mudanças no Model não afetam clientes

---

## 📦 Dependências

Todas as dependências estão configuradas no [pom.xml](pom.xml):

### Dependências de Compilação

```xml
<!-- MapStruct: Mapeamento de objetos -->
<dependency>
    <groupId>org.mapstruct</groupId>
    <artifactId>mapstruct</artifactId>
    <version>1.5.5.Final</version>
</dependency>

<!-- Lombok: Redução de boilerplate -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.30</version>
    <scope>provided</scope>
</dependency>

<!-- Binding: Compatibilidade Lombok + MapStruct -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok-mapstruct-binding</artifactId>
    <version>0.2.0</version>
</dependency>
```

### Dependências de Teste

```xml
<!-- JUnit: Testes unitários -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```

### Processadores de Annotations

```xml
<!-- Lombok Processor -->
<path>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.30</version>
</path>

<!-- MapStruct Processor -->
<path>
    <groupId>org.mapstruct</groupId>
    <artifactId>mapstruct-processor</artifactId>
    <version>1.5.5.Final</version>
</path>
```

---

## 🔧 Comandos Maven

### Básicos

| Comando | Descrição |
|---------|-----------|
| `mvn clean` | Remove diretório target |
| `mvn compile` | Compila código-fonte |
| `mvn test` | Executa testes |
| `mvn package` | Cria JAR/WAR |
| `mvn install` | Instala no repositório local |

### Combinados

```bash
# Limpar e compilar
mvn clean compile

# Limpar, compilar e testar
mvn clean test

# Limpeza completa e empacotamento
mvn clean package

# Executar a aplicação
mvn exec:java -Dexec.mainClass="br.com.maven.fundamento.java.dio.App"

# Gerar documentação (Javadoc)
mvn javadoc:javadoc
```

### Verificação de Dependências

```bash
# Ver árvore de dependências
mvn dependency:tree

# Ver dependências não usadas
mvn dependency:analyze

# Atualizar dependências
mvn dependency:update
```

---

## 📊 Estatísticas do Projeto

### Documentação

| Seção | Linhas | Palavras |
|-------|--------|----------|
| Fundamentos | 570 | ~3.500 |
| Conceitos Avançados | 861 | ~5.200 |
| Documentação Principal | 150+ | ~800 |
| **Total** | **1.431+** | **~9.500** |

### Código-Fonte

| Arquivo | Tipo | Linhas |
|---------|------|--------|
| App.java | Main | 30 |
| UserMODEL.java | Model | 19 |
| UserDTO.java | DTO | 10 |
| IUserMAPPER.java | Interface | 19 |
| AppTest.java | Teste | 20 |
| **Total** | **Java** | **98** |

### Configuração

| Arquivo | Tipo | Linhas |
|---------|------|--------|
| pom.xml | XML | 73 |
| .gitignore | Config | 24 |
| **Total** | **Config** | **97** |

---

## 🎓 Conceitos Cobertos

### Fundamentos
- ✅ Introdução a Java
- ✅ Tipos de dados
- ✅ Variáveis e escopos
- ✅ Operadores
- ✅ Estruturas de controle
- ✅ Métodos e funções
- ✅ POO (Programação Orientada a Objetos)
- ✅ Packages e imports

### Conceitos Avançados
- ✅ Maven e gerenciamento de dependências
- ✅ Lombok e redução de boilerplate
- ✅ MapStruct e mapeamento tipado
- ✅ Padrão DTO
- ✅ Padrão Mapper
- ✅ Annotations e processadores
- ✅ Genéricos
- ✅ Interfaces funcionais
- ✅ Collections API
- ✅ Tratamento de exceções

---

## 📝 Convenções de Código

### Nomenclatura

```java
// Classes: PascalCase
public class UserMODEL { }
public class App { }

// Métodos e variáveis: camelCase
private String userName;
public void setUserName(String userName) { }

// Constantes: UPPER_SNAKE_CASE
private static final String VERSION = "1.0";
private static final int MAX_USERS = 100;

// Packages: lowercase.domainreverse
package br.com.maven.fundamento.java.dio;
```

### Organização de Classe

```java
public class MinhaClasse {
    // 1. Constantes
    private static final String CONST = "valor";
    
    // 2. Atributos
    private String atributo;
    
    // 3. Construtores
    public MinhaClasse() { }
    
    // 4. Métodos públicos
    public void metodoPublico() { }
    
    // 5. Métodos privados
    private void metodoPrivado() { }
}
```

---

## 🔄 Fluxo de Desenvolvimento

```
┌─────────────────┐
│   Desenvolvimento     │
└──────────┬──────────┘
           │
           ▼
┌─────────────────┐
│   Compilação    │ (mvn compile)
└──────────┬──────────┘
           │
           ▼
┌─────────────────┐
│  Execução de     │ (mvn test)
│   Testes        │
└──────────┬──────────┘
           │
           ▼
┌─────────────────┐
│   Empacotamento │ (mvn package)
└──────────┬──────────┘
           │
           ▼
┌─────────────────┐
│   Deployment    │ (java -jar)
└─────────────────┘
```

---

## 🐛 Troubleshooting

### Problema: "Lombok annotations not found"
**Solução:** Certifique-se de que o IDE reconheça Lombok
```bash
# Para IntelliJ IDEA
# File → Settings → Plugins → Procure por "Lombok"
# Instale se não estiver presente
```

### Problema: "MapStruct mapper not generated"
**Solução:** Recompile o projeto
```bash
mvn clean compile
```

### Problema: "Java version mismatch"
**Solução:** Verifique a versão do JDK
```bash
java -version
javac -version
```

---

## 📂 Estrutura de Pacotes

```
br.com.maven.fundamento.java.dio
├── App.java                        # Classe principal
├── dto                             # Data Transfer Objects
│   └── UserDTO.java
├── model                           # Modelos de domínio
│   └── UserMODEL.java
└── mapper                          # Mapeadores
    └── IUserMAPPER.java
```

---

## 🔗 Recursos Externos

### Documentação Oficial

- [Java SE Documentation](https://docs.oracle.com/javase/11/docs/)
- [Maven Official Guide](https://maven.apache.org/guides/)
- [Lombok Documentation](https://projectlombok.org/features/all)
- [MapStruct User Guide](https://mapstruct.org/documentation/)
- [JUnit 4 Documentation](https://junit.org/junit4/)

### Tutoriais e Cursos

- [DIO.me - Formação Java](https://www.dio.me)
- [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/)
- [Baeldung Java Articles](https://www.baeldung.com/java-tutorial)

### Comunidades

- [Stack Overflow - Java](https://stackoverflow.com/questions/tagged/java)
- [GitHub Issues - Lombok](https://github.com/projectlombok/lombok/issues)
- [r/java - Reddit](https://www.reddit.com/r/java/)

---

## 💬 Suporte

Dúvidas ou sugestões?

1. Consulte a [Documentação de Fundamentos](docs/Fundamentos/Java-Fundamentos.md)
2. Consulte a [Documentação de Conceitos](docs/Conceitos/Java-Conceitos.md)
3. Abra uma issue no repositório
4. Faça um pull request com melhorias

---

## 📄 Licença

Este projeto segue a licença estabelecida no repositório.

---

## 👤 Autor

**Gabriel Sales David**  
Desenvolvedor | Estudante de Formação Java - DIO.me

---

## 📅 Histórico de Atualizações

| Data | Versão | Alterações |
|------|--------|-----------|
| 15/02/2026 | 1.0 | Primeira versão - Projeto completo com documentação |
| - | 1.1 | (em planejamento) Adicionar mais exemplos |
| - | 2.0 | (em planejamento) Integrar com Spring Boot |

---

## ✅ Checklist de Funcionalidades

- ✅ Estrutura Maven configurada
- ✅ Lombok integrado e funcionando
- ✅ MapStruct configurado para mapeamento
- ✅ Padrão DTO implementado
- ✅ Testes unitários com JUnit
- ✅ Documentação de Fundamentos (570 linhas)
- ✅ Documentação de Conceitos (861 linhas)
- ✅ Exemplos práticos
- ✅ Boas práticas documentadas
- ✅ README completo

---

## 🚀 Próximos Passos

1. **Estudar a Documentação**
   - Comece com [Fundamentos](docs/Fundamentos/Java-Fundamentos.md)
   - Depois explore [Conceitos](docs/Conceitos/Java-Conceitos.md)

2. **Praticar com o Código**
   - Modifique o `App.java`
   - Crie novas classes e DTOs
   - Implemente novos Mappers

3. **Expandir o Projeto**
   - Adicione banco de dados
   - Implemente uma API REST
   - Integre com Spring Boot
   - Adicione mais testes

4. **Compartilhar Conhecimento**
   - Contribua com melhorias
   - Compartilhe exemplos
   - Ensine a outras pessoas

---

## 📞 Contato

Para dúvidas, sugestões ou colaborações, abra uma **issue** ou faça um **pull request**.

---

**Versão do README:** 1.0  
**Última Atualização:** 15 de fevereiro de 2026  
**Status:** ✅ Completo e Pronto para Uso

---

<div align="center">

**⭐ Se este projeto foi útil para você, considere deixar uma estrela! ⭐**

[🔝 Voltar ao Topo](#-project-maven-java-with-lombok)

</div>
