#Anagram Detector

partOne = ""
partTwo = ""
x = 0

anagram = input("Enter in your anagram and seperate with a ? mark.")
#anagram.replace(" ", "")  #removes empty spaces .strip() cna be used to remove leading and ending spaces, replace() removes all
print (anagram)

while (anagram[x] != '?'):
    partOne += anagram[x]
    x += 1

x += 1
while (x < len(anagram)):
    partTwo += anagram[x]
    x += 1

partOne = partOne.lstrip()     #removes any leading spaces
partTwo = partTwo.lstrip()     #removes any leading spaces

if (sorted(partOne.strip()) == sorted(partTwo.strip())):        #the .strip removes spaces and sorted puts them alphabetically and compares
    print("Is anagram")
else:
    print ("Not Anagram")

def stringContainChar(letter, string):
    for i in range(len(string)):
        if (letter == string[x]):
            return True
        else:
            return False