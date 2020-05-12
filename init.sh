#!/bin/bash

echo "Empacotando serviços"

cd Tanques && mvn clean package && cd ..

cd Reator && mvn clean package && cd ..

cd Decantador && mvn clean package && cd ..

cd Lavagem && mvn clean package && cd ..

cd Secagem && mvn clean package && cd ..