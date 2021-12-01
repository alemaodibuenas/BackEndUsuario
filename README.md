# BackEndUsuario

Api Java contruida usando SpringToolSuite.

 #GET: método utilizado para ler e recuperar dados. Requisita uma representação do recurso especificado e retorna essa representação.
  
 #POST: método utilizado para criar um novo recurso. Envia dados ao servidor. O tipo do corpo da solicitação é indicado pelo cabeçalho Content-Type.
  
 #PUT: cria um novo recurso ou substitui uma representação do recurso de destino com os novos dados. A diferença entre PUT e POST é que PUT é idempotente: ao chamá-lo uma ou           várias vezes sucessivamente o efeito é o mesmo, enquanto se chamar o POST repetidamente pode ter efeitos adicionais. Por exemplo, se criarmos um produto com POST, se a URL         definida na API for chamada 20 vezes, 20 produtos serão criados e cada um deles terá um ID diferente. Já o com o PUT se você executar a URL definida na API 20 vezes, o             resultado tem que ser o mesmo: o mesmo produto atualizado 20 vezes.
    
 #DELETE: exclui o recurso.

#Acessar o banco H2
http://localhost:8080/h2-console
