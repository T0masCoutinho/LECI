import csv
import sys

def main(argv):
    temperatures = []
    fich_csv = open(argv[1], "r")
    csv_reader = csv.reader(fich_csv, delimiter=",")
    for row in csv_reader:
            print(row)
            # Convert the temperature column to float and append to the list
            temperature = float(row[2])
            temperatures.append(temperature)
    
    # Calculate and print maximum, minimum, and average temperatures
    print("Maximum temperature:", max(temperatures))
    print("Minimum temperature:", min(temperatures))
    print("Average temperature:", sum(temperatures) / len(temperatures))

main(sys.argv)