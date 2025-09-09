@echo off
REM Compila todas as classes Java
javac -encoding UTF-8 src/com/iniflex/industria/*.java

REM Navega para a pasta de classes e executa o programa
cd src
java -Dfile.encoding=UTF-8 com.iniflex.industria.Principal

REM Volta para a pasta raiz
cd ..

pause