"""Ejercicio 4.4 - 13. Libro de Mancilla. Pág 270

Dada una matriz m x n, realice un algoritmo para voltearla de izquierda a derecha"""

print("")

# Inicializar las variables
m = 0; n = 0

# Ingresar el tamaño de la matriz
m = int(input("Ingrese el número de filas: "))
n = int(input("Ingrese el número de columnas: "))

# Declarar la matriz
A = []

# Recorrer la matriz e ingresar sus datos
print("\nIngresar los elementos de la matriz:")
for i in range (0, m):
    A.append([])
    for j in range (0, n):
        valor = int(input("A["+str(i)+"]["+str(j)+"]: "))
        A[i].append(valor)

# Presentar la matriz original
print("\n***MATRIZ ORIGINAL***")
for i in range (0, m):
    for j in range (0, n):
        print(A[i][j], end="\t")
    print("")

# Voltear la matriz de izquierda a derecha
print("\n***MATRIZ VOLTEADA DE IZQUIERDA A DERECHA***")
for i in range (0, m, +1):
    for j in range (n-1, -1, -1):
        print(A[i][j], end="\t")
    print("")