# Matriz donde se reemplace por 0 aquellos valores 
# que se encuentren por encima de la diagonal menor

print("")
n = int(input("Ingrese el tamaño de la matriz: "))

# Declarar la matriz
A = []

# Recorrer la matriz e ingresar los elementos de la matriz
print("\nIngresar los elementos de la matriz")
for i in range (0, n):
    A.append([])
    for j in range (0, n):
        valor = int(input("A["+str(i)+"]["+str(j)+"]: "))
        A[i].append(valor)

print("\nLa matriz A es: ")
for i in range (0, n):
    for j in range (0, n):
        print(A[i][j], end="   ")
    print("")

print("\nMatriz reemplazada por ceros")
for i in range (0, n):
    for j in range (0, n):
        if (j>i):
            A[i][j] = 0

# Imprimir la matriz reemplazada por 0 a aquellos valores 
# que se encuentren por encima de la diagonal menor

for i in range (0, n):
    for j in range (0, n):
        print(A[i][j], end="   ")
    print("")