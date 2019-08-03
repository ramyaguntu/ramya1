#!/bin/bash  
while read line 
do
sed -i "2i $line" ./ansible-folder/inventory
done < "webserver"
