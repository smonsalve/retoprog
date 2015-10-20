#!/usr/bin/env python

# read file
# read testcases
# read n
# create bool vector from 0 to n
# check for the false value
# each test case
# # out number

#________________________________________________________

# theinput = open("in.txt","r")
# theoutput = open("out.txt","w")

# while True:
# 	line = theinput.readline() 
# 	theoutput.write(line)	
# 	if len(line) == 0: break

# theinput.close
# theoutput.close

#________________________________________________________

import numpy as np
f = open("in.txt","r")
theoutput = open("out.txt","w")

casos = int(f.readline())
#print casos,

for i in range(0,casos):
	for line in f:
	    for s in line.split(' '):
    	 	num = int(s)
      		print num
		#	tam = int(f.readline())
	#print tam,
#	print linea,
	# for s in linea.split(' '):
 #     	num = int(s)
 #       	print num
	#print line,
thelist = np.full((10),0)
print thelist
