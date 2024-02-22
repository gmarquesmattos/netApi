# automacao_sicredi_api
|
|
## Dependências
| Plugin | Mais informações                                                   |
| ------ |--------------------------------------------------------------------|
| Rest-Assured | [https://mvnrepository.com/artifact/io.rest-assured/rest-assured]  |
| JUnit | [https://mvnrepository.com/artifact/io.cucumber/cucumber-junit]    |
 | TestNG | [https://mvnrepository.com/artifact/org.testng/testng] |


## Descrição dos cenários


|Descrição	| 	Resultado                                                                           |
| ------ |--------------------------------------------------------------------------------------|
|Realizar get na url dummyjson.com/test	|
Status code 2                                                                     |
|Realizar get na url /users"	| 	Status code 200                                                                     |
|Validação de login /login	| 		Status code 201                                                                    |
|Validar a busca de todos os produtos /products	| 	Status code 200
|Validar a busca de todos os produtos com autenticação /products	| 	Status code 200                                                                   |
|Validar a inclusao de um novo produto /add'"		| 	201|
|Validar a busca de um produto especifico/products/1	| 	Status code 200
|Validar teste de contrato de produto | deve retornar status code 200
|
## Observações - Pontos de melhoria

https://dummyjson.com/auth/login
status code está voltado 200... na doc deve voltar 201
O produto não está sendo inserido, mas no retorno está trazendo 200. mas ao pesquisar na lista de produtos não é encintrado nenhum novo produto

## Melhorias futuras automação Sicredi
* Finalizar a criação das pre condições para todos cenários.
* Deletar a massa usada na pre condição dos cenários.
* 

## Como Rodar

### Localmente
- Abrir o Intellij, ir em **File -> Open projeto.**
- Para executar todos os testes basta ir até o caminho: S* \src\test\java\br\com\sicredi\automacao\suites botão direito no arquivo SuiteSiebelWeb.xml na opção "Run"
- Suite é um arquivo que agrupa todos os cenários de testes.
