import subprocess
import pip
import os
import json
import sys


def readinJsonFile(filename) :
	path = os.path.dirname(os.path.abspath(__file__))
	p=os.path.join(path,filename)
	json_temp=json.loads(open(p, encoding="utf-8").read())
	dependencies=json_temp['dependencies']

	notInstalledPackages=[]
	for key in dependencies:
		package=str(key)+"=="+str(dependencies[key])
		print("************************************** Installing package "+key+" ***************************************************")
		try:
			subprocess.check_call([sys.executable,'-m','pip','install',package])
		except Exception as e:
			notInstalledPackages.append(package)



	if len(notInstalledPackages)>0 :
		print("List of  not installed packages \n")
		for x in notInstalledPackages :
			print(x)
	else :
		print("Success")
	return ""

# Add  this dependency "simpleitk": "9.0" for more understanding in packge.json file 

readinJsonFile('package.json')

