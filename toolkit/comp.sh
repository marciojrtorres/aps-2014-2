#!/bin/bash
echo Compilando ...
javac -cp bin src/toolkit/Calc.java -d bin
javac -cp bin src/toolkit/StringUtil.java -d bin
javac -cp bin src/toolkit/Main.java -d bin