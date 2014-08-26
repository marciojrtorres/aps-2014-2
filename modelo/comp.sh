#!/bin/bash
echo Compilando ...
rm -r bin    # rd /s/y bin
mkdir bin    # md bin
javac -cp bin src/modelo/IMonitoraAgua.java -d bin
javac -cp bin src/modelo/Agua.java -d bin