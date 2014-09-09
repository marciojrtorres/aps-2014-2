#!/bin/bash
echo Compilando ...
rm -r bin    # rd /s/y bin
mkdir bin    # md bin
# padrao Observer/Observable
javac -cp bin src/modelo/State.java -d bin
javac -cp bin src/modelo/TempChangeEvent.java -d bin
javac -cp bin src/modelo/StateChangeEvent.java -d bin
javac -cp bin src/modelo/AguaListener.java -d bin
#
javac -cp bin src/modelo/Peso.java -d bin
javac -cp bin src/modelo/Patrimonio.java -d bin
javac -cp bin src/modelo/Agua.java -d bin
javac -cp bin src/modelo/Telefone.java -d bin
javac -cp bin src/modelo/Cliente.java -d bin
javac -cp bin src/modelo/Main.java -d bin