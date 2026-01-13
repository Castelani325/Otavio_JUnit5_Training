# ☕Testes Automatizados com Java, Spring Boot e JUnit5

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Mockito](https://img.shields.io/badge/Mockito-78A32F?style=for-the-badge&logo=mocha&logoColor=white)
![Insomnia](https://img.shields.io/badge/Insomnia-black?style=for-the-badge&logo=insomnia&logoColor=5849BE)

> Repositório destinado ao aprendizado contínuo de testes automatizados (Unitários, Integração e Ponta a Ponta) seguindo as melhores práticas do mercado.

## 📚 Sobre o Projeto

Este projeto é resultado do estudo prático realizado através do curso **"Testes unitários em JAVA: Domine JUnit 5, Mockito e TDD"** na Udemy. O objetivo é dominar a pirâmide de testes, garantindo qualidade de software desde a camada de unidade até a integração com bancos de dados e APIs REST.

**Curso de referência:** [Java Unit Testing com Spring Boot 3, JUnit 5 e Mockito](https://www.udemy.com/course/java-unit-testing-com-java-spring-boot-3-junit-5-e-mockito/)

## 📒 Caderno de Estudos (Notion)

Durante o curso, faço anotações teóricas, salvo snippets de código e organizo referências importantes no Notion. Você pode acessar meu caderno de estudos abaixo:

🔗 **[Acessar Anotações no Notion](https://www.notion.so/DEV-Test-QA-2d6dc464b63d8086a152d14ff2b55248)**

## 🛠️ Tecnologias e Ferramentas

* **Java 17/21**
* **Spring Boot 3**
* **JUnit 5** (Jupiter)
* **Mockito** (Para Mockar comportamentos)
* **Rest Assured** (Para testes de API/E2E)
* **Insomnia** (Para testes manuais de API)
* **H2 Database** (Banco em memória para testes)
* **Lombok**
* **Maven**

## 🚀 Progresso dos Estudos

Abaixo, o acompanhamento dos módulos concluídos e tópicos dominados:

- [x] **Introdução ao JUnit 5**
    - [x] Ciclo de vida dos testes (`@BeforeEach`, `@AfterAll`, etc.)
    - [x] Assertions básicas e avançadas
    - [x] Testes parametrizados
- [x] **TDD (Test Driven Development)**
    - [x] Ciclo Red-Green-Refactor
- [ ] **Mockito e Testes Unitários**
    - [x] Uso de `@Mock` e `@InjectMocks`
    - [x] Stubbing ( `when(...).thenReturn(...)` )
    - [x] Verificação de chamadas (`verify`)
    - [x] Tratamento de Exceptions em testes
- [ ] **Testes de Integração com Spring Boot**
    - [ ] `@SpringBootTest` e Contexto do Spring
    - [ ] Testes de Repositories (DataJPA)
    - [ ] Testes de Services
    - [ ] Testes de Controllers
- [ ] **TestContainers** (Docker em testes)
- [ ] **Testes de API com Rest Assured**
    - [ ] Validação de Status Code
    - [ ] Validação de Body (JSON)
- [ ] **Cobertura de Código (Code Coverage)**
    - [ ] JaCoCo Plugin

## 📝 Cheat Sheet (Resumo Rápido)

Pequenos lembretes sobre anotações e métodos essenciais aprendidos durante o curso:

| Anotação / Método | Descrição |
| :--- | :--- |
| `@Test` | Identifica um método como um caso de teste. |
| `@DisplayName("...")` | Define um nome legível para o teste nos relatórios. |
| `@BeforeEach` | Executa antes de **cada** método de teste. |
| `@Mock` | Cria um objeto simulado (mock). |
| `@InjectMocks` | Injeta os mocks criados na classe que está sendo testada. |
| `Assertions.assertEquals(esp, atual)` | Verifica se o valor esperado é igual ao atual. |
| `Mockito.when(x).thenReturn(y)` | Define o comportamento: "Quando x for chamado, retorne y". |

## 🏁 Como Executar os Testes

Para rodar os testes localmente, certifique-se de ter o Maven e o JDK instalados.

1. Clone o repositório:
```bash
git clone [https://github.com/SEU-USUARIO/NOME-DO-REPO.git](https://github.com/SEU-USUARIO/NOME-DO-REPO.git)
