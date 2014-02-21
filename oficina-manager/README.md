# Gerenciador de oficinas.
Sistema de gerenciamento de uma oficina. 

# Ambiente de Desenvolvimento
 1. Jboss AS 7.1.0 Final
 2. Eclipse com Jboss Tools
 3. JSF 2.0 + Primefaces
 
# Base de dados
 Atualmente o projeto está configurado para rodar em postgres ou mysql.
 
 Passos para instalar o datasource e o driver do banco de dados no jboss.
 1. Iniciar o servidor de aplicação e acessar o Admin Console.(http://localhost:9990/console)
 2. Na aba Runtime, ir para seção Deployments  > Manage Deployments
 3. Clicar no botão 'Add Content' para adicionar o driver e os arquivos *-ds.xml(Dentro de META-INF)
 4. Clicar no botão 'Enable'.

# Em Desenvolvimento
 1. Crud de clientes.(Cadastro, Atualização, Listagem, Deleção)

# Proximas atividades
 1. Configurar propriedades do datasource no persistence.xml para pegar valores de um arquivo de propriedades.
 2. Crud de Peças.(Cadastro, Atualização, Listagem, Deleção)
 3. Crud de Fornecedores.(Cadastro, Atualização, Listagem, Deleção)