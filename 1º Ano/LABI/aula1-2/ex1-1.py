import os.path
import sys 
import hashlib

if len (sys.argv) < 2 :
    print ("Usage: python3 %s filename" % (sys.argv[0]))
    sys.exit (1)
fname = sys.argv[1] # verify if it is a file
if not os.path.exists(fname) or os.path.isdir(fname) or not os.path.isfile(fname):
    print(fname + " is not a file", file=sys.stderr)
    sys.exit (2)



def encryptic(file_name):
    h = hashlib.sha1()
    with open(file_name, "rb") as file:
        chunk_size = 8192
        for chunk in iter(lambda: file.read(chunk_size), b''):
            h.update(chunk)
    return h.hexdigest()

try:
    sha1_digest = calculate_sha1(fname)
    print(f"SHA-1 hash of {fname}: {sha1_digest}")
except Exception as e:
    print(f"Error calculating SHA-1 hash: {str(e)}", file=sys.stderr)
    sys.exit(3)