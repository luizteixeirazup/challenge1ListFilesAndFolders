## challenge1ListFilesAndFolders ##

PGG - Challenge 1 - List Files and Folders

A aplicação lista os arquivos de um diretório informado e de suas subpastas.

## Tecnologias:

* JDK 13.0.1

* Apache Maven 3.6.2

## Passos para setup da aplicação:

* 1) Clonar o repositório 

git clone https://github.com/luizteixeirazup/challenge1ListFilesAndFolders.git

* 2) Compilar e empacotar o projeto usando o Maven

folder challenge1ListFilesAndFolders

mvn clean install

* 3) Executar a extensão .jar por linha de comando, adicionando o parâmetro (folder pathname) que será analisado

java -jar challenge1ListFilesAndFolders-0.0.1-SNAPSHOT.jar "(folder pathname)"