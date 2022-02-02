# Inicializar las variables
n=0; i=0; j=0

# Declarar el tamaño de la matriz
print("---OPERACIONES SOBRE MATRICES CUADRADAS---")
n = int(input("Ingrese el tamaño de la matriz cuadrada: "))

# Recorrer la matriz e ingresar los elementos de la matriz
A =  []

print("Ingresar los elementos de la matriz")
for i in range (0, n):
    A.append([])
    for j in range (0, n):
        valor = int(input("A["+str(i)+"]["+str(j)+"] = "))
        A[i].append(valor)

print("\n---Matriz Original---")
for i in range (0, n):
    for j in range (0, n):
        print(A[i][j], end="   ")
    print(" ")

print("\nCambiar por cero la diagonal principal")
for i in range (0, n):
    for j in range (0, n):
        if (i==j):
            A[i][j] = 0

print("\nPresentar nuevamente la matriz-")
for i in range (0, n):
    for j in range (0, n):
        print(A[i][j], end="   ")
    print(" ")

print("\nCambiar por 1 la diagonal secundaria")
for i in range (0, n):
    for j in range (0, n):
        if (i+j == n-1):
            A[i][j] = 1

print("\nPresentar nuevamente la matriz-")
for i in range (0, n):
    for j in range (0, n):
        print(A[i][j], end="   ")
    print(" ")

print("\nCambiar por 99 las esquinas de la matriz")
A[0][0] = 99
A[0][n-1] = 99
A[n-1][0] = 99
A[n-1][n-1] = 99

print("\nPresentar nuevamente la matriz-")
for i in range (0, n):
    for j in range (0, n):
        print(A[i][j], end="    ")
    print("  ")