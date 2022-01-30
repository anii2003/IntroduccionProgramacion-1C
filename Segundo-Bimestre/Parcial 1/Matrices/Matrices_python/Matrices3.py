# Inicializar las variables
n=0; i=0; j=0

# Ingresar el tamaño de la matriz
print("---EJERCICIO 4 - MATRICES---")
n = int(input("Ingrese el tamaño de la matriz: "))

# Declarar la matriz
A =  []

# Recorrer la matriz e ingresar los elementos de la matriz
print("Ingresar los elementos de la matriz")
for i in range (0, n):
    A.append([])
    for j in range (0, n):
        valor = int(input("A["+str(i)+"]["+str(j)+"] = "))
        A[i].append(valor)

# Presentar los elementos de la matriz
print("\nMATRIZ A ORIGINAL")
for i in range (0, n):
    for j in range (0, n):
        print(A[i][j], end="   ")
    print(" ")

# Matriz con elementos pares reemplazados"
for i in range (0, n):
    for j in range (0, n):
        if (A[i][j] % 2 == 0):
            A[i][j]=0

print("\nMatriz A cambiando números pares por 0")
for i in range (0, n):
    for j in range (0, n):
        print(A[i][j], end="   ")
    print(" ")

print("\nMatriz cuando i o j sea n-1")
for i in range (0, n):
    for j in range (0, n):
        if ((i==n-1) or (j==n-1)):
            A[i][j] = 1

for i in range (0, n):
    for j in range (0, n):
        print(A[i][j], end="   ")
    print(" ")

print("\nLa matriz A según su posición es: ")
for i in range (0, n):
    for j in range (0, n):
        print("("+str(i)+")("+str(j)+")", end="   ")
    print(" ")

print("\nPresentar la matriz A cambiando números pares por 0 ")
for i in range (0, n):
    for j in range (0, n):
        print(A[i][j], end="   ")
    print(" ")