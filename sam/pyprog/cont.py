import numpy as np

f = open("in.txt","r")
for i in range(0,int(f.readline())):
	thelist = np.full((int(f.readline())+1),0)
	thelist[0]=1
	line = f.readline()
	for s in line.split(): thelist[int(s)]=1
	for i in range(0,thelist.size):
		if thelist[i]==0: print i 			