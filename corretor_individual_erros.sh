#!/bin/sh

path_erros=testes/erros/

# Todos os arquivos de teste
testes=($(ls -v $path_erros*.in))

javac -classpath src/ src/Main.java

# if genC doesnt exist
if [ ! -d genC/ ]; then
	mkdir genC/
else 
	rm genC/*
fi

for teste in "${testes[@]}"
do
	# Pega o nome do teste para colocar como arquivo de saida
	outfile=($(cut -d'/' -f3 <<<$teste | cut -d'.' -f1))

	java -classpath src/ Main $teste genC/$outfile.c

done

