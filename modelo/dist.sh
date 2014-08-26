#!/bin/bash
sh comp.sh
echo Distribuindo ...
rm -r dist
mkdir dist
jar cfv dist/modelo.jar -C bin .
# create file verbose
# nome do jar: modelo.jar, diretorio das classes: bin, conteudo: .