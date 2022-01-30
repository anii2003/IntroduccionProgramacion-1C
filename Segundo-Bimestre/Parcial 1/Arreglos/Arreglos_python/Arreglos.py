print("")

# Inicializar las variables
i = 0; n = 0; suma = 0; prom = 0; mayor = 0

# Ingresar los datos
n = int(input("Ingrese el número de notas: "))

# Vector
Notas = [None] * n
Nombres = [None] * n

# Ingresar las notas al vector 

for i in range (0,n):
    Nombres[i] = input("Ingrese el nombre: ")
    print(Nombres[i]+" corresponde al nombre A["+str(i)+"]")
    Notas[i] = int(input("Ingrese la nota de "+Nombres[i]+": "))

# Calcular la suma de las notas

for i in range (0,n):
    suma = suma + Notas[i]

# Promedio de las notas
for i in range (0,n):
    prom = suma/(n-1)

# Presentar los elementos vector notas
print("***Las notas son***")

for i in range (0,n):
    print("Notas [",i,"] = ",Notas[i])

print("")
print("El promedio de las notas es: ",prom)

# Nota más alta

mayor = Notas[0]

for i in range (0,n):
    if (Notas[i] > mayor):
        mayor = Notas[i]
        #print("-----",mayor)
print("La nota mayor del arreglo es: ",mayor)

print("----Las notas en las posiciones impares son: ")
for i in range (0, n):
    if (i % 2 != 0):
        print("Notas [",i,"] = ",Notas[i])

print("\nNOTAS Y NOMBRES DE ESTUDIANTES\n")
for i in range (0, n):
    print(Nombres[i]+" tiene una nota de: ",Notas[i])

print("")
