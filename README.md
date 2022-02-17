# java-practice

>**2º teste**
<br>Guardar as classes todas.
<br>Importar o que for preciso.
<br>Validar {} ; e ().
Numero de serviço comeca a zero.

>**Alterar no teste**
<br>Metodos _trabalhar();_ e _avariar();_ -> alterar retorno de String para void (facilitar o output da verificação);
<br>Criar um metodo para retornar mensagem e ser chamada quando for precisa;
<br>Verificar o metodo _adicionarReboques_;
<br>Verificar se _reboques_ ficou da melhor maneira;

>##Linguagem de programação java:
> **3º teste** : _17/02/2022_
><p>Teste escrito (22 perguntas com a opção de não responder a 2 delas): escolha multipla: respostas mais diretas;</p>
>int permite nulo?
><br>try / catch;
><br>Getters, Setters, construtores;
><br>Divide by 0;
><br>Qual dos catches entra: mais geral ou aritmético.
><br>Pai tem protected. Os filhos herdam?

>**Matéria:**
><br>**Try/catch**
<br>Uma excepção pode ser trabalhada na função ou fora dela.
<br>A partir do momento que passa no catch, não lê o restante código.
> O Java precisa de um servidor aplicacional (rest)?

>**10/02/2022**
<br>Variavéis estáticas (auto-incrementais);
><br>**Getters and Setters ->** são utilizados para debug: para conseguir acompanhar alterações.
> <br>
> <br>
> **Pedidos HTTP**
> <br>Query params: GET construção/composição -> dados utilizados no url para saber algo.
><br> Body params: POST(submit) (ex:formulários), serve para enviar dados.
><br>Headers: Proxy - VPN (rederecionamento); caches; cookies; linguagem; informação sobre o body da mensagem.
> 
>###Erros
> 1xx -> Informativos
><br> 2xx -> 
><br> 3xx -> 
><br> 4xx -> 
><br> 5xx -> 

### API
- Facilitar a troca de informação entre sistemas com diferentes linguagens de programação.
- Conector/interface que faz a interligação entre diferentes aplicações/sistemas

### CRUD
- Create Retrieve Update Delete
- POST, GET, PUT, DELETE

### API SOAP
- Mais complexo mas mais seguro.
- Só permite a utilização de XML.
- Regras restritas.

### Query params:
#### url structure:
http://www.site.com/page.html?parameter1=[@field:fieldname1]&parameter2=[@field:fieldname2]
 
- url: até ao ? -> http://www.site.com/page.html (endpoint)
- query String Begin: ?
- query param structure: (conjuto de pares Key-value) nome_param=valor_param
- query string separator: &

### Headers and Body
- Um GET não tem body.
- Todos os pedidos podem ter headers.
- O body do POST ou do PUT pode ir em Json ou form-data.
- Headers -> Permitem que o cliente e o servidor passem informações adicionais; 
  - É onde são definidas propriedades de:
    - Autorização/Segurança, Proxy, Cache, Cookies, Linguagem, Informações sobre o body da mensagem, Etc.

### Erros respostas

- 1xx – Informativos
- 2xx – Indicativos de sucesso
- 3xx – Redirecionamentos
- 4xx – Erros de cliente
- 5xx – Erros no lado do servidor

#### Erros mais comuns:
- Erro 403 — Proibido
- Erro 404 — Não encontrado
- Erro 500 — Erro interno do servidor
- Erro 503 — Serviço Indisponível
- Erro 504 — Gateway Timeout

### Exceções:
- Consiste na ocorrência de imprevistos (exceções) durante a execução do programa.
- Podem ser erros de lógica, acesso a dados/variáveis ou fatores externos que impossibilitam o correto funcionamento da aplicação.


- Possíveis exceções:
  - Aceder um objeto que não existe;
  - Tentar comunicar sem haver ligação;
  - Acesso a um objeto ainda não inicializado;
  - Divisão de um número por 0;

- Exemplo try catch with finally:

        try {
            validar(nome);
            validar("Juan");
            validar("Ju");
            validar(null);
            validar("Leticia");

        } catch (SemLetraException exception){
            System.out.println("1st Catch: ocorreu um erro: " + exception.getMessage());
        } catch (NullPointerException exception){
            System.out.println("2nd Catch exception: " + exception.getMessage());
        } finally {
            System.out.println("""
                    O finally corre sempre!
                    Funciona do género de 'sc.close'.
                    Fica sempre depois do último 'catch'.
                    """);
        }
 
### Streams

#### map -> transformar cada elemento.
#### filter -> seleciona quais os elementos que ficam na lista (true fica, falso exclui).

    List<String> myList = Arrays.asList("a1","a2", "b1", "c2", "c1");

    List<Integer> newList = myList.stream()
            .map(s -> s.toUpperCase())
            .filter(s -> s.toUpperCase().startsWith("C"))
            .map(s -> s.replace("C",""))
            .map(s -> Integer.parseInt(s))
            .toList();
    System.out.println(newList);