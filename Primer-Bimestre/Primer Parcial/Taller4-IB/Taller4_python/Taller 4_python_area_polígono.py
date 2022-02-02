print("***Programa para calcular el área de un polígono compuesto***")
print("")

# Inicialización y declaración las variables
lc = 0; at = 0; ar = 0; A = 0; B = 0; D = 0
ats=0; area=0

# Entrada de datos
print("Ingrese el lado del cuadrado: ")
lc = float(input())
print("")

print("Ingrese la altura del triángulo")
at = float(input())
print("")

print("Ingrese la altura del rectángulo")
ar = float(input())
print("")

#Proceso
A = pow(lc,2)
B = (lc * at)/2
ats = (B * 3)
D = lc * ar
area = (A + ats + B)

#Salida de datos
print("El área total del polígono compuesto es:",+area,"con un cuadrado de área: ",+A,"\ncon tres triángulos rectángulos de área:",+ats,"y un rectángulo de área:",+D)
print("")