#!/bin/bash
echo Compilando ...
javac -cp bin src/modelo/MonitoraAgua.java -d bin
javac -cp bin src/modelo/MonitoraAguaAperfeicoado.java -d bin
javac -cp bin src/modelo/Agua.java -d bin
javac -cp bin src/modelo/Main.java -d bin