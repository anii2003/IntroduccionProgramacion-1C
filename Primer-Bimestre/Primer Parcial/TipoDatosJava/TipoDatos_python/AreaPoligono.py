print("")
print("***Programa para calcular el área de un polígono *** \n")
print("----------------------------------------------------")
print("")


# Ingrese los datos

nombre = input("Ingrese el nombre del usuario: ")

A = float(input("Ingrese la altura del terreno (A): "))
B = float(input("Ingrese la base del terreno (B): "))
C = float(input("Ingrese la altura del rectángulo (C): "))
print("")

#Proceso

alTriag = A - C
areaT = (B*alTriag) / 2
areaR = B * C
areaTotal = areaT + areaR

print("El área del triángulo del terreno es: ",areaT, "\n")
print("El área del rectángulo del terreno es: " ,areaR,"\n")
print("El área total del terreno es: " ,areaTotal,"\n")
 