# SingletonConfigManager

Padrão de Projeto Singleton
1.1 — Problema que o Singleton Resolve

Em alguns cenários de desenvolvimento, é necessário garantir que apenas uma instância de uma classe exista em todo o sistema. Isso acontece quando o recurso controlado por essa classe precisa ser:

Único

Centralizado

Compartilhado por vários módulos

Controlado de forma segura

Situações reais em que isso ocorre:

✔ Gerenciador de Configurações

Aplicações precisam de configurações globais (arquivos .properties, .json, .env). Se varias instâncias modificassem configurações simultaneamente, haveria inconsistência.

✔ Logger (Registro de Logs)

Logs precisam ser centralizados para não gerar arquivos duplicados ou fora de ordem.

✔ Conexão com Banco de Dados

Criar múltiplas conexões sem controle pode esgotar recursos e travar o sistema.

✔ Contador Global ou Gerenciador de Sessões
✔ Acesso a Hardware ou Recursos Exclusivos

Por exemplo, acesso à impressora, câmera, serviços do sistema.

O problema central:

Como garantir que haverá apenas uma única instância, acessível globalmente, e criada de forma controlada?

1.2 — Solução Proposta pelo Singleton

O padrão Singleton oferece uma solução simples:

✔ 1. Restringir a criação de instâncias

O construtor é privado, impossibilitando new Singleton() no código externo.

✔ 2. Criar uma instância estática dentro da própria classe

Essa instância será a única durante toda a execução.

✔ 3. Fornecer um método de acesso global

Geralmente chamado de:

getInstance()

✔ 4. Controle de concorrência (Thread-Safety)

Em sistemas multithread, duas threads poderiam criar instâncias simultâneas.

Para evitar isso, existem técnicas como:

sincronização com synchronized

double-checked locking

inicialização estática garantida pela JVM

Se a aplicação for simples, não exige thread-safety.

1.3 — Diagrama UML do Singleton

````md
```mermaid
classDiagram
    class Singleton {
        -instance : Singleton
        -Singleton()
        +getInstance() : Singleton
    }
