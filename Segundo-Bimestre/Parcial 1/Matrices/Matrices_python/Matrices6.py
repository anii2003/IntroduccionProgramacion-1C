print("")
# Inicializar las variables
i=0; j=0; m = 0; n = 0; k = 0; suma = 0; selec = 0; mayor = 0; aux = 0

# Ingresar los datos
m = int(input("Ingrese el número de trabajadores: "))
k = int(input("Ingrese el número de criterios a evaluar: "))
n = int(input("Número de aspirantes a seleccionar: "))

# Declarar el vector de trabajadores
codigo = [None]*m

# Ingresar los datos del vector código
for i in range (0, m):
    codigo[i] = input("Ingrese el nombre "+str(i)+": ")

# Declarar la matriz
C = []

for i in range (0, m):
    C.append([])
    for j in range (0, k):
        valor = int(input("Ingrese la calificación del criterio "+str(j)+" de "+str(codigo[i])+": "))
        C[i].append(valor)
        if ((C[i][j]>10) or (C[i][j]<0)):
            print("****Ingrese calificaciones dentro del rango de 0 a 10 puntos*****")
            print("***EL PROCESO HA FINALIZADO***")
            print("***REINICIE EL PROGRAMA")
            print("Los datos se obtendrán hasta antes del error detectado")
            j = k
            i = m

# Declarar el arreglo de la media
Media = [None]*m

print("***MEDIA***")
for i in range (0,m):
    for j in range (0, k):
        suma = suma + C[i][j]
        Media[i] = suma/k
    print(codigo[i],": ",Media[i],"    ")
    suma = 0

# Ordenar el vector Media
for i in range (0,m):
    for j in range (i+1, k):
        if (Media[i]>Media[j]):
            mayor = Media[i]

# Seleccionar los aspirantes para n puestos
Selec = [None]*n
aux1 = 0

for i in range (0,m):
    for j in range (0, k):
        if (Media [i] > Media[j]):
            aux = Media[i]
            Media[i] = Media[j]
            Media[j] = aux
            # Ordenar tambien el vector codigo
            aux1 = codigo[i]
            codigo[i] = codigo[j]
            codigo[j] = aux1

print("***ASPIRANTES SELECCIONADOS***")
print("Para ",n," puestos de trabajo: ")
for i in range (0, n):
    print(codigo[i]," es aspirante seleccionado con una media de: ",Media[i])
