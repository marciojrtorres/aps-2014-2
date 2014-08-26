#!/bin/bash
echo Compilando ...
rm -r bin    # rd /s/y bin
mkdir bin    # md bin
javac -cp bin:../modelo/dist/modelo.jar src/apresenta/MonitoraAgua.java -d bin
javac -cp bin:../modelo/dist/modelo.jar src/apresenta/Main.java -d bin