# Java_Conect_Database
 Programas em java com interface gráfica em swing que se conectam a diversas databases em SQL

### Programa 1 
![java_sql_01](https://github.com/willianpireslima/Java_Conect_Database/assets/158337302/ba731f8c-435b-48ec-9172-d5c53309f171)

#### Conexão com o banco de dados exemplo 

Class.forName("com.mysql.cj.jdbc.Driver");\
//Iniciando uma instancia com a conexao da database\
//por meio meio da url contendo nome host,porta, usuario ,senha\
Connection con = DriverManager.getConnection(\
"jdbc:mysql://localhost:3306/simples","root","1234");\
    
//inserindo dados na tabela\
Statement stm = con.createStatement();\
String sql = "Insert INTO produto VALUES ('"+id+"','"+nome+"','"+precos+"')";\
stm.executeUpdate(sql); //inserindo a consulta\
  
//feachando a conexao\
con.close();

#### Criacao da Tabelas exemplo

CREATE TABLE Produto (\
    id_produto SMALLINT,\
    nome_produto VARCHAR(50),\
    preco DECIMAL(10, 2),\
    PRIMARY KEY (id_produto)\
);

CREATE TABLE Pedido (\
    id_pedido SMALLINT ,\
    data_pedido DATE,\
    quantidade INT,\
    id_produto SMALLINT,\
    PRIMARY KEY (id_pedido),\
    FOREIGN KEY (id_produto) REFERENCES Produto(id_produto)\
);

### Programa 2
![java_sql_02](https://github.com/willianpireslima/Java_Conect_Database/assets/158337302/9bedce7c-cdde-4c77-b718-1f3d91c6c8bd)

### Programa 3
![java_sql_03](https://github.com/willianpireslima/Java_Conect_Database/assets/158337302/e85c73a8-c0e6-4883-ae7b-31d0307d64d6)




