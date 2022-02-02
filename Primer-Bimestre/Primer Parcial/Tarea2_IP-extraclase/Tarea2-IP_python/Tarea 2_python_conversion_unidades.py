print("***Programa para calcular el área de un polígono***""\n")

#Inicialización y declaración de variables
m = 0; cm = 0; km = 0; pies = 0; pulg = 0

# Entrada de datos
m = float(input("Ingrese la cantidad en metros: "))
print("")

# Proceso
cm = m*100
km = m/1000
pies = m*3.28084
pulg = m*39.3701

# Salida de datos
print("La cantidad de",+m, "metros, convertida a centímetros es:")
print(cm)
print("")

print("La cantidad de",+m, "metros, convertida a kilómetros es:")
print(km)
print("")

print("La cantidad de",+m, "metros, convertida a pies es:")
print(pies)
print("")

print("La cantidad de",+m, "metros, convertida a pulgadas es:")
print(pulg)
print("")